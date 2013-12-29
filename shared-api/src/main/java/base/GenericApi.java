package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created with IntelliJ IDEA.
 * User: rrt
 * Date: 12/29/13
 * Time: 12:15 PM
 * To change this template use File | Settings | File Templates.
 */
public class GenericApi {

    public WebDriver driver = null;
    String url = "http://www.cnn.com";
    @BeforeClass
    public void setUp(){
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.navigate().to(url);
        driver.manage().window().maximize();
    }
    //click element
    public void clickByCss(String locator){
        try{
        driver.findElement(By.cssSelector(locator)).click();
        }catch(Exception ex){
            System.out.println(ex);
        }
    }

    public void clickByXpath(String locator){
        driver.findElement(By.xpath(locator)).click();
    }
    public void clickById(String locator){
        driver.findElement(By.id(locator)).click();
    }
    public void clickByName(String locator){
        driver.findElement(By.name(locator)).click();
    }
    public String getUrl(){
        String st = driver.getCurrentUrl();
        return st;
    }

}
