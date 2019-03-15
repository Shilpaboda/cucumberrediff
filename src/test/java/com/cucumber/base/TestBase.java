package com.cucumber.base;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestBase {
    public WebDriver driver;
    public Properties OR;
    public FileInputStream ip;
    public static int count=0;
    static TestBase t;

    public TestBase(){
        try {
            OR = new Properties();
            ip = new FileInputStream("src/test/java/com/cucumber/config/OR.properties");
            OR.load(ip);
        }catch (Throwable t){
            System.out.println("Properties files are not loaded properly...");
        }
    }



    public void openBrowser(String browser){
        if(OR.getProperty(browser).equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver","src/test/java/com/cucumber/drivers/geckodriver");
            driver = new FirefoxDriver();
        }else if(OR.getProperty(browser).equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver","src/test/java/com/cucumber/drivers/chromedriver");
            driver = new ChromeDriver();
        }else if(OR.getProperty(browser).equalsIgnoreCase("ie")){
            System.setProperty("webdriver.gecko.driver","src/test/java/com/cucumber/drivers/chromedriver");
            driver = new InternetExplorerDriver();
        }
    }

    public void closebrowser(){
        driver.quit();
    }

    public void navigateurl(String url) {
        driver.get(OR.getProperty(url));
        //Thread.sleep(2000);
    }


    public void click(String prop) throws InterruptedException, IOException {
        driver.findElement(By.xpath(OR.getProperty(prop))).click();
        Thread.sleep(2000);
    }

    /*public void allowcookiesbutton(){
        if(driver.findElements(By.xpath(OR.getProperty("allowcookies"))).size()>0){
            driver.findElement(By.xpath(OR.getProperty("allowcookies"))).click();
        }
    }*/

    public void typeElement(String prop, String text) throws IOException, InterruptedException {
        driver.findElement(By.xpath(OR.getProperty(prop))).sendKeys(text);
    }

    public void selectOption(String prop, String text) throws IOException, InterruptedException {
        driver.findElement(By.xpath(OR.getProperty(prop))).sendKeys(text);
    }

    public void screenshot(String testName) throws IOException, InterruptedException {
        count++;
        Thread.sleep(2000);
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("src/test/java/com/cucumber/screenshots/"+testName+"_"+count+".jpg"));
        // image
    }

    public static TestBase getInstance(){
        if(t==null){
           t= new TestBase();
           return t;
        }else {
           return t;
        }
    }

}
