package conroller;

import model.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.Random;

/**
 * Created by white on 25.04.2017.
 */
public class Cell {
    private JButton button;
    private SimpleDroid droid;

    public Cell(JButton button, SimpleDroid droid) {
        this.button = button;
        this.droid = droid;
        button.setBackground(Color.white);
        button.setEnabled(true);
    }

    public void setAction(ActionListener act) {
        button.addActionListener(act);
    }

    public void getHit(int dmg) {
        droid.getHit(dmg);
        if (!droid.isAlive()) {
            droid = null;
            button.setEnabled(false);
        }
    }

    public void getHeal(int healPower) {
        droid.getHeal(healPower);
    }

    public int getDamage() {

        if(droid instanceof  DroidKamikadze){
            int dmg=((DroidKamikadze) droid).getDamage();
            droid=null;
            return dmg;
        }

        if (droid instanceof BattleDroid) {
            return ((BattleDroid) droid).getDamage();
        } else return 0;
    }

    public int getHealPower() {
        if (droid instanceof DroidHealer) {
            return ((DroidHealer) droid).getHealPower();
        } else return 0;
    }

    public boolean isInstanceOfBattleDroid() {
        return droid instanceof BattleDroid;
    }

    public boolean isInstanceOfHealerDriod() {
        return droid instanceof DroidHealer;
    }

    public void setButtonColour(Color colour) {
        button.setBackground(colour);
    }




    public void setButtonHiddenStr(String message) {
        button.setName(message);
    }

    public boolean isNull() {
        return droid == null;
    }

    public void update() {
        if (button.getText().equals("Creating BD")) {
            droid = new BattleDroid();
            button.setText(droid.toString());
        } if (button.getText().equals("Creating DS")) {
            droid = new DroidSniper();
            button.setText(droid.toString());
        }  if (button.getText().equals("Creating DK")) {
            droid = new DroidKamikadze();
            button.setText(droid.toString());
        }  if (button.getText().equals("Creating DH")) {
            droid = new DroidHealer();
            button.setText(droid.toString());
        }

        if (droid==null) {
            button.setText("");
        } else
        {
            button.setText(droid.toString());

        }

    }

    public boolean isAlive() {
        return droid.isAlive();
    }

    public void setDroidToBattleDroid() {
        droid = new BattleDroid();
    }

    public void setDroidToSniper() {
        droid = new DroidSniper();
    }

    public void setDroidToDroidHealer() {
        droid = new DroidHealer();
    }

    public void setDroidToKamikadzeDroid() {
        droid = new DroidKamikadze();
    }

    public void setRandomDroid() {
        Random random = new Random();
        switch (random.nextInt(4)) {
            case 0:
                droid = new BattleDroid();
                break;
            case 1:
                droid = new DroidHealer();
                break;
            case 2:
                droid = new DroidKamikadze();
                break;
            case 3:
                droid = new DroidSniper();
                break;
        }

    }

    public SimpleDroid getDroid() {
        return droid;
    }
}


