package co.com.sofka.setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class WebSetup {
    private static final String DEMO_QA_URL = "https://demoqa.com/automation-practice-form";
    protected WebDriver driver;

    private void setupWebDriverUrl(int driverSelect) {
        switch (driverSelect) {
            case 1:
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--incognito");
                chromeOptions.addArguments("--disable-notifications");
                driver = new ChromeDriver(chromeOptions);
                break;
            case 2:
                edgeConfiguration();
                break;
            default:
                System.out.println("Ingrese opcion valida");

        }
        driver.get(DEMO_QA_URL);
        maximize();
    }


    private void edgeConfiguration() {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.setCapability("ms:inPrivate", true);
        edgeOptions.setCapability("ms:edgeChromium", true);
        edgeOptions.setCapability("ms:edgeOptions", "--headless");
        driver = new EdgeDriver(edgeOptions);
    }


    protected void generalSetup(int tipoDriver) {
        setupWebDriverUrl(tipoDriver);
    }

    protected void quiteDrive() {
        driver.quit();
    }

    private void maximize() {
        driver.manage().window().maximize();
    }


}