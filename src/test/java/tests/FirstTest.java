package tests;

import org.testng.annotations.Test;
import utils.Driver;

public class FirstTest {

    public static Driver driver = null;


    @Test
    public void firstTest(){
        driver = Driver.getInstance();
        driver.navigate();
        driver.exit();
    }

}
