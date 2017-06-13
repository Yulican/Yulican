package DC;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 20150148
 */
public abstract class Actor {

    private int hp;
    private int mp;
    private int dg;
    private int dm;
    private int am;

    private int wis;
    private int dex;
    private int str;
    private int kon;
    
    public Actor(){
        wis=8;
        dex=8;
        str=8;
        kon=8;
    }

    abstract void sethp(int kon);

    abstract void setmp(int wis);

    abstract void setdg(int dex);

    abstract void setdm(int str);

    abstract void setam(int e);

    public int getHp() {
        return hp;
    }

    public int getMp() {
        return mp;
    }

    public int getDg() {
        return dg;
    }

    public int getDm() {
        return dm;
    }

    public int getAm() {
        return am;
    }

    public int getWis() {
        return wis;
    }

    public int getDex() {
        return dex;
    }

    public int getStr() {
        return str;
    }

    public int getKon() {
        return kon;
    }
    
}
