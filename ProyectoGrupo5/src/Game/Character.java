package Game;


import java.io.Serializable;

public class Character implements Serializable, Elements{
    
    private String name;
    private int life;
    private int stamin;
    private String element;
    private String image;
    public static boolean siteImage = true;
    
    
    public Character(){}

    public Character(String name, int life, int stamin, String element, String image) {
        
        this.name = name;
        this.life = life;
        this.stamin = stamin;
        this.element = element;
        this.image = image;
        imageElement();
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getStamin() {
        return stamin;
    }

    public void setStamin(int stamin) {
        this.stamin = stamin;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public int Attack() {
        switch (this.element) {
            case "Pyrus":
                return 110;
               // break;
            case "Aquos":
                return 100;
            case "Subterra":
                return 95;
            case "Ventus":
                return 140;
            default:
                return 0;
        }
        
    }

    @Override
    public int Defense() {
        return (int) (this.life+Attack()*0.6);
    }

    @Override
    public int Cure() {
        return (int) ((this.life *0.2) + this.life);
    }

    @Override
    public int FinalAttack() {
        switch (this.element) {
            case "Pyrus":
                return 230;
               // break;
            case "Aquos":
                return 210;
            case "Subterra":
                return 156;
            case "Ventus":
                return 200;
            default:
                return 0;
        }
    }

    @Override
    public String toString() {
        if(siteImage){
            return name;
        }else{
            return image;
        }
    }
    public String imageElement(){
        
        switch (this.element) {
            case "Pyrus":
                return "src/ElementsImage/Pyrus.png";
            case "Aquos":
                return "src/ElementsImage/Aquos.png";
            case "SubTerra":
                return "src/ElementsImage/Sub-terra.png";
            case "Ventus":
                return "src/ElementsImage/Ventus.jpg";
            default:
                return "";
        }
    }

}
