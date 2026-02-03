
package ConcreteB;


import Abstracts.TextField;

public class TextFieldB extends TextField {
    public TextFieldB(String text) {
        super(text);
    }

    @Override
    public void display() {
        System.out.println("| " + text + " |");
    }
}

