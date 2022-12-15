//package Pages;
//import Tests.Baseclass;
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import java.util.List;
//import java.util.Locale;
//public class LoginPage extends Baseclass {
//    public static void main(String[] args) {
//        WebDriver driver = null;
//        driver = new ChromeDriver();
//        driver.navigate().to("https://www.amazon.in/");
//        driver.manage().window().maximize();
//       By verifyingpage = By.xpath("//span[@class='hm-icon-label']");
//        String actual = driver.findElement(verifyingpage).getText();
//        System.out.println(actual);
//        Assert.assertEquals("All",actual);
//        List<WebElement> tabs = driver.findElements(By.xpath("//a[@class='nav-a  ']"));
//        WebElement element;
//        for (int i = 0; i < tabs.size(); i++) {
//            element = tabs.get(i);
//            System.out.println(element.getText().toUpperCase(Locale.ROOT));
//        }
//        By clickElectronics= By.xpath("//a[contains(text(),' Electronics ')]");
//        driver.findElement(clickElectronics).click();
//        List<WebElement> accessories = (List<WebElement>) driver.findElement(By.xpath("//li[contains(@class,'a-spacing-micro apb')]"));
//        WebElement items;
//        for(int j =0; j< accessories.size();j++)
//        {
//            items=accessories.get(j);
//            System.out.println(items.getText());
//        }
//
//        driver.close();
//    }
//}
