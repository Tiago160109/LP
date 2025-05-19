
package br.cefetmg.inf.lista02_2318;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matrix = new int[3][3];
        for (int row = 0; row < 3; row++)
            for (int col = 0; col < 3; col++)
                matrix[row][col] = input.nextInt();

        int[][] varIdx = new int[3][3];
        int varCount = 0;
        for (int row = 0; row < 3; row++)
            for (int col = 0; col < 3; col++)
                varIdx[row][col] = matrix[row][col] == 0 ? varCount++ : -1;

        int sumIdx = varCount++;
        List<double[]> equations = new ArrayList<>();

        for (int row = 0; row < 3; row++) {
            double[] eq = new double[varCount + 1];
            double sumKnown = 0;
            for (int col = 0; col < 3; col++) {
                if (varIdx[row][col] >= 0) {
                    eq[varIdx[row][col]] = 1;
                } else {
                    sumKnown += matrix[row][col];
                }
            }
            eq[sumIdx] = -1;
            eq[varCount] = -sumKnown;
            equations.add(eq);
        }

        for (int col = 0; col < 3; col++) {
            double[] eq = new double[varCount + 1];
            double sumKnown = 0;
            for (int row = 0; row < 3; row++) {
                if (varIdx[row][col] >= 0) {
                    eq[varIdx[row][col]] = 1;
                } else {
                    sumKnown += matrix[row][col];
                }
            }
            eq[sumIdx] = -1;
            eq[varCount] = -sumKnown;
            equations.add(eq);
        }

        double[] diag1 = new double[varCount + 1];
        double sumDiag1 = 0;
        for (int i = 0; i < 3; i++) {
            if (varIdx[i][i] >= 0) {
                diag1[varIdx[i][i]] = 1;
            } else {
                sumDiag1 += matrix[i][i];
            }
        }
        diag1[sumIdx] = -1;
        diag1[varCount] = -sumDiag1;
        equations.add(diag1);

        double[] diag2 = new double[varCount + 1];
        double sumDiag2 = 0;
        for (int i = 0; i < 3; i++) {
            int j = 2 - i;
            if (varIdx[i][j] >= 0) {
                diag2[varIdx[i][j]] = 1;
            } else {
                sumDiag2 += matrix[i][j];
            }
        }
        diag2[sumIdx] = -1;
        diag2[varCount] = -sumDiag2;
        equations.add(diag2);

        int numEq = equations.size();
        int numVar = varCount;
        double[][] augmented = new double[numEq][numVar + 1];
        for (int i = 0; i < numEq; i++) {
            augmented[i] = equations.get(i);
        }

        int rowIdx = 0;
        for (int colIdx = 0; colIdx < numVar && rowIdx < numEq; colIdx++) {
            int pivotRow = rowIdx;
            for (int r = rowIdx; r < numEq; r++) {
                if (Math.abs(augmented[r][colIdx]) > Math.abs(augmented[pivotRow][colIdx])) {
                    pivotRow = r;
                }
            }
            if (Math.abs(augmented[pivotRow][colIdx]) < 1e-9) {
                continue;
            }
            double[] tmp = augmented[rowIdx];
            augmented[rowIdx] = augmented[pivotRow];
            augmented[pivotRow] = tmp;

            double pivVal = augmented[rowIdx][colIdx];
            for (int c = colIdx; c <= numVar; c++) {
                augmented[rowIdx][c] /= pivVal;
            }
            for (int r = 0; r < numEq; r++) {
                if (r != rowIdx) {
                    double factor = augmented[r][colIdx];
                    for (int c = colIdx; c <= numVar; c++) {
                        augmented[r][c] -= factor * augmented[rowIdx][c];
                    }
                }
            }
            rowIdx++;
        }

        double[] solution = new double[numVar];
        for (int r = 0; r < numEq; r++) {
            int lead = -1;
            for (int c = 0; c < numVar; c++) {
                if (Math.abs(augmented[r][c]) > 1e-9) {
                    lead = c;
                    break;
                }
            }
            if (lead >= 0) {
                solution[lead] = augmented[r][numVar];
            }
        }

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (matrix[row][col] == 0) {
                    matrix[row][col] = (int) Math.round(solution[varIdx[row][col]]);
                }
            }
        }
        for (int row = 0; row < 3; row++) {
            System.out.println(
                matrix[row][0] + " " +
                matrix[row][1] + " " +
                matrix[row][2]
            );
        }
    }
}