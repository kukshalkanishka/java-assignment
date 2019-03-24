package com.step.matrix;

import java.util.ArrayList;
import java.util.List;

class Matrix {
    private final int numOfRows;
    private final int numOfCols;
    private List<ArrayList<Integer>> matrix;

    Matrix(List<ArrayList<Integer>> matrix) {
        this.matrix = matrix;
        this.numOfRows = matrix.size();
        this.numOfCols = matrix.get(0).size();
        matrix = new ArrayList<>();
    }

    Matrix add(Matrix otherMatrix) {
        List<ArrayList<Integer>> sum = new ArrayList<>();

        for (int row = 0; row < numOfRows; row++) {
            for (int column = 0; column < numOfCols; column++) {
                sum.add(new ArrayList<>());
                ArrayList<Integer> currentRow = sum.get(row);
                Integer value1 = this.matrix.get(row).get(column);
                Integer value2 = otherMatrix.matrix.get(row).get(column);
                currentRow.add(column, value1 + value2);
            }
        }
        return new Matrix(sum);
    }

    boolean isEqual(Matrix otherMatrix) {

        if (this == otherMatrix) return true;
        if (otherMatrix == null || getClass() != otherMatrix.getClass()) return false;

        for (int row = 0; row < numOfRows; row++) {
            for (int column = 0; column < numOfCols; column++) {

                Integer cellValue1 = matrix.get(row).get(column);
                Integer cellValue2 = otherMatrix.matrix.get(row).get(column);

                if (!cellValue1.equals(cellValue2)) {
                    return false;
                }
            }
        }
        return true;
    }

    private int getCellMultiplication(Matrix otherMatrix, int row, int chance) {
        int cellMultiplication = 0;
        for (int col = 0; col < numOfCols; col++) {
            cellMultiplication += matrix.get(row).get(col) * otherMatrix.matrix.get(col).get(chance);
        }
        return cellMultiplication;
    }

    Matrix multiply(Matrix otherMatrix) {
        List<ArrayList<Integer>> multiplication = new ArrayList<>();
        for (int row = 0; row < numOfRows; row++) {
            multiplication.add(new ArrayList<>());
            for (int chance = 0; chance < numOfCols; chance++) {
                multiplication.get(row).add(chance, getCellMultiplication(otherMatrix, row, chance));
            }
        }
        return new Matrix(multiplication);
    }

    @Override
    public String
    toString() {
        return "Matrix{" +
                "matrix=" + matrix +
                '}';
    }

    Matrix transpose() {
        List<ArrayList<Integer>> transpose = new ArrayList<>(matrix);

        for (int row = 0; row < numOfRows; row++) {
            for (int column = 0; column < numOfCols; column++) {
                ArrayList<Integer> transposeRow = new ArrayList<>(transpose.get(column));
                transposeRow.set(row, matrix.get(row).get(column));
                transpose.set(column, transposeRow);
            }
        }
        return new Matrix(transpose);
    }
}
