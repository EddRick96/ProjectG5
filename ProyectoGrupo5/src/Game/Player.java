package Game;


import java.io.Serializable;

public class Player implements Serializable {
    
    private String name;
    private String lastName;
    private String id;
    private String user;
    private int victories;
    private int cont;
    public static int combox;
    
    public Player(){}

    public Player(int cont, String name, String lastName, String id, String user) {
        this.cont = cont;
        this.name = name;
        this.lastName = lastName;
        this.id = id;
        this.user = user;
       
    }
     
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    public int getVictories() {
        return victories;
    }

    public void setVictories(int victories) {
        this.victories = victories;
    }

    @Override
    public String toString() {
        switch (Player.combox) {
            case 0:
                return this.id;
            case 1:
                return this.user;
            default:
                break;
        }
        return null;
    }

    public int getCombox() {
        return combox;
    }

    public void setCombox(int combox) {
        Player.combox = combox;
    }
     
}
