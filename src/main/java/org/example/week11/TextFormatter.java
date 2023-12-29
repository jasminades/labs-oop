package org.example.week11;


public interface TextFormatter {
    String formatText(String text);
}


public class UpperCaseFormatter implements TextFormatter {
    @Override
    public String formatText(String text) {
        return text.toUpperCase();
    }
}


public class LowerCaseFormatter implements TextFormatter {
    @Override
    public String formatText(String text) {
        return text.toLowerCase();
    }
}


public class CamelCaseFormatter implements TextFormatter {
    @Override
    public String formatText(String text) {
        String[] words = text.split(" ");
        StringBuilder result = new StringBuilder(words[0].toLowerCase());
        for (int i = 1; i < words.length; i++) {
            result.append(words[i].substring(0, 1).toUpperCase()).append(words[i].substring(1).toLowerCase());
        }
        return result.toString();
    }
}


public class TextEditor {
    private TextFormatter textFormatter;

    public void setFormatter(TextFormatter textFormatter) {
        this.textFormatter = textFormatter;
    }

    public String formatText(String text) {
        if (textFormatter == null) {
            throw new IllegalStateException("Text formatter is not set.");
        }
        return textFormatter.formatText(text);
    }
}


public class Main {
    public static void main(String[] args) {

        TextEditor textEditor = new TextEditor();


        textEditor.setFormatter(new UpperCaseFormatter());
        System.out.println("Uppercase: " + textEditor.formatText("Hello, Strategy Pattern!"));

        textEditor.setFormatter(new LowerCaseFormatter());
        System.out.println("Lowercase: " + textEditor.formatText("Hello, Strategy Pattern!"));

        textEditor.setFormatter(new CamelCaseFormatter());
        System.out.println("Camelcase: " + textEditor.formatText("Hello, Strategy Pattern!"));
    }
}
