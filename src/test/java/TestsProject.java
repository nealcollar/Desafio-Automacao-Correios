import features.entities.Endereco;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.List;


public class TestsProject {

    public static void main(String[] args){

        WebDriver driver;
        WebElement busca_cep, buscar_button;
        List<WebElement> dados = new ArrayList<WebElement>();
       // Endereco enderecos = new Endereco(null, null, null, null);

        // System.setProperty("webdriver.chrome.driver", "C:\\Users\\augus\\Desktop\\cielo_test\\src\\Support\\Driver\\chromedriver.exe");
        //driver = new ChromeDriver();

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\augus\\Desktop\\cielo_test\\src\\Support\\Driver\\geckodriver.exe");
        driver = new FirefoxDriver ();

        try {
            driver.get("http://www.correios.com.br/");

            //comeco da navegacao busca simples
            busca_cep = driver.findElement(By.cssSelector("#acesso-busca"));
            buscar_button = driver.findElement(By.cssSelector("#acesso-busca+.bt-link-ic"));
            busca_cep.sendKeys("06540235");
            buscar_button.click();

            //trocar de tab
            //driver.switchTo().window(driver.getWindowHandle());
            ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
            driver.switchTo().window(tabs.get(1));


            //segunda tela pegando os dados
            dados =  driver.findElements(By.cssSelector("div > table > tbody > tr > td"));

            //atribuindo uma strutura para os dados coletados
            Endereco endereco = new Endereco(dados.get(2).getText(), dados.get(1).getText(), dados.get(3).getText(), dados.get(0).getText());

             //imprimindo na tela os dados capturados
             System.out.printf("seu endereco e: %s, %s, %s, %s", endereco.getLougradouro(), endereco.getBairro(), endereco.getLocalidade(), endereco.getCep());

        } finally {
            driver.close(); //stop interactions
            //driver.quit(); //close automation
        }

    }
}
