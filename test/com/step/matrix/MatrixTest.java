package com.step.matrix;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MatrixTest {
    @Test
    void shouldReturnTrueWhenTheExpectedSumIsEqualToTheAdditionOfTwoMatrices() {

        ArrayList<Integer> row1 = new ArrayList<>(asList(1, 2, 3));
        ArrayList<Integer> row2 = new ArrayList<>(asList(3, 1, 2));

        Matrix matrix1 = new Matrix(asList(row1, row2));
        Matrix matrix2 = new Matrix(asList(row2, row1));

        ArrayList<Integer> expectedRow1 = new ArrayList<>(asList(4, 3, 5));
        ArrayList<Integer> expectedRow2 = new ArrayList<>(asList(4, 3, 5));
        Matrix expectedSum = new Matrix(asList(expectedRow1, expectedRow2));

        Matrix sum = matrix1.add(matrix2);

        assertTrue(expectedSum.isEqual(sum));
    }

    @Test
    void shouldReturnFalseWhenTheExpectedSumIsNotEqualToTheAdditionOfTwoMatrices() {

        ArrayList<Integer> row1 = new ArrayList<>(asList(1, 2, 3));
        ArrayList<Integer> row2 = new ArrayList<>(asList(3, 1, 2));

        Matrix matrix1 = new Matrix(asList(row1, row2));
        Matrix matrix2 = new Matrix(asList(row2, row1));

        ArrayList<Integer> expectedRow1 = new ArrayList<>(asList(6, 3, 5));
        ArrayList<Integer> expectedRow2 = new ArrayList<>(asList(4, 3, 5));
        Matrix expectedSum = new Matrix(asList(expectedRow1, expectedRow2));

        Matrix sum = matrix1.add(matrix2);

        assertFalse(expectedSum.isEqual(sum));
    }

    @Test
    void shouldReturnTrueWhenTheExpectedMultiplicationIsEqualToTheMultiplicationOfTwoMatrices() {

        ArrayList<Integer> row1 = new ArrayList<>(asList(1, 2, 3));
        ArrayList<Integer> row2 = new ArrayList<>(asList(3, 1, 2));
        ArrayList<Integer> row3 = new ArrayList<>(asList(3, 1, 2));

        Matrix matrix1 = new Matrix(asList(row1, row2));
        Matrix matrix2 = new Matrix(asList(row2, row1, row3));

        ArrayList<Integer> expectedRow1 = new ArrayList<>(asList(14, 8, 14));
        ArrayList<Integer> expectedRow2 = new ArrayList<>(asList(16, 7, 13));
        Matrix expectedMultiplication = new Matrix(asList(expectedRow1, expectedRow2));

        Matrix multiplication = matrix1.multiply(matrix2);

        assertTrue(expectedMultiplication.isEqual(multiplication));
    }

    @Test
    void shouldReturnFalseWhenTheExpectedMultiplicationIsNotEqualToTheMultiplicationOfTwoMatrices() {

        ArrayList<Integer> row1 = new ArrayList<>(asList(1, 2, 3));
        ArrayList<Integer> row2 = new ArrayList<>(asList(3, 1, 2));
        ArrayList<Integer> row3 = new ArrayList<>(asList(3, 1, 2));

        Matrix matrix1 = new Matrix(asList(row1, row2));
        Matrix matrix2 = new Matrix(asList(row2, row1, row3));

        ArrayList<Integer> expectedRow1 = new ArrayList<>(asList(12, 8, 14));
        ArrayList<Integer> expectedRow2 = new ArrayList<>(asList(16, 7, 13));
        Matrix expectedMultiplication = new Matrix(asList(expectedRow1, expectedRow2));

        Matrix multiplication = matrix1.multiply(matrix2);

        assertFalse(expectedMultiplication.isEqual(multiplication));
    }
}