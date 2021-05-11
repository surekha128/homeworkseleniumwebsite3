package browserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class IEWatford {
    public static void main(String[] args) {
        String baseurl="https://www.wcht.org.uk/";
        System.setProperty("webdriver.ie.driver","drivers/IEDriverServer.exe");

        WebDriver driver= new InternetExplorerDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseurl);

        String title = driver.getTitle();
        System.out.println(title);

        boolean verifyTitle = title.equals("Watford Community Housing homepage | Watford Community Housing");
        boolean verifyTitleContains = title.contains("login");
        System.out.println(verifyTitle);
        System.out.println(verifyTitleContains);
        System.out.println(title.length());
    }
}
