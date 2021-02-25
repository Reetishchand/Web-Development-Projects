// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class Flow2Test {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  public String waitForWindow(int timeout) {
    try {
      Thread.sleep(timeout);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    Set<String> whNow = driver.getWindowHandles();
    Set<String> whThen = (Set<String>) vars.get("window_handles");
    if (whNow.size() > whThen.size()) {
      whNow.removeAll(whThen);
    }
    return whNow.iterator().next();
  }
  @Test
  public void flow2() {
    driver.get("http://localhost/Assign%203/authenticate.php");
    driver.manage().window().setSize(new Dimension(1550, 878));
    driver.findElement(By.linkText("Signup")).click();
    driver.findElement(By.linkText("Sign in")).click();
    driver.findElement(By.name("userName")).click();
    driver.findElement(By.name("userName")).sendKeys("reet");
    driver.findElement(By.name("password")).sendKeys("reet");
    driver.findElement(By.name("submit")).click();
    driver.findElement(By.cssSelector("#\\\'cs5301\\\' > p:nth-child(2)")).click();
    driver.findElement(By.cssSelector("#cs5301 .w3-button")).click();
    driver.findElement(By.cssSelector("#\\\'cs5333\\\' > p:nth-child(2)")).click();
    driver.findElement(By.cssSelector("#cs5333 .w3-button")).click();
    driver.findElement(By.id("\'cs6322\'")).click();
    driver.findElement(By.cssSelector("#cs6322 .w3-button")).click();
    vars.put("window_handles", driver.getWindowHandles());
    driver.findElement(By.linkText("Profile")).click();
    vars.put("win6783", waitForWindow(2000));
    vars.put("root", driver.getWindowHandle());
    driver.switchTo().window(vars.get("win6783").toString());
    driver.close();
    driver.switchTo().window(vars.get("root").toString());
    driver.findElement(By.id("search")).click();
    driver.findElement(By.id("search")).sendKeys("cs6314");
    vars.put("window_handles", driver.getWindowHandles());
    driver.findElement(By.linkText("CS 6314")).click();
    vars.put("win5756", waitForWindow(2000));
    driver.switchTo().window(vars.get("win5756").toString());
    driver.close();
    driver.switchTo().window(vars.get("root").toString());
    driver.findElement(By.id("search")).click();
    driver.findElement(By.id("search")).click();
    {
      WebElement element = driver.findElement(By.id("search"));
      Actions builder = new Actions(driver);
      builder.doubleClick(element).perform();
    }
    driver.findElement(By.id("search")).click();
    driver.findElement(By.name("namestud")).click();
    driver.findElement(By.name("namestud")).sendKeys("reet");
    vars.put("window_handles", driver.getWindowHandles());
    driver.findElement(By.linkText("Case1 reet 2020-04-06 05:55:51am")).click();
    vars.put("win4514", waitForWindow(2000));
    driver.switchTo().window(vars.get("win4514").toString());
    driver.findElement(By.name("row16sem")).click();
    driver.findElement(By.name("row16sem")).sendKeys("2");
    driver.findElement(By.name("update")).click();
    driver.findElement(By.id("AOS")).click();
    driver.findElement(By.name("update")).click();
    driver.findElement(By.name("namestud")).click();
    driver.findElement(By.name("namestud")).sendKeys("reet");
    driver.findElement(By.name("semadmit")).click();
    driver.findElement(By.name("semadmit")).sendKeys("spring 2019");
    driver.findElement(By.name("antgrad")).click();
    driver.findElement(By.name("antgrad")).sendKeys("may 2021");
    driver.findElement(By.name("core5")).click();
    driver.findElement(By.name("elec2")).click();
    {
      WebElement dropdown = driver.findElement(By.name("elec2"));
      dropdown.findElement(By.xpath("//option[. = 'CS6307 - Introduction to Big Data Management and Analytics']")).click();
    }
    driver.findElement(By.name("elec2")).click();
    {
      WebElement element = driver.findElement(By.cssSelector("div:nth-child(7) td:nth-child(2) > input"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector("div:nth-child(7) td:nth-child(2) > input"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector("div:nth-child(7) td:nth-child(2) > input"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    driver.findElement(By.cssSelector(".col-sm-3")).click();
    {
      WebElement dropdown = driver.findElement(By.name("elec1"));
      dropdown.findElement(By.xpath("//option[. = 'CS6324 - Information Security']")).click();
    }
    driver.findElement(By.name("elec1")).click();
    driver.findElement(By.name("elec5")).click();
    {
      WebElement dropdown = driver.findElement(By.name("elec5"));
      dropdown.findElement(By.xpath("//option[. = 'CS6381 - Combinatorics and Graph Algorithms']")).click();
    }
    driver.findElement(By.name("elec5")).click();
    driver.findElement(By.name("elec3")).click();
    {
      WebElement dropdown = driver.findElement(By.name("elec3"));
      dropdown.findElement(By.xpath("//option[. = 'CS6307 - Introduction to Big Data Management and Analytics']")).click();
    }
    driver.findElement(By.name("elec3")).click();
    driver.findElement(By.name("elec3")).click();
    {
      WebElement dropdown = driver.findElement(By.name("elec3"));
      dropdown.findElement(By.xpath("//option[. = 'CS6313 - Statistical Methods for Data Science']")).click();
    }
    driver.findElement(By.name("elec3")).click();
    driver.findElement(By.name("prereq1")).click();
    driver.findElement(By.name("prereq2")).click();
    driver.findElement(By.name("prereq3")).click();
    driver.findElement(By.name("prereq4")).click();
    driver.findElement(By.name("prereq5")).click();
    driver.findElement(By.name("prereq6")).click();
    driver.findElement(By.name("submit")).click();
    driver.findElement(By.linkText("Case3 reet 2020-04-06 06:08:04am")).click();
    driver.close();
    driver.switchTo().window(vars.get("root").toString());
    driver.findElement(By.linkText("Logout")).click();
  }
}