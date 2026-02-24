package Decorator.ConcreteDecorator;

import Decorator.Printer;
import Decorator.PrinterDecorator;

public class EncryptedPrinter extends PrinterDecorator {

    public EncryptedPrinter(Printer printer) {
        super(printer);
    }

    private String encrypt(String message) {
        StringBuilder encrypted = new StringBuilder();
        for (char c : message.toCharArray()) {
            encrypted.append((char) (c + 3));
        }
        return encrypted.toString();
    }

    @Override
    public void print(String message) {
        super.print(encrypt(message));
    }
}