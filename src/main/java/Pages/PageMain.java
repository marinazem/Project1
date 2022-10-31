package Pages;

public class PageMain {

    public static void main(String[] args) {

        Page loginScreen = new Page("Login",1,"www.legionIT.com/login");
//        loginScreen.pageID = 1;
//        loginScreen.pageName = "Login";
//        loginScreen.URL = "www.legionIT.com/login";

//        loginScreen.openPage();
//        loginScreen.clickButton("Login");
//        loginScreen.closePage();
//
//
//        Page aboutScreen = new Page();
//        //aboutScreen.setPageID(2); //pageID = 2;
//
//        System.out.println(aboutScreen.getPageID());
//        aboutScreen.setPageName("About"); //pageName = "About";
//        aboutScreen.setURL("www.legionIT.com/about");// URL ="www.legionIT.com/about" ;
//
//        aboutScreen.openPage();
//        aboutScreen.clickButton("exit");
//        aboutScreen.closePage();

//        LoginPage loginPage = new LoginPage();
//        loginPage.setPageName("LoginPage");
//        loginPage.setURL("http//google.com");
//
//        loginPage.openPage();
//        loginPage.setUsername("name");
//        loginPage.setPassword("12345");
//        loginPage.populateCredentials();


        Page page = new Page();
        page.getDeveloperMame();

        Page loginPage = new LoginPage();
        loginPage.getDeveloperMame();

        Page aboutPage = new AboutPage();
        aboutPage.getDeveloperMame();
    }
}
