package Code;

public class user {
    static int id;
    static int pass;

    public boolean isLogged() {
        return logged;
    }

     boolean logged;

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
