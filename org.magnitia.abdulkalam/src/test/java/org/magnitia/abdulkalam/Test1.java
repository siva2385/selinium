package org.magnitia.abdulkalam;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 
{

	public static void main(String[] args) throws Exception
	{
		//get chrome driver software as per chrome version in our computer
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.gmail.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.close();
	}

}
