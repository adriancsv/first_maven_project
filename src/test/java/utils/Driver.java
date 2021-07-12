package utils;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    private static Driver driver = null;
    public RemoteWebDriver webDriver;

    private Driver() {
        setNewDriver();
    }

    public static  Driver getInstance(){
        if(driver == null){
            driver = new Driver();
        }
        return driver;
    }

    public void setNewDriver(){
        try{
            if(webDriver!= null){
                webDriver.close();
                webDriver.quit();
            }
        }
        catch (Exception e){

        }
        finally {
            webDriver= null;
        }
        System.setProperty("webdriver.chrome.driver","C:\\Users\\daniel.iris\\IdeaProjects\\first_maven_project\\chromedriver_win32\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
    }

    public void exit() {
        try {
            if (webDriver != null) {
                webDriver.close();
                webDriver.quit();
            }
        } catch (Exception e) {

        } finally {
            webDriver = null;
            driver = null;
        }
    }

    public void navigate(){
        webDriver.get("https://www.google.ro/");
    }
}