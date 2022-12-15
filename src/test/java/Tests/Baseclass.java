package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Baseclass {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        WebDriverWait wait;
        By clickOnAccceptCookies = By.xpath("//a[contains(text(), 'Allow all cookies')]");
        By clickonGraph = By.xpath("((//*[local-name()='svg']//*[local-name()='g' and @transform='translate(74,71) scale(1 1)'])[4]//*[local-name()='path'])[1]");
//        By getText = By.xpath("//*[local-name()='svg']//*[local-name()='g' and @data-z-index='8']//*[name()='text' and @data-z-index='1' ]");

        driver = new ChromeDriver();
        driver.navigate().to("https://www.highcharts.com/docs/chart-and-series-types/area-chart");
        driver.manage().window().maximize();


        driver.findElement(clickOnAccceptCookies).click();
        driver.navigate().refresh();
        JavascriptExecutor j = (JavascriptExecutor) driver;
        j.executeScript("window.scrollBy(0,300)");

        driver.switchTo().frame(0);
        List<WebElement> graphlist = driver.findElements(By.xpath("((//*[local-name()='svg']//*[local-name()='g' and @transform='translate(74,71) scale(1 1)'])[4]//*[local-name()='path'])[1]"));
        System.out.println(graphlist.size());

//        Actions hover = new Actions(driver);
//        Thread.sleep(3000);
//        hover.moveToElement(driver.findElements(By.xpath("((//*[local-name()='svg']//*[local-name()='g' and @transform='translate(74,71) scale(1 1)'])[4]//*[local-name()='path'])"));
//        hover.moveToElement((WebElement) graphlist).perform();
//        Thread.sleep(5000);
        Thread.sleep(3000);
        Actions a = new Actions(driver);
        Thread.sleep(3000);


        driver.switchTo().frame(0);

        a.moveToElement(driver.findElement(By.xpath("((//*[local-name()='svg']//*[local-name()='g' and @transform='translate(74,71) scale(1 1)'])[4]//*[local-name()='path'])[1]"))).perform();
        a.clickAndHold().perform();
        System.out.println("dhafg");

    }


}


//*[local-name()='svg']//*[local-name()='text' ]
//*[local-name()='svg']//*[local-name()='text' and //@transform='translate(0,0) rotate(270 26.0888671875 223)']