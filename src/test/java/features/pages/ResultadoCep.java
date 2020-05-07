package features.pages;

import features.entities.Endereco;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

import static features.helpers.Helper.*;

public class ResultadoCep {
    private static String tabelaResultadosCep = "div > table > tbody > tr > td",
                          buttonProximo = "a[href*=\"Proxima\"]";

    public static void resultadoDoCep(){
        List<WebElement> elements = new ArrayList<WebElement>();
        elements = findsByCssSelector(tabelaResultadosCep);
        Endereco resultado = new Endereco(
                elements.get(0).getText(),
                elements.get(1).getText(),
                elements.get(2).getText(),
                elements.get(3).getText()
        );
        resultado.imprimir();

    }

    public static void multiplosResultados(){
        int log = 0, bair = 1, loc = 2, cep = 3;
        List<WebElement> elements = new ArrayList<WebElement>();
        ArrayList<Endereco> listaEnderecos = new ArrayList<Endereco>();
        elements = findsByCssSelector(tabelaResultadosCep);
        int size = (elements.size()/4);

        for(int i = 0; i<size; i++){
            Endereco resultado = new Endereco(
                    elements.get(log).getText(),
                    elements.get(bair).getText(),
                    elements.get(loc).getText(),
                    elements.get(cep).getText()
            );
            resultado.imprimir();
            log += 4; bair += 4; loc += 4; cep += 4;
        }
        if( checkByCssSlector(buttonProximo)){
            WebElement element = findByCssSelector(buttonProximo);
            element.click();
            multiplosResultados();
        }
    }
}
