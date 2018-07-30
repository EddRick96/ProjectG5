/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Erick
 */
public class Character {
    private int id;
    private String name;
    private int life;
    private int stamin;
    private int attack;
    private int finalAttack;
    
    public Character(){}

    public Character(int id, String name, int life, int stamin, int attack, int finalAttack) {
        this.id = id;
        this.name = name;
        this.life = life;
        this.stamin = stamin;
        this.attack = attack;
        this.finalAttack = finalAttack;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getFinalAttack() {
        return finalAttack;
    }

    public void setFinalAttack(int finalAttack) {
        this.finalAttack = finalAttack;
    }
    
}
