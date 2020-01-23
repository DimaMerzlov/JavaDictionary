package Dictionari;
public class DictionaryRunner {
    public static void main(String[] args) {
        //MVC:

        //model:
        Dictionary d = new Dictionary();
        d.loadFromFile("EngUkr.txt");

        //view:
        DictionaryFrame dFrame = new DictionaryFrame();

        //controller
        Controller controller = new Controller();

        //links:
        dFrame.setController(controller);
        controller.setModel(d);
        controller.setView(dFrame);

    }
}
