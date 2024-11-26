package com.fithub.fithub_test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.test.context.SpringBootTest;

import java.net.URISyntaxException;
import java.net.URL;

@SpringBootTest
class FitHubTestAutomationApplicationTests {

	@Test
	void contextLoads() {
		// Poți lăsa acest test existent sau adăuga altele pentru aplicație.
	}

	@Test
	void seleniumTest() {
		// Configurează automat driverul pentru Chrome
		WebDriverManager.chromedriver().setup();

		// Creează o instanță de WebDriver
		WebDriver driver = new ChromeDriver();

		// Navighează pe Google
		driver.get("https://www.google.com");
		System.out.println("Page title is: " + driver.getTitle());

		// Închide browserul
		driver.quit();
	}
}
