package com.step.matrix;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ArithmeticalMatrixTest {

    @Test
    void shouldReturnTrueWhenTheExpectedSumIsEqualToTheAdditionOfTwoMatrices() {

        ArrayList<Integer> row1 = new ArrayList<>(asList(1, 2, 3));
        ArrayList<Integer> row2 = new ArrayList<>(asList(3, 1, 2));

        ArithmeticalMatrix matrix1 = new ArithmeticalMatrix(asList(row1, row2));
        ArithmeticalMatrix matrix2 = new ArithmeticalMatrix(asList(row2, row1));

        ArrayList<Integer> expectedRow1 = new ArrayList<>(asList(4, 3, 5));
        ArrayList<Integer> expectedRow2 = new ArrayList<>(asList(4, 3, 5));
        ArithmeticalMatrix expectedSum = new ArithmeticalMatrix(asList(expectedRow1, expectedRow2));

        ArithmeticalMatrix sum = matrix1.add(matrix2);

        assertTrue(expectedSum.isEqual(sum));
    }

    @Test
    void shouldReturnFalseWhenTheExpectedSumIsNotEqualToTheAdditionOfTwoMatrices() {

        ArrayList<Integer> row1 = new ArrayList<>(asList(1, 2, 3));
        ArrayList<Integer> row2 = new ArrayList<>(asList(3, 1, 2));

        ArithmeticalMatrix matrix1 = new ArithmeticalMatrix(asList(row1, row2));
        ArithmeticalMatrix matrix2 = new ArithmeticalMatrix(asList(row2, row1));

        ArrayList<Integer> expectedRow1 = new ArrayList<>(asList(6, 3, 5));
        ArrayList<Integer> expectedRow2 = new ArrayList<>(asList(4, 3, 5));
        ArithmeticalMatrix expectedSum = new ArithmeticalMatrix(asList(expectedRow1, expectedRow2));

        ArithmeticalMatrix sum = matrix1.add(matrix2);

        assertFalse(expectedSum.isEqual(sum));
    }

    @Test
    void shouldReturnTrueWhenTheExpectedMultiplicationIsEqualToTheMultiplicationOfTwoMatrices() {

        ArrayList<Integer> row1 = new ArrayList<>(asList(1, 2, 3));
        ArrayList<Integer> row2 = new ArrayList<>(asList(3, 1, 2));
        ArrayList<Integer> row3 = new ArrayList<>(asList(3, 1, 2));

        ArithmeticalMatrix matrix1 = new ArithmeticalMatrix(asList(row1, row2));
        ArithmeticalMatrix matrix2 = new ArithmeticalMatrix(asList(row2, row1, row3));

        ArrayList<Integer> expectedRow1 = new ArrayList<>(asList(14, 8, 14));
        ArrayList<Integer> expectedRow2 = new ArrayList<>(asList(16, 7, 13));
        ArithmeticalMatrix expectedMultiplication = new ArithmeticalMatrix(asList(expectedRow1, expectedRow2));

        ArithmeticalMatrix multiplication = matrix1.multiply(matrix2);

        assertTrue(expectedMultiplication.isEqual(multiplication));
    }

    @Test
    void shouldReturnFalseWhenTheExpectedMultiplicationIsNotEqualToTheMultiplicationOfTwoMatrices() {

        ArrayList<Integer> row1 = new ArrayList<>(asList(1, 2, 3));
        ArrayList<Integer> row2 = new ArrayList<>(asList(3, 1, 2));
        ArrayList<Integer> row3 = new ArrayList<>(asList(3, 1, 2));

        ArithmeticalMatrix matrix1 = new ArithmeticalMatrix(asList(row1, row2));
        ArithmeticalMatrix matrix2 = new ArithmeticalMatrix(asList(row2, row1, row3));

        ArrayList<Integer> expectedRow1 = new ArrayList<>(asList(12, 8, 14));
        ArrayList<Integer> expectedRow2 = new ArrayList<>(asList(16, 7, 13));
        ArithmeticalMatrix expectedMultiplication = new ArithmeticalMatrix(asList(expectedRow1, expectedRow2));

        ArithmeticalMatrix multiplication = matrix1.multiply(matrix2);

        assertFalse(expectedMultiplication.isEqual(multiplication));
    }

    @Test
    void shouldReturnTrueWhenTheExpectedMatrixIsEqualToTheTransposeOfTheMatrixOfIntegers() {

        ArrayList<Integer> row1 = new ArrayList<>(asList(1, 2, 3));
        ArrayList<Integer> row2 = new ArrayList<>(asList(3, 1, 2));
        ArrayList<Integer> row3 = new ArrayList<>(asList(3, 1, 2));

        ArithmeticalMatrix matrix = new ArithmeticalMatrix(asList(row1, row2, row3));

        ArrayList<Integer> expectedRow1 = new ArrayList<>(asList(1, 3, 3));
        ArrayList<Integer> expectedRow2 = new ArrayList<>(asList(2, 1, 1));
        ArrayList<Integer> expectedRow3 = new ArrayList<>(asList(3, 2, 2));

        ArithmeticalMatrix expectedTranspose = new ArithmeticalMatrix(asList(expectedRow1, expectedRow2, expectedRow3));

        Matrix<Integer> transpose = matrix.transpose();

        assertTrue(expectedTranspose.isEqual(transpose));
    }

    @Test
    void shouldReturnFalseWhenTheExpectedMatrixIsNotEqualToTheTransposeOfTheMatrix() {

        ArrayList<Integer> row1 = new ArrayList<>(asList(1, 2, 3));
        ArrayList<Integer> row2 = new ArrayList<>(asList(3, 1, 2));
        ArrayList<Integer> row3 = new ArrayList<>(asList(3, 1, 2));

        ArithmeticalMatrix matrix = new ArithmeticalMatrix(asList(row1, row2, row3));

        ArrayList<Integer> expectedRow1 = new ArrayList<>(asList(8, 3, 3));
        ArrayList<Integer> expectedRow2 = new ArrayList<>(asList(2, 1, 1));
        ArrayList<Integer> expectedRow3 = new ArrayList<>(asList(3, 2, 2));

        ArithmeticalMatrix expectedTranspose = new ArithmeticalMatrix(asList(expectedRow1, expectedRow2, expectedRow3));

        Matrix transpose = matrix.transpose();

        assertFalse(expectedTranspose.isEqual(transpose));
    }
}