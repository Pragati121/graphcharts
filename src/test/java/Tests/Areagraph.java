package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Areagraph {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        By clickOnAccceptCookies = By.xpath("//a[contains(text(), 'Allow all cookies ')]");

        driver = new ChromeDriver();
        driver.navigate().to("https://www.highcharts.com/docs/chart-and-series-types/area-chart");
        driver.manage().window().maximize();
        driver.findElement(clickOnAccceptCookies).click();
        driver.navigate().refresh();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)", "");

        driver.switchTo().frame(0);
        List<WebElement> graph = driver.findElements(By.xpath("(//*[local-name()='svg']//*[local-name()='g' and @transform='translate(74,71) scale(1 1)'])[4]//*[local-name()='path']"));
        System.out.println(graph.size());
        Actions hover = new Actions(driver);
        for (WebElement e : graph) {
            hover.moveToElement(e).perform();
            hover.clickAndHold(e).perform();
            String text = driver.findElement(By.xpath("//*[local-name()='svg']//*[local-name()='g' and @data-z-index='8']//*[name()='text' and @data-z-index='1' ]")).getText();
            System.out.println(text);
        }
    }

}