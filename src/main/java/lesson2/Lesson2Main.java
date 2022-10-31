package lesson2;

public class Lesson2Main {
    public static void main(String[] args) {
//        String name = "Marina Zem";
//        int userID = 1;
//        System.out.println("The user name is " + name);
//        System.out.println("The user ID is " + userID);


        Lesson2Main lesson2 = new Lesson2Main();
        boolean isBonusAvailable = true;
        //lesson2.printUserInfo("Marina Zem", 1, isBonusAvailable);

        lesson2.checkScore("Marina Zem", 1, 80, isBonusAvailable);
        lesson2.checkScore("Emily Zem", 2, 50, isBonusAvailable);
        lesson2.checkScore("liel Zem", 3, 40, isBonusAvailable);
    }

    public void printUserInfo(String userName, int userID) {
        System.out.println("The user name is " + userName);
        System.out.println("The user ID is " + userID);

    }

    //public void printUserInfo(String userName, int userID, boolean isBonusAvailable) {
    //    System.out.println("The user name is " + userName);
    //    System.out.println("The user ID is " + userID);
    //}

    public void checkScore(String userName, int userID, int userScore, boolean isBonusAvailable) {
        System.out.println("The user name is:" + userName);
        System.out.println("The user ID is:" + userID);



        if (isBonusAvailable) {
            userScore = userScore + 10;
        }


        if (userScore > 100 || userScore < 0) {
            System.out.println("Error!!!");
        } else if (userScore >= 60) {
            System.out.println("PASS !!!");
        } else {
            System.out.println("FAIL !!!");
        }


    }


}
