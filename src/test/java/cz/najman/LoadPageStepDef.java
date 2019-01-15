package cz.najman;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java8.En;

import static org.junit.Assert.assertEquals;

public class LoadPageStepDef implements En {

    private WebDriver driver;

    public LoadPageStepDef() {
        Before(() -> {
            System.setProperty("webdriver.chrome.driver", "c:\\Users\\Amit\\Desktop\\myrepo\\driver\\chromedriver.exe");
            driver = new ChromeDriver();
        });
        String url = System.getProperty("url");
        When("^User opens google page$", () -> driver.get("http://www.google.com"));
        When("^User opens google page URL$", () -> driver.get(url));

             
        
    }

    
	}




