package features.step_definitions;

import static features.helpers.Helper.switchToTabs;
import static features.pages.Home.abrirHome;
import static features.pages.Home.buscaCep;
import static features.pages.ResultadoCep.resultadoDoCep;

public class Exercicio01 {
    public static void resolucao(){
        abrirHome();
        buscaCep();
        switchToTabs(1);
        resultadoDoCep();
    }

}
