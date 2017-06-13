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

    @Override
    void sethp(int kon) {
        super.setHp((int) (kon*Math.PI));
    }

    @Override
    void setmp(int wis) {
        super.setMp(wis);
    }

    @Override
    void setdg(int dex) {
        super.setDg((int)(55/(1+(55-1)*Math.pow(Math.E,((Math.log1p((55/27+1)/54)/50)*super.getDex())))));
    }

    @Override
    void setdm(int str) {
        super.setDg((int)(super.getDg()*Math.PI));
    }

    @Override
    void setam(int e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void setmaxhp(int hp) {
        super.setMaxhp((int)(super.getKon()*Math.PI));
    }

    @Override
    void setmaxmp(int mp) {
       super.setMaxmp((int)(super.getWis()*Math.E));
    }


}
