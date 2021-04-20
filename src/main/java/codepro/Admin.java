package codepro;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Admin {
     int id;
     int pass;
    boolean logged;
    Logger logger
            = Logger.getLogger(Admin.class.getName());
    public  Admin(){
        this.setId(123);
        this.setPass(123);
        this.setLogged(false);
    }


    public boolean isLogged() {
        return logged;
    }

    public boolean login(int a , int b) {
        if(a==this.id&&b==this.pass){
            logged=true;
            logger.log(Level.INFO,"logged in successfully");
        }
        else
            logger.log(Level.INFO,"you entered wrong information");
        return logged;
    }

    public void logOut() {
            logged=false;
    }

    public void setLogged(boolean logged) {
        this.logged = logged;
    }


    public int getId() {
        return id;
    }

    public int getPass() {
        return pass;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPass(int pass) {
        this.pass = pass;
    }

}
