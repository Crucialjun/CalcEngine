package com.company.myapp;

import com.company.*;

public class Main {

    public static void main(String[] args) {
//        useMathEquation();
//        useCalculatorBase();
        // useCalculateHelper();

        String[] statements = {
                "add 25.0 92.0",    //
                "power 5.0 2.0"     // 5.0 ^ 2.0 = 25.0

        };

        DynamicHelper helper = new DynamicHelper(new MathProcessing[]{
                new Adder(),
                new PowerOf()
        });


        for (String statement:statements) {
            String output = helper.process(statement);
            System.out.println(output);
        }


    }

    private static void useCalculateHelper() {
        String[] statements = {
                "add 1.0",      //Error incorent number of values
                "add xx 25.0",  //Error: Non Numeric data
                "addX 0.0 0.0", // Error invalid command
                "divide 100.0 50.0", //100.0 / 50.0 = 2.0
                "add 25.0 92.0",    //
                "substract 225.0 17.0",
                "multiply 11.0 3.0"

        };
    }

    private static void useCalculatorBase() {
    }

    private static void useMathEquation() {
        MathEquation[] equations = new MathEquation[4];
//
//        MathEquation mathEquation = new MathEquation();
//        mathEquation.execute();
//        System.out.print("test = :");
//        System.out.println(mathEquation.getResult());

        equations[0] = new MathEquation('d',100.0,50.0);
        equations[1] = new MathEquation('a',25.0,92.0);
        equations[2] = new MathEquation('s',225.0,17.0);
        equations[3] = new MathEquation('m',11.0,3.0);

        for (MathEquation equation : equations){
            equation.execute();
            System.out.print("result = ");
            System.out.println(equation.getResult());
        }

        System.out.println();
        System.out.println("Using Overloads");
        System.out.println();

        double leftDouble = 9.0d;
        double rightDouble = 4.0d;
        int leftInt = 9;
        int rightInt = 4;

        MathEquation equationOverload = new MathEquation('d');

        equationOverload.execute(leftDouble,rightDouble);
        System.out.print("result=");
        System.out.println(equationOverload.getResult());

        equationOverload.execute(leftInt,rightInt);
        System.out.print("result=");
        System.out.println(equationOverload.getResult());

        equationOverload.execute((double)leftInt,rightInt);
        System.out.print("result=");
        System.out.println(equationOverload.getResult());

        System.out.println();
        System.out.println("Using Inheritance");
        System.out.println();

        CalculateBase[] calculators = {
                new Divider(100.0d,50.0d),
                new Adder(25.0d,92.0d),
                new Substracter(225.0d,17.0d),
                new Multiplier(11.0d,3.0d)
        };

        for(CalculateBase calculator:calculators){
            calculator.calculate();
            System.out.print("result=");
            System.out.println(calculator.getResult());


        }
    }

}
