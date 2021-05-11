package browserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class firefoxWatford {
    public static void main(String[] args) {
        String baseurl="https://www.wcht.org.uk/";
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseurl);
        String title = driver.getTitle();
        System.out.println(title);
        boolean verifyTitle = title.equals("Watford Community Housing homepage | Watford Community Housing");
        boolean verifyTitleContain = title.contains("login");
        System.out.println(verifyTitle);
        System.out.println(verifyTitleContain);
        System.out.println(title.length());

    }
}
