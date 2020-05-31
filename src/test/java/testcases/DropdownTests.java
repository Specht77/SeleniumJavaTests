package testcases;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropdownTests extends BaseTests{

    @Test
    public void testSelectOptio(){
        var dropdownPage = homePage.clickDropdown(); //clicando no link dropdown da homepage
        String option = "Option 1"; //instanciando variavel com a opcao que sera usada nas validacoes
        dropdownPage.selectFromDropdown(option); //selecionando no dropdown a opcao da variavel
        var selectedOptions = dropdownPage.getSelectedOptions(); //instanciando variavel com a opcao que esta selecionada
        assertEquals(selectedOptions.size(),1 ,"Incorrect number of selections"); //valida o tamanho da lista
        assertTrue(selectedOptions.contains(option), "Option not selected"); //valida se o que foi selecionado é o conteúdo da variavel instanciada acima
    }

    @Test
    public void testModifyDropdown(){
        var dropdownPage = homePage.clickDropdown();
        String option1 = "Option 1";
        String option2 = "Option 2";
        dropdownPage.modifyDropdown();
        dropdownPage.selectFromDropdown(option1);
        dropdownPage.selectFromDropdown(option2);
        var selectedOptions = dropdownPage.getSelectedOptions();
        //System.out.println(selectedOptions);
        //assertEquals(selectedOptions.size(), 2, "incorrect number of selections");
        assertTrue(selectedOptions.contains(option1), "Option 1 not selected");
        assertTrue(selectedOptions.contains(option2), "Option 2 not selected");

    }
}
