package View;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class SeatSelectionForm extends JFrame {
    private JPanel panel;
    private JButton confirmSelectionButton;
    private JTextField selection;
    private JTextField price;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JRadioButton radioButton3;
    private JRadioButton radioButton4;
    private JRadioButton radioButton5;
    private JRadioButton radioButton6;
    private JRadioButton radioButton7;
    private JRadioButton radioButton8;
    private JRadioButton radioButton9;
    private JRadioButton radioButton10;
    private JRadioButton radioButton11;
    private JRadioButton radioButton12;
    private JRadioButton radioButton13;
    private JRadioButton radioButton14;
    private JRadioButton radioButton15;
    private JRadioButton radioButton16;
    private JRadioButton radioButton17;
    private JRadioButton radioButton18;
    private JRadioButton radioButton19;
    private JRadioButton radioButton20;
    private JRadioButton radioButton21;
    private JRadioButton radioButton22;
    private JRadioButton radioButton23;
    private JRadioButton radioButton24;
    private JRadioButton radioButton25;
    private JRadioButton radioButton26;
    private JRadioButton radioButton27;
    private JRadioButton radioButton28;
    private JRadioButton radioButton29;
    private JRadioButton radioButton30;
    private JRadioButton radioButton31;
    private JRadioButton radioButton32;
    private JRadioButton radioButton33;
    private JRadioButton radioButton34;
    private JRadioButton radioButton35;
    private JRadioButton radioButton36;
    private JRadioButton radioButton37;
    private JRadioButton radioButton38;
    private JRadioButton radioButton39;
    private JRadioButton radioButton40;
    private JRadioButton radioButton41;
    private JRadioButton radioButton42;
    private JRadioButton radioButton43;
    private JRadioButton radioButton44;
    private JRadioButton radioButton45;
    private JRadioButton radioButton46;
    private JRadioButton radioButton47;
    private JRadioButton radioButton48;
    private JRadioButton radioButton49;
    private JRadioButton radioButton50;
    private ArrayList<JRadioButton> buttons;

    public SeatSelectionForm() {
        setContentPane(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        selection.setEditable(false);
        price.setEditable(false);
        buttons = new ArrayList<>();
        groupButtons();
        pack();
        setLocationRelativeTo(null);
    }

    public void confirmSelection (ActionListener actionListener) {
        confirmSelectionButton.addActionListener(actionListener);
    }

    public void seatButtonListener (ActionListener actionListener) {
        for (JRadioButton radioButton : buttons) {
            radioButton.addActionListener(actionListener);
        }
    }

    public void groupButtons() {
        buttons.add(radioButton1);
        buttons.add(radioButton2);
        buttons.add(radioButton3);
        buttons.add(radioButton4);
        buttons.add(radioButton5);
        buttons.add(radioButton6);
        buttons.add(radioButton7);
        buttons.add(radioButton8);
        buttons.add(radioButton9);
        buttons.add(radioButton10);
        buttons.add(radioButton11);
        buttons.add(radioButton12);
        buttons.add(radioButton13);
        buttons.add(radioButton14);
        buttons.add(radioButton15);
        buttons.add(radioButton16);
        buttons.add(radioButton17);
        buttons.add(radioButton18);
        buttons.add(radioButton19);
        buttons.add(radioButton20);
        buttons.add(radioButton21);
        buttons.add(radioButton22);
        buttons.add(radioButton23);
        buttons.add(radioButton24);
        buttons.add(radioButton25);
        buttons.add(radioButton26);
        buttons.add(radioButton27);
        buttons.add(radioButton28);
        buttons.add(radioButton29);
        buttons.add(radioButton30);
        buttons.add(radioButton31);
        buttons.add(radioButton32);
        buttons.add(radioButton33);
        buttons.add(radioButton34);
        buttons.add(radioButton35);
        buttons.add(radioButton36);
        buttons.add(radioButton37);
        buttons.add(radioButton38);
        buttons.add(radioButton39);
        buttons.add(radioButton40);
        buttons.add(radioButton41);
        buttons.add(radioButton42);
        buttons.add(radioButton43);
        buttons.add(radioButton44);
        buttons.add(radioButton45);
        buttons.add(radioButton46);
        buttons.add(radioButton47);
        buttons.add(radioButton48);
        buttons.add(radioButton49);
        buttons.add(radioButton50);
    }

}
