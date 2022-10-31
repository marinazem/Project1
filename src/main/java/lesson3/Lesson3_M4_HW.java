package lesson3;
//Q1 HW
//        Write a program (method) that will receive two strings and do the following:
//
//        1.) print if one string is part of another:
//
//
//        2.) If Strings are equal, the expected print is:
//
//        "The Strings are the same"
//        3.) If one of the strings is a null -  print:

public class Lesson3_M4_HW {
    public static void main(String[] args) {
        Lesson3_M4_HW lesson3_m4_hw = new Lesson3_M4_HW();
        lesson3_m4_hw.compareStrings("CATalog", "cat");

        lesson3_m4_hw.isPalindrome("mOM");

    }

    public void compareStrings(String textA, String textB) {
            textA = textA.toLowerCase();
            textB = textB.toLowerCase();

        if (textA == null || textA.isEmpty() || textA.isBlank() || textB == null || textB.isEmpty() || textB.isBlank()) {
            System.out.println(" the String is null or empty, Can not compare those strings !");
        } else {
            System.out.println(String.format("String A is %s and string B is %s", textA, textB));
            if (textA.equals(textB)) {
                System.out.println("The Strings are the same");
            } else if (textA.contains(textB)) {
                System.out.println(String.format("String B  %s is the part of string A  %s", textB, textA));
            } else {
                if (textB.contains(textA)) {
                    System.out.println(String.format("String A is %s is the part of string B  %s", textA, textB));
                }

            }

        }
    }


//  Q 2 - Given a string, write a program to check if it is palindrome or not
    public boolean isPalindrome(String textC){

        String revTextC ="";
        int textLength = textC.length();
        for (int i = textLength- 1; i>=0; i--){
            revTextC = revTextC + textC.charAt(i);
        }

        if (textC.toLowerCase().equals(revTextC.toLowerCase())) {
            System.out.println(textC + " is a Palindrome String.");
            return true;
        }
        else {
            System.out.println(textC + " is not a Palindrome String.");
            return false;
        }

    }

}


