package Tests;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class sdnn {
    public static void main(String[] args) {
        By graphtextpath = By.xpath("(//*[local-name()='svg']//*[local-name()='g' and @transform='translate(46,53) scale(1 1)'])[1]");
        By clickOnAccceptCookies = By.xpath("//a[@id='CybotCookiebotDialogBodyButtonAccept']");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.highcharts.com/docs/chart-and-series-types/histogram-series");
        driver.navigate().refresh();
        driver.findElement(clickOnAccceptCookies).click();
        driver.findElement(clickOnAccceptCookies).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)", "");
        List<WebElement> graph = driver.findElements(graphtextpath);
        System.out.println(graph.size());
        Actions hover = new Actions(driver);
        for (WebElement e : graph) {
            hover.moveToElement(e).perform();
            hover.clickAndHold(e).perform();
        }
    driver.quit();
    }

}

