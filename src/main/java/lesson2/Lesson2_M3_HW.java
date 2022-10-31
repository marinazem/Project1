package lesson2;
// Marina Zemilevitch HW Module 3
public class Lesson2_M3_HW {
    // Q1 The code should be able to print all the positive integers from 1 to 100.

    public static void main(String[] args) {
        Lesson2_M3_HW quest1 = new Lesson2_M3_HW();
        Lesson2_M3_HW quest2 = new Lesson2_M3_HW();
        Lesson2_M3_HW quest3 = new Lesson2_M3_HW();
        quest1.positiveInt();
        quest2.sumBetweenNum(1, 3);
        quest2.sumBetweenNum(3, 1);
        quest3.pyramid();
    }

    public void positiveInt() {
        for (int i = 1; i <= 100; i++) {
            System.out.print(i);

            if (i % 2 == 0 && i % 3 == 0) {
                System.out.println(" -This number is even and divisible and by three OR divisible by six");
            } else if (i % 3 == 0) {
                System.out.println(" -This number is divisible by three");
            } else if (i % 2 == 0) {
                System.out.println(" -This number is even");
            } else

                System.out.println(" -This number is odd");
        }
    }

    // Q2  Create a method that will receive 2 numbers and calculate the summary of all the numbers between them.
    public void sumBetweenNum(int a, int b) {
        int sum = 0;
   // if number a is bigger than number b i use additional variable c to switch between a and b

        if (a > b) {
            int c = a;
            a = b;
            b = c;
        }
        for (int i=a; i<=b; i++ ) {
            sum=sum+i;
        }
        /*
        while (a <= b) {
            sum += a;
            a++;

         */

        System.out.println("The sum of all numbers between two given numbers equal to " + sum);

    }

    //  Q3 Using two loops print upside-down pyramid on the screen

    public void pyramid() {
        for (int i = 6; i >= 1; --i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }


    }

}

