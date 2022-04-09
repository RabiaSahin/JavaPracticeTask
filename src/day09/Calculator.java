package day09;

public class Calculator {
    public static void main(String[] args) {

        double n1, n2;
        n1 = 5.0;
        n2 = 2.5;
        char mathOperator = '>';

        String resultAdd = n1 + " + " + n2 + " = " + (n1+n2);
        String resultMinus = n1 + " - " + n2 + " = " + (n1-n2);
        String resultMultiply = n1 + " * " + n2 + " = " + (n1*n2);
        String resultDivide = n1 + " / " + n2 + " = " + (n1/n2);

        System.out.println("----------if else------------");

        if(mathOperator == '+'){
            System.out.println(resultAdd);
        }else if (mathOperator == '-'){
            System.out.println(resultMinus);
        }else if (mathOperator == '*'){
            System.out.println(resultMultiply);
        }else if (mathOperator == '/'){
            System.out.println(resultDivide);
        }else{
            System.out.println("invalid operator");
        }

        System.out.println("----------switch------------");

        switch (mathOperator){
            case '+':
                System.out.println(resultAdd);
                break;
            case '-':
                System.out.println(resultMinus);
                break;
            case '*':
                System.out.println(resultMultiply);
                break;
            case '/':
                System.out.println(resultDivide);
                break;
            default:
                System.out.println("invalid operator");
        }

        System.out.println("----------ternary------------");

       String result = (mathOperator == '+')? resultAdd :(mathOperator == '-')? resultMinus
               :(mathOperator == '*')? resultMultiply :(mathOperator == '/')? resultDivide : "invalid operator";
        System.out.println(result);

    }
}
/*Create a class called Calculator, Given two double variables named n1 & n2, and a char variable named mathOperator,
 write a program that can calculate result of n1&n2 based on the given math Operator.

		char operator -> -, +, *, /

		when operator is + : add num1, num2
		when operator: - : minus num1, num2
		when operator: * : multiply num1, num2
		when operator: / : divide num1, num2
		for any other operators: print "invalid operator"

		Ex:
			n1 = 10, n2= 20, mathOperator = '+'

		output:
			30*/