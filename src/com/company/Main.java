package com.company;

public class Main {

    public static void main(String[] args) {
	double val1 = 100.0d,val2 = 50.0d,result;
	char opCode = 'd';

	if(opCode =='a')
	    result = val1 + val2;
	else if(opCode == 's')
	    result = val1 - val2;
	else if(opCode == 'd') {
		result = val2 != 0 ? val1 / val2 : 0.0d;
//		if(val2 != 0.0d)
//	    result = val1 / val2;
//		else
//			result = 0.0d;
	}
	else if(opCode == 'm')
	    result = val1 + val2;
	else {
		System.out.println("Error - Invalid opCode");
		result = 0.0d;
	}
	System.out.println(result);
    }
}
