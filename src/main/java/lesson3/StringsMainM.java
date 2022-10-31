package lesson3;

public class StringsMainM {

    public static void main(String[] args) {
    StringsMainM stringsMainM = new StringsMainM();
    int result = stringsMainM.sumOfTwoNumbers(2, 4);
        System.out.println("The Result is " + result);
        System.out.println(stringsMainM.getText());
    }

   public int sumOfTwoNumbers (int num1, int num2){
        int result = num1 + num2;
        return result;
   }
   public String getText(){
        return "I Love You!";
   }
}
