package StaticClasses;


public class Calculator {
//
//    public static final int MULTIPLICATION = 1;
//    public static final int SUMMARY = 2;
//    public static final int DIVISION = 3;
//    public static final int SUBTRACTION = 4;

    // enum final constants

    public enum Type{
        MULTIPLICATION,
        SUMMARY,
        DIVISION,
        SUBTRACTION
    }

    public static double calculate(double a, double b, Type type){
        double result=0;
        // we can do it with if else
//        if (type== MULTIPLICATION) {
//            return a * b;
//        }
//        else if (type == SUMMARY)

        // we can do it with switch case
        try {

            switch (type){
                case MULTIPLICATION:
                    result = a*b;
                    break;
                case SUMMARY:
                    result = a+b;
                    break;

                case DIVISION:
                    result = a/b;
                    break;

                case SUBTRACTION:
                    result = a-b;
                    break;

                default:
                    result =-1;

            }
        }

        catch (Exception err){
            System.out.println("Something bad has happened ");
               throw err;

        }
//        finally {
//            System.out.println("Finally block");
//            result = -1;
//        }


        return result;
    }
}

//
//public class Calculator {
//
////    public static final int MULTIPLICATION = 1;
////    public static final int SUMMARY = 2;
////    public static final int DIVISION = 3;
////    public static final int SUBTRACTION = 4;
////
//    enum Type{
//    MULTIPLICATION,
//    SUMMARY,
//    DIVISION,
//    SUBTRACTION
//
//
//}
//    public static double calculator(double a, double b, Type type){
//
//        double result=0;
////        if (type==Multiplication){
////            return a*b;
////        }
////        else if (type==SUMMARY)
////
//
//        switch (type){
//            case MULTIPLICATION:
//                result = a*b;
//                break;
//            case SUMMARY:
//                result = a+b;
//                break;
//            case DIVISION:
//                result=a/b;
//                break;
//            case SUBTRACTION:
//                result=a-b;
//                break;
//
//            default:
//                result=-1;
//
//        }
//
//
//
//        return result;
//    }


