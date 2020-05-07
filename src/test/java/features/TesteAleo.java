package features;

import features.step_definitions.Exercicio01;
import features.step_definitions.Exercicio02;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static features.support.Env.getDriver;
import static features.support.Env.setUpDriver;

public class TesteAleo {

    @BeforeTest
    public void beforTeste(){
        String word = "chrome";
        setUpDriver(word);
    }

    @Test
    public void exercicio01(){
        Exercicio01.resolucao();
    }

    @Test
    public void exercicio02(){
        Exercicio02.resolucao();
    }

    @AfterTest
    public void afterTest(){
        getDriver().close();
        getDriver().quit();
    }

}
