package com.step.matrix;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class ArithmeticalMatrixTest {

    @Test
    void shouldReturnTrueWhenTheExpectedSumIsEqualToTheAdditionOfTwoMatrices() throws Exception {

        ArrayList<Integer> row1 = new ArrayList<>(asList(1, 2, 3));
        ArrayList<Integer> row2 = new ArrayList<>(asList(3, 1, 2));

        ArithmeticalMatrix matrix1 = ArithmeticalMatrix.createArithmeticalMatrix(asList(row1, row2));
        ArithmeticalMatrix matrix2 = ArithmeticalMatrix.createArithmeticalMatrix(asList(row2, row1));

        ArrayList<Integer> expectedRow1 = new ArrayList<>(asList(4, 3, 5));
        ArrayList<Integer> expectedRow2 = new ArrayList<>(asList(4, 3, 5));
        ArithmeticalMatrix expectedSum = ArithmeticalMatrix.createArithmeticalMatrix(asList(expectedRow1, expectedRow2));

        ArithmeticalMatrix sum = matrix1.add(matrix2);

        assertEquals(expectedSum, sum);
    }

    @Test
    void shouldReturnFalseWhenTheExpectedSumIsNotEqualToTheAdditionOfTwoMatrices() throws Exception {

        ArrayList<Integer> row1 = new ArrayList<>(asList(1, 2, 3));
        ArrayList<Integer> row2 = new ArrayList<>(asList(3, 1, 2));

        ArithmeticalMatrix matrix1 = ArithmeticalMatrix.createArithmeticalMatrix(asList(row1, row2));
        ArithmeticalMatrix matrix2 = ArithmeticalMatrix.createArithmeticalMatrix(asList(row2, row1));

        ArrayList<Integer> expectedRow1 = new ArrayList<>(asList(6, 3, 5));
        ArrayList<Integer> expectedRow2 = new ArrayList<>(asList(4, 3, 5));
        ArithmeticalMatrix expectedSum = ArithmeticalMatrix.createArithmeticalMatrix(asList(expectedRow1, expectedRow2));

        ArithmeticalMatrix sum = matrix1.add(matrix2);

        assertNotEquals(expectedSum, sum);
    }

    @Test
    void shouldReturnTrueWhenTheExpectedMultiplicationIsEqualToTheMultiplicationOfTwoMatrices() throws Exception {

        ArrayList<Integer> row1 = new ArrayList<>(asList(1, 2, 3));
        ArrayList<Integer> row2 = new ArrayList<>(asList(3, 1, 2));
        ArrayList<Integer> row3 = new ArrayList<>(asList(3, 1, 2));

        ArithmeticalMatrix matrix1 = ArithmeticalMatrix.createArithmeticalMatrix(asList(row1, row2));
        ArithmeticalMatrix matrix2 = ArithmeticalMatrix.createArithmeticalMatrix(asList(row2, row1, row3));

        ArrayList<Integer> expectedRow1 = new ArrayList<>(asList(14, 8, 14));
        ArrayList<Integer> expectedRow2 = new ArrayList<>(asList(16, 7, 13));
        ArithmeticalMatrix expectedMultiplication = ArithmeticalMatrix.createArithmeticalMatrix(asList(expectedRow1, expectedRow2));

        ArithmeticalMatrix multiplication = matrix1.multiply(matrix2);

        assertEquals(expectedMultiplication, multiplication);
    }

    @Test
    void shouldReturnFalseWhenTheExpectedMultiplicationIsNotEqualToTheMultiplicationOfTwoMatrices() throws Exception {

        ArrayList<Integer> row1 = new ArrayList<>(asList(1, 2, 3));
        ArrayList<Integer> row2 = new ArrayList<>(asList(3, 1, 2));
        ArrayList<Integer> row3 = new ArrayList<>(asList(3, 1, 2));

        ArithmeticalMatrix matrix1 = ArithmeticalMatrix.createArithmeticalMatrix(asList(row1, row2));
        ArithmeticalMatrix matrix2 = ArithmeticalMatrix.createArithmeticalMatrix(asList(row2, row1, row3));

        ArrayList<Integer> expectedRow1 = new ArrayList<>(asList(12, 8, 14));
        ArrayList<Integer> expectedRow2 = new ArrayList<>(asList(16, 7, 13));
        ArithmeticalMatrix expectedMultiplication = ArithmeticalMatrix.createArithmeticalMatrix(asList(expectedRow1, expectedRow2));

        ArithmeticalMatrix multiplication = matrix1.multiply(matrix2);

        assertNotEquals(expectedMultiplication, multiplication);
    }

    @Test
    void shouldReturnTrueWhenTheExpectedMatrixIsEqualToTheTransposeOfTheMatrixOfIntegers() throws Exception {

        ArrayList<Integer> row1 = new ArrayList<>(asList(1, 2, 3));
        ArrayList<Integer> row2 = new ArrayList<>(asList(3, 1, 2));
        ArrayList<Integer> row3 = new ArrayList<>(asList(3, 1, 2));

        ArithmeticalMatrix matrix = ArithmeticalMatrix.createArithmeticalMatrix(asList(row1, row2, row3));

        ArrayList<Integer> expectedRow1 = new ArrayList<>(asList(1, 3, 3));
        ArrayList<Integer> expectedRow2 = new ArrayList<>(asList(2, 1, 1));
        ArrayList<Integer> expectedRow3 = new ArrayList<>(asList(3, 2, 2));

        ArithmeticalMatrix expectedTranspose = ArithmeticalMatrix.createArithmeticalMatrix(asList(expectedRow1, expectedRow2, expectedRow3));

        Matrix<Integer> transpose = matrix.transpose();

        assertEquals(expectedTranspose, transpose);

    }

    @Test
    void shouldReturnFalseWhenTheExpectedMatrixIsNotEqualToTheTransposeOfTheMatrix() throws Exception {

        ArrayList<Integer> row1 = new ArrayList<>(asList(1, 2, 3));
        ArrayList<Integer> row2 = new ArrayList<>(asList(3, 1, 2));
        ArrayList<Integer> row3 = new ArrayList<>(asList(3, 1, 2));

        ArithmeticalMatrix matrix = ArithmeticalMatrix.createArithmeticalMatrix(asList(row1, row2, row3));

        ArrayList<Integer> expectedRow1 = new ArrayList<>(asList(8, 3, 3));
        ArrayList<Integer> expectedRow2 = new ArrayList<>(asList(2, 1, 1));
        ArrayList<Integer> expectedRow3 = new ArrayList<>(asList(3, 2, 2));

        ArithmeticalMatrix expectedTranspose = ArithmeticalMatrix.createArithmeticalMatrix(asList(expectedRow1, expectedRow2, expectedRow3));

        Matrix transpose = matrix.transpose();

        assertNotEquals(expectedTranspose, transpose);
    }
}