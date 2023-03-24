package org.example;

public class Main {
    public static void main(String[] args) {


        Ints calc1 = new IntsCalculator();
        System.out.println(calc1.pow(4,2));
        System.out.println(calc1.sum(1,2));
        System.out.println(calc1.mult(1,2));

        Calculator calc = new Calculator();
        System.out.println(
                calc.newFormula()
                        .addOperand(5)
                        .addOperand(15)
                        .calculate(Calculator.Operation.MULT)
                        .result()
        );


    }
}