package Dictionari;
import javax.swing.*;
import java.awt.*;

public class DictionaryFrame extends JFrame{
    private JTextField fieldEng;
    private JTextField fieldUkr;
    private JButton buttonTranslate;
    private JButton buttonClear;

    public void setController(Controller c){
        buttonTranslate.addActionListener(c);
        buttonClear.addActionListener(c);
        fieldEng.addKeyListener(c);
    }


    public DictionaryFrame() throws HeadlessException {
        JPanel panel = new JPanel(new GridLayout(3,2));
        panel.add(new JLabel("English"));
        panel.add(new JLabel("Ukrainian"));
        fieldEng = new JTextField(); panel.add(fieldEng);
        fieldUkr = new JTextField(); panel.add(fieldUkr);
        buttonTranslate = new JButton("Translate");
        buttonClear = new JButton("  Clear  ");
        buttonTranslate.setName(R.BT_TRANSLATE);
        buttonClear.setName(R.BT_CLEAR);
        panel.add(buttonTranslate);
        panel.add(buttonClear);
        this.setContentPane(panel);
        this.setSize(400,300);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void setEngText(String text) {
        fieldEng.setText(text);
    }
    public void setUkrText(String text) {
        fieldUkr.setText(text);
    }
    public String getEngText() {
        return fieldEng.getText();
    }
    public String getUkrText() {
        return fieldUkr.getText();
    }
}
