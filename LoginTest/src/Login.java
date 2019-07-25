public class Login{
    public Login(){
        int level = login();
    }

    public int login(){
        System.out.println("---Login---");
        System.out.print("Username: ");
        String username = Inputhandler.strChoice();
        System.out.println("Password: ");
        int password = Inputhandler.intChoice();
        checkLogin(username, password);
    }
    public static void checkLogin(){

    }

}
