package stepdefinition;

import static com.selenium.beer.driver.Driver.getChromeDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseStepDefinition {
    ChromeDriver driver = getChromeDriver();
    protected final String BASE_URL = "https://www.csakajosor.hu/";
}
