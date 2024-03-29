package stepDefinitions;

import io.cucumber.java.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hooks extends BaseTest{

//    ChromeOptions options = new ChromeOptions();
//    options.setHeadless(true);
//    WebDriver driver = new ChromeDriver(options);
//    driver.get("https://selenium.dev");
//    driver.quit();

    @BeforeAll
    public static void initTest() throws InterruptedException {
    System.out.println("************ Begin Test");
    DriverSource.INSTANCE.getDriver();
    //Thread.sleep(2000);
}
    @AfterAll
    public static void endTest() throws InterruptedException {
        System.out.println("************ End Test");
        //Thread.sleep(2000);
        DriverSource.INSTANCE.getDriver().manage().window().minimize();
        DriverSource.INSTANCE.getDriver().quit();
    }
    @Before
    public void beforeScenario(Scenario s) {
        System.out.println("Before Scenario: " + s.getName());
    }
    @After
    public void afterScenario(Scenario s) {
        System.out.println("After  Scenario:" + s.getName());
    }
}