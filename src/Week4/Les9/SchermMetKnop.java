package Week4.Les9;
import Klassen.Les9.*;

import javax.swing.*;

public class SchermMetKnop {
    public static void main(String[] args) {
        JFrame scherm  = new JFrame("piep");
        scherm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        scherm.setSize(300, 300);
        JButton knop = new JButton("Klik hier");
        scherm.add(knop);
        scherm.setVisible(true);

        Schakelaar s = new Schakelaar();
        knop.addActionListener(s);
    }
}
