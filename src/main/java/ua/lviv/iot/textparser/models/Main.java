package ua.lviv.iot.textparser.models;

import ua.lviv.iot.textparser.processors.StringProcessor;

import java.util.Scanner;

public final class Main {

    private Main() { }

    public static String readInputText() {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            return scanner.nextLine();
        }
        return null;
    }

    public static void main(final String[] args) {
        StringProcessor tpm = new StringProcessor();
        tpm.setText(readInputText());
        tpm.processText();
        System.out.println("Processed text:");
        System.out.println(tpm.showResults());
    }
}
