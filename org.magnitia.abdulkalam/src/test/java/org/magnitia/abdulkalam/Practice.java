package org.magnitia.abdulkalam;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice {

	public static void main(String[] args) 
	{
	 WebDriverManager.chromiumdriver().setup();
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.google.co.in/");	 
	 String x= driver.getTitle();
	 System.out.print(x);
	 if(x.equalsIgnoreCase("Google"))
	 {
		 System.out.println("Title test passed");
	 }
	 else
	 {
		 System.out.print("Title test Failed");
	 }

	}

}
