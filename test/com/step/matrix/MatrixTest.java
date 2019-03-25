package com.step.matrix;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.*;

class MatrixTest {
    @Test
    void shouldReturnTrueWhenTheExpectedMatrixIsEqualToTheTransposeOfTheMatrixOfIntegers() throws Exception {

        ArrayList<Integer> row1 = new ArrayList<>(asList(1, 2, 3));
        ArrayList<Integer> row2 = new ArrayList<>(asList(3, 1, 2));
        ArrayList<Integer> row3 = new ArrayList<>(asList(3, 1, 2));

        Matrix<Integer> matrix = Matrix.createMatrix(asList(row1, row2, row3));

        ArrayList<Integer> expectedRow1 = new ArrayList<>(asList(1, 3, 3));
        ArrayList<Integer> expectedRow2 = new ArrayList<>(asList(2, 1, 1));
        ArrayList<Integer> expectedRow3 = new ArrayList<>(asList(3, 2, 2));

        Matrix<Integer> expectedTranspose = Matrix.createMatrix(asList(expectedRow1, expectedRow2, expectedRow3));

        Matrix<Integer> transpose = matrix.transpose();

        assertEquals(expectedTranspose, transpose);
    }

    @Test
    void shouldReturnTrueWhenTheExpectedMatrixIsEqualToTheTransposeOfTheMatrixOfStrings() throws Exception {

        ArrayList<String> row1 = new ArrayList<>(asList("one", "two", "three"));
        ArrayList<String> row2 = new ArrayList<>(asList("three", "one", "two"));
        ArrayList<String> row3 = new ArrayList<>(asList("three", "one", "two"));

        Matrix<String> matrix = Matrix.createMatrix(asList(row1, row2, row3));

        ArrayList<String> expectedRow1 = new ArrayList<>(asList("one", "three", "three"));
        ArrayList<String> expectedRow2 = new ArrayList<>(asList("two", "one", "one"));
        ArrayList<String> expectedRow3 = new ArrayList<>(asList("three", "two", "two"));

        Matrix<String> expectedTranspose = Matrix.createMatrix(asList(expectedRow1, expectedRow2, expectedRow3));

        Matrix<String> transpose = matrix.transpose();
        assertEquals(expectedTranspose, transpose);
    }

    @Test
    void shouldReturnTrueWhenTheExpectedMatrixIsEqualToTheTransposeOfTheMatrixOfBooleans() throws Exception {

        ArrayList<Boolean> row1 = new ArrayList<>(asList(true, false, true));
        ArrayList<Boolean> row2 = new ArrayList<>(asList(false, true, false));

        Matrix<Boolean> matrix = Matrix.createMatrix(asList(row1, row2));

        ArrayList<Boolean> expectedRow1 = new ArrayList<>(asList(true, false));
        ArrayList<Boolean> expectedRow2 = new ArrayList<>(asList(false, true));
        ArrayList<Boolean> expectedRow3 = new ArrayList<>(asList(true, false));

        Matrix<Boolean> expectedTranspose = Matrix.createMatrix(asList(expectedRow1, expectedRow2, expectedRow3));

        Matrix<Boolean> transpose = matrix.transpose();

        assertEquals(expectedTranspose, transpose);
    }

    @Test
    void shouldReturnFalseWhenTheExpectedMatrixIsNotEqualToTheTransposeOfTheMatrix() throws Exception {

        ArrayList<Integer> row1 = new ArrayList<>(asList(1, 2, 3));
        ArrayList<Integer> row2 = new ArrayList<>(asList(3, 1, 2));
        ArrayList<Integer> row3 = new ArrayList<>(asList(3, 1, 2));

        Matrix<Integer> matrix = Matrix.createMatrix(asList(row1, row2, row3));

        ArrayList<Integer> expectedRow1 = new ArrayList<>(asList(8, 3, 3));
        ArrayList<Integer> expectedRow2 = new ArrayList<>(asList(2, 1, 1));
        ArrayList<Integer> expectedRow3 = new ArrayList<>(asList(3, 2, 2));

        Matrix<Integer> expectedTranspose = Matrix.createMatrix(asList(expectedRow1, expectedRow2, expectedRow3));

        Matrix transpose = matrix.transpose();
        assertNotEquals(expectedTranspose, transpose);
    }

    @Test
    void shouldThrowExceptionForInvalidMatrix(){

        ArrayList<Integer> row1 = new ArrayList<>(asList(1, 2));
        ArrayList<Integer> row2 = new ArrayList<>(asList(3, 1, 2));
        ArrayList<Integer> row3 = new ArrayList<>(asList(3, 1, 2));

       assertThrows(InvalidMatrixException.class, ()->Matrix.createMatrix(asList( row1, row2, row3)));
    }
}