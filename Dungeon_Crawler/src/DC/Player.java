/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DC;

/**
 *
 * @author 20150148
 */
public class Player extends Actor{
    
    public Player(int k,int w, int d, int s){
        super.setDex(d);
        super.setKon(k);
        super.setWis(w);
        super.setStr(s);
    }

    @Override
    void sethp(int kon) {
        super.setHp((int)Math.round(kon*Math.PI));
    }

    @Override
    void setmp(int wis) {
        super.setMp(wis);
    }

    @Override
    void setdg(int dex) {
        super.setDg((int)Math.round(55/(1+(55-1)*Math.pow(Math.E,((Math.log1p((55/27+1)/54)/50)*super.getDex())))));
    }

    @Override
    void setdm(int str) {
        super.setDg((int)Math.round(super.getDg()*Math.PI));
    }

    @Override
    void setam(int e) {
       super.setAm(e);
    }

    @Override
    void setmaxhp(int hp) {
        super.setMaxhp((int)Math.round(super.getKon()*Math.PI));
    }

    @Override
    void setmaxmp(int mp) {
       super.setMaxmp((int)Math.round(super.getWis()*Math.E));
    }


}
