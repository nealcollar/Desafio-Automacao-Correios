package features.helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.List;

import static features.support.Env.getDriver;
import static features.support.Env.getWait;

public class Helper {


    public static WebElement findByCssSelector(String css) {
        WebElement element;
        try {
            getWait().until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(css)));
        }finally {
            return  element = getDriver().findElement(By.cssSelector(css));
        }
    }

    public static Boolean checkByCssSlector(String css){
        Boolean status = false;
        if ( findsByCssSelector(css).size() > 0){
            status = true;
        }
        return status;
    }

    public static List<WebElement> findsByCssSelector(String css) {
        List<WebElement> element;
        try {
            getWait().until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(css)));
        }finally {
            return  element = getDriver().findElements(By.cssSelector(css));
        }
    }

    public static void switchToTabs(int tab){
        ArrayList<String> tabs = new ArrayList<String>(getDriver().getWindowHandles());
        String tabSeguinte = "";
        for(String tabName:tabs){
            String nome = getDriver().switchTo().window(tabName).getTitle();
            if(nome.contains("resultadoBuscaCepEndereco")){
                tabSeguinte = tabName;
            }
        }
        getDriver().switchTo().window(tabSeguinte);
    }
}
