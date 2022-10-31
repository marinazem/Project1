package lesson1;

public class lesson1_M2_HW {
    public static void main(String[] args) {
// M2 - Variables assignment
//     1. Write a Java program to print 'Hello' on the screen and then print your name on a separate line.

        String myName = "Marina Zemilevitch :-)";
        System.out.println("Hello!");
        System.out.println(myName);

/* 2. Write a Java program to print the result of the following operations.
        a. -5 + 8 * 6
        b. 20 + -3*5 / 8
  */
        int num1 = -5;
        int num2 = 8;
        int num3 = 6;
        int result1 = num1+num2*num3;

        System.out.println("The result of Q2 A is = " + result1);

        int num4 = 20;
        int num5 = -3;
        int num6 = 5;
        int num7 = 8;
        double result2 = num4 + (double)num5 * num6 / num7;

        System.out.println("The result of Q2 B is = " + result2);

/*
3. Write a java program with 5 decimal variables. Multiply all 5 of them and print results in the following format:

number a * number b *.... equals <result>
*/

        double var1 = 0.5;
        double var2 = 1.5;
        double var3 = -2.75;
        double var4 = -10.23;
        double var5 = 2.55;
        double result3 = var1*var2*var3*var4*var5;

        System.out.println("The result of Q3 is =" + var1 +"*"+ var2 +"*"+ var3 +"*"+ var4 +"*"+ var5 +"="+ result3);



    }
}
