package com.step.matrix;

import java.util.ArrayList;
import java.util.List;

class ArithmeticalMatrix extends Matrix<Integer> {

    private ArithmeticalMatrix(List<ArrayList<Integer>> matrix){
        super(matrix);
    }

    static ArithmeticalMatrix createArithmeticalMatrix(List<ArrayList<Integer>> matrix) throws Exception {
        int numOfCols = matrix.get(0).size();
        for (List<Integer> row : matrix) {
            if(row.size() != numOfCols){
                throw new Exception("Invalid Matrix");
            }
        }
        return new ArithmeticalMatrix(matrix);
    }


    private Integer getCellValue(ArithmeticalMatrix matrix, int rowNum, int colNum) {
        return matrix.matrix.get(rowNum).get(colNum);
    }

    private int getCellMultiplication(ArithmeticalMatrix otherMatrix, int row, int chance) {
        int cellMultiplication = 0;
        for (int col = 0; col < numOfCols; col++) {
            cellMultiplication += matrix.get(row).get(col) * (int) (otherMatrix.matrix.get(col).get(chance));
        }
        return cellMultiplication;
    }

    ArithmeticalMatrix multiply(ArithmeticalMatrix otherMatrix) throws Exception {
        List<ArrayList<Integer>> multiplication = new ArrayList<>();
        for (int row = 0; row < numOfRows; row++) {
            multiplication.add(new ArrayList<>());
            for (int chance = 0; chance < numOfCols; chance++) {
                multiplication.get(row).add(chance, getCellMultiplication(otherMatrix, row, chance));
            }
        }
        return createArithmeticalMatrix(multiplication);
    }


    ArithmeticalMatrix add(ArithmeticalMatrix otherMatrix) throws Exception {
        List<ArrayList<Integer>> sum = new ArrayList<>();
        for (int rowNum = 0; rowNum < numOfRows; rowNum++) {
            sum.add(new ArrayList<>());
        }
        for (int row = 0; row < numOfRows; row++) {
            for (int column = 0; column < numOfCols; column++) {
                ArrayList<Integer> currentRow = sum.get(row);
                int value1 = getCellValue(this, row, column);
                int value2 = getCellValue(otherMatrix, row, column);
                currentRow.add(column, value1 + value2);
            }
        }
        return createArithmeticalMatrix(sum);
    }
}
