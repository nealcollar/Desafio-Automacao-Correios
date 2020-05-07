package features.step_definitions;

import static features.helpers.Helper.switchToTabs;
import static features.pages.Home.abrirHome;
import static features.pages.Home.buscaMultCeps;
import static features.pages.ResultadoCep.multiplosResultados;

public class Exercicio02 {
    public static void resolucao(){
        abrirHome();
        buscaMultCeps();
        switchToTabs(1);
        multiplosResultados();
    }

}
