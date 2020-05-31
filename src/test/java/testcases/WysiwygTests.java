package testcases;

import testcases.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WysiwygTests extends BaseTests {


    @Test
    public void testWysiwyg(){
        var editorPage = homePage.clickWysiwygEditor();
        editorPage.cleatTextArea();

        String text1 = "hello ";
        String text2 = "world";
        editorPage.setTextArea(text1);
        editorPage.decreaseIndention();
        editorPage.setTextArea(text2);
        assertEquals(editorPage.getTextFromEditor(), text1+text2, "Text frame incorrect");
    }
}
