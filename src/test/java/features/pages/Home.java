package features.pages;

import org.openqa.selenium.WebElement;

import static features.helpers.Helper.findByCssSelector;
import static features.support.Env.getDriver;

public class Home {
    private static String siteParaAutomacao = "http://www.correios.com.br/",
            buscaCep = "#acesso-busca",
            buscarButton = "#acesso-busca+.bt-link-ic",
            cepInteiro = "06540235",
            cepParcial = "06540";

    private static WebElement element;

    public static void abrirHome(){
        getDriver().get(siteParaAutomacao);
    }

    public static void buscaCep(){
        element = findByCssSelector(buscaCep);
        element.sendKeys(cepInteiro);

        element = findByCssSelector(buscarButton);
        element.click();

    }

    public static void buscaMultCeps(){
        element = findByCssSelector(buscaCep);
        element.sendKeys(cepParcial);

        element = findByCssSelector(buscarButton);
        element.click();

    }

}
