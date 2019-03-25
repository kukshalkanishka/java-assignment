package com.step.matrix;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Matrix)) return false;
        Matrix<?> matrix1 = (Matrix<?>) o;
        return numOfRows == matrix1.numOfRows &&
                numOfCols == matrix1.numOfCols &&
                Objects.equals(matrix, matrix1.matrix);
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
