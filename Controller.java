package Dictionari;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Controller implements ActionListener, KeyListener {
    private DictionaryFrame view;
    private Dictionary model;
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        String name = button.getName();
        if (name == R.BT_TRANSLATE) {
            translate();
        }
        if (name == R.BT_CLEAR) {
           view.setEngText("");
           view.setUkrText("");
        }
    }

    private void translate() {
        String engText = view.getEngText();
        String ukrText = model.translate(engText);
        view.setUkrText(ukrText);
    }
    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if(code == KeyEvent.VK_ENTER){
            translate();
        }
    }
    @Override
    public void keyReleased(KeyEvent e) {
        char c = e.getKeyChar();
        if (c>='а' && c<='я'){
            view.setEngText(view.getEngText().substring(0,view.getEngText().length()-1));
        }
    }

    public void setView(DictionaryFrame view) {
        this.view = view;
    }

    public void setModel(Dictionary model) {
        this.model = model;
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }
}
