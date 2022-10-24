package com.aleksandra.Lab1;

public class Main {
    public static void main(String[] args) {

        int[] myScore = {0, 15, 100};
        int x = 4;
        int y = 8;


        // region

        Calculator calculator = new Calculator();
        Student student = new Student("Aleksandra Rusak", 28, 941021);
        // endregion


        //region Student class

        student.StudentDetails();
        // endregion

        // region Calculator class

        calculator.addition(x, y);
        calculator.subtraction(x, y);
        calculator.multiplication(x, y);
        calculator.division(x, y);

        // endregion


        for (int i = 0; i < myScore.length; i++) {
            System.out.println(myScore [i]);

        }

    }
}