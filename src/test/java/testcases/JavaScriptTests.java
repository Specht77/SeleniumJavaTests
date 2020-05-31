package testcases;

import testcases.BaseTests;
import org.testng.annotations.Test;

public class JavaScriptTests extends BaseTests {


    @Test
    public void testScrollTable(){
        homePage.clickLargeAndDeepDom().scrollToTable();

    }

    @Test
    public void testScrollToFifthParagraph(){
        homePage.clickInfiniteScroll().scrollToParagraph(5);
    }
}
