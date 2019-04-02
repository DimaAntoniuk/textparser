package ua.lviv.iot.textparser.processors;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringProcessorTest {

    private String inputText;
    private String expectedText;
    private StringProcessor stringProcessor;

    /*@BeforeEach
    void setUp() {
        inputText = "fasdnkjfb 4039u09j4j 4398urjnkfb jphk-nlh - ONFD  kcvm-x.";
        expectedText = "4039u09j4j jphk-nlh - kcvm-x.";
        stringProcessor = new StringProcessor(inputText);
    }*/

    @Test
    void processText() {
        inputText = "fasdnkjfb 4039u09j4j 4398urjnkfb jphk-nlh - ONFD  kcvm-x.";
        expectedText = "4039u09j4j jphk-nlh - kcvm-x.";
        stringProcessor = new StringProcessor(inputText);

        stringProcessor.processText();
        assertEquals(expectedText, stringProcessor.showResults(),
                "Processing error");
    }

    @Test
    void allDelete() {
        inputText = "another apartment at Athens";
        expectedText = "Empty line";
        stringProcessor = new StringProcessor(inputText);
        stringProcessor.processText();
        assertEquals(expectedText, stringProcessor.showResults(),
                "Processing error");
    }

    @Test
    void allStay() {
        inputText = "SSSSS";
        expectedText = "SSSSS";
        stringProcessor = new StringProcessor(inputText);
        stringProcessor.processText();
        assertEquals(expectedText, stringProcessor.showResults(),
                "Processing error");
    }

    @Test
    void littlePony() {
        inputText = "hello my little pony";
        expectedText = "hello my little pony";
        stringProcessor = new StringProcessor(inputText);
        stringProcessor.processText();
        assertEquals(expectedText, stringProcessor.showResults(),
                "Processing error");
    }


}