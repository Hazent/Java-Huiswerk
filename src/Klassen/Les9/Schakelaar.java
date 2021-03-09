package Klassen.Les9;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Schakelaar implements ActionListener {
    boolean knopAan = false;

    @Override
    public void actionPerformed(ActionEvent e) {
        knopAan = !knopAan;
        if(knopAan){
            System.out.println("Het licht is aan");
        } else {
            System.out.println("Het licht is uit");
        }
    }
}
