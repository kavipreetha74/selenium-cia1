package cia1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task1 {
public static void main(String[] args)
{
WebDriverManager.chromedriver().setup();
WebDriver driver;
ChromeOptions co = new ChromeOptions();
co.addArguments("--remote-allow-origins=*");
driver = new ChromeDriver(co);

driver.navigate().to("https://www.amazon.in/Apple-MacBook-Laptop-12%E2%80%91core-38%E2%80%91core/dp/B0BSHVCXN9/ref=sr_1_1?crid=2JOW8ZEP2G4PW&keywords=macbook+air+m2+pro+max&qid=1681292234&sprefix=macbook+air+m2+pro%2Caps%2C578&sr=8-1");
WebElement addtocart = driver.findElement(By.id("add-to-cart-button"));
addtocart.click();
WebElement check = driver.findElement(By.xpath("//*[@class=\"a-button-input\"]"));
check.click();
driver.navigate().to("https://www.amazon.in/gp/cart/view.html/ref=dp_atch_dss_cart?");
WebElement del = driver.findElement(By.xpath("//*[@class=\"a-color-link\"]"));
del.click();


}
}
