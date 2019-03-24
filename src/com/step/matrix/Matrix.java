package com.step.matrix;

import java.util.ArrayList;
import java.util.List;

class Matrix<T> {
    protected final int numOfRows;
    protected final int numOfCols;
    protected final List<ArrayList<T>> matrix;

    Matrix(List<ArrayList<T>> matrix) {
        this.matrix = matrix;
        this.numOfRows = matrix.size();
        this.numOfCols = matrix.get(0).size();
        matrix = new ArrayList<>();
    }

    boolean isEqual(Matrix<T> otherMatrix) {

        if (this == otherMatrix) return true;
        for (int row = 0; row < numOfRows; row++) {
            for (int column = 0; column < numOfCols; column++) {

                T cellValue1 = matrix.get(row).get(column);
                T cellValue2 = otherMatrix.matrix.get(row).get(column);

                if (!cellValue1.equals(cellValue2)) {
                    return false;
                }
            }
        }
        return true;
    }


    @Override
    public String
    toString() {
        return "Matrix{" +
                "matrix=" + matrix +
                '}';
    }

    Matrix<T> transpose() {
        List<ArrayList<T>> transpose = new ArrayList<>();
        for (int rowNum = 0; rowNum < numOfCols; rowNum++) {
            transpose.add(new ArrayList<>());
        }

        for (int row = 0; row < numOfRows; row++) {
            for (int column = 0; column < numOfCols; column++) {
                ArrayList<T> transposeRow = transpose.get(column);
                transposeRow.add(row, matrix.get(row).get(column));
            }
        }
        return new Matrix<>(transpose);
    }
}
