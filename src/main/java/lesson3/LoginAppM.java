package lesson3;

public class LoginAppM {

    public String expectedUserName = "admin";
    public String expectedPassword = "12345";


    public static void main(String[] args) {

        LoginAppM loginAppM = new LoginAppM();
//        boolean success = loginAppM.verifyUser("ADMIM", "12345");
//        System.out.println(success);
        LoginAppM.stringsExamples();
    }

    public boolean verifyUser(String username, String password) {
        username = username.toLowerCase();
        password = password.toLowerCase();
        boolean success = false;
        //      if (username.isEmpty() || password.isEmpty()){

        if (username == null || password == null) {
            System.out.println("The username or password is Null");
        } else if (username.length() == 0 || password.length() == 0) {
            System.out.println("The username or password is empty");
        } else if (username.isBlank() || password.isBlank()) {
            System.out.println("The username or password is blank");
        } else if (!username.equals(expectedUserName) && !password.equals(expectedPassword)) {
            System.out.println("The username or password does not match the expected values");
        } else {
            success = true;
        }
            return success;
        }
    public static void stringsExamples(){
        String txt1 = "cat";
        String txt2 = "catalog";
        System.out.println (txt2.contains((txt1)));

    }


}