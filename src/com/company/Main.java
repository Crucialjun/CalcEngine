package com.company;

public class Main {

    public static void main(String[] args) {
//        double[] leftVals = {100.0d, 25.0d, 225.0d, 11.0d};
//        double[] rightVals = {50.0d, 92.0d, 17.0d, 3.0d};
//        char[] opCodes = {'d', 'a', 's', 'm'};
//        double[] results = new double[opCodes.length];


//        double val1 = 100.0d, val2 = 50.0d, result;
//        char opCode = 'd';

        MathEquation[] equations = new MathEquation[4];

        equations[0] = create(100.0,50.0,'d');
        equations[1] = create(25.0,92.0,'a');
        equations[2] = create(225.0,17.0,'s');
        equations[3] = create(11.0,3.0,'m');

        for (MathEquation equation : equations){
            equation.execute();
            System.out.print("result = ");
            System.out.println(equation.result);
            }



        }
    public static  MathEquation create(double leftVal, double rightVal, char opCode){
        MathEquation equation = new MathEquation();
        equation.leftVal = leftVal;
        equation.rightVal = rightVal;
        equation.opCode = opCode;

        return equation;
    }
}
