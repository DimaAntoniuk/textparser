package ua.lviv.iot.textparser.processors;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringProcessor {

    private String text;

    public StringProcessor() { }

    public StringProcessor(final String textArg) {
        this.text = textArg;
    }

    public final String getText() {
        return text;
    }

    public final void setText(final String textArg) {
        this.text = textArg;
    }

    public final void processText() {
        String textAfterProcessing = "";
        Pattern pattern = Pattern.compile("\\s+");
        String[] words = pattern.split(text);
        for (String word: words) {
            Pattern patternForWords = Pattern.compile("[AaOrK]");
            Matcher matcher = patternForWords.matcher(word);
            if (!matcher.find()) {
                textAfterProcessing = textAfterProcessing + word + " ";
            }
        }
        text = textAfterProcessing.trim();
    }

    public final String showResults() {
        if (text != "") {
            return this.text;
        } else {
            return "Empty line";
        }
    }

}
