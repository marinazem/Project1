package Pages;

public class LoginPage extends Page{

    private String username;
    private String password;

    public void populateCredentials (){
        System.out.println(String.format("credentials are populated :%s, %s",username,password));
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void  getDeveloperMame(){
        System.out.println("John Smith");
    }

}
