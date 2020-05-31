package testcases;

import testcases.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class NestedFramesTests extends BaseTests {

    @Test
    public void TestText(){
        var framesPage = homePage.clickFrames();
        var nestedPage = framesPage.clickNestedFrames();

        assertEquals(nestedPage.switchToLeftFrame(), "LEFT", "Text Frame Incorrect");

        assertEquals(nestedPage.switchToBottomFrame(), "BOTTOM", "Text Frame Incorrect");;
    }
}
