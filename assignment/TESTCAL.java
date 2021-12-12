package assignment;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;




public class TESTCAL {
	
		WebDriver driver=null;
		@BeforeSuite
		public void setup()
		{
			System.setProperty("webdriver.gecko.driver", "C:\\driver chrome\\geckodriver-v0.29.1-win32\\geckodriver.exe");
		     driver = new FirefoxDriver();
			// 2. Maximize the Browser window
			driver.manage().window().maximize();
		}
		
	
@Test
public void multi() throws InterruptedException
{
			
			driver.get( "https://www.calculator.net/");
			//testcase 1 multification 
			
			WebElement four=driver.findElement(By.xpath("//div/div[2]/span[@onclick='r(4)']"));
			four.click();
			WebElement two=driver.findElement(By.xpath("//div/div[3]/span[@onclick='r(2)']"));
			two.click();
			WebElement three=driver.findElement(By.xpath("//div/div[3]/span[@onclick='r(3)']"));
			three.click();
			WebElement mul= driver.findElement(By.xpath("/html/body/div[3]/div/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/div/div[3]/span[4]"));
			mul.click();
			WebElement five=driver.findElement(By.xpath("//div/div[2]/span[@onclick='r(5)']"));
			five.click();
			WebElement twot=driver.findElement(By.xpath("//div/div[3]/span[@onclick='r(2)']"));
			twot.click();
			WebElement fivef=driver.findElement(By.xpath("//div/div[2]/span[@onclick='r(5)']"));
			fivef.click();
			//Thread.sleep(5000);
			
			String result1=driver.findElement(By.xpath("//*[@id='sciOutPut']")).getText();
		
		    System.out.println("result="+result1);
		    
		   //  assertEquals(222075, 222075, "");
		     WebElement clearagainadd=driver.findElement(By.xpath("/html/body/div[3]/div/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/div/div[5]/span[3]"));
			 clearagainadd.click();	 
		//	 Thread.sleep(5000);
}	

		
@Test (priority=1)

public void div() throws InterruptedException
{
		
			//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //Implict Wait

		     
	       // Thread.sleep(3000);
			WebElement four=driver.findElement(By.xpath("//div/div[2]/span[@onclick='r(4)']"));
			four.click();
			for (int i = 0; i < 3; i++)
			{
				WebElement zero=driver.findElement(By.xpath("//div/div[4]/span[@onclick='r(0)']"));
				zero.click();
			}
			
			WebElement div=driver.findElement(By.xpath("/html/body/div[3]/div/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/div/div[4]/span[4]"));
			div.click();
			WebElement two=driver.findElement(By.xpath("//div/div[3]/span[@onclick='r(2)']"));
			two.click();
			for (int i = 0; i < 2; i++)
			{
				WebElement zero=driver.findElement(By.xpath("//div/div[4]/span[@onclick='r(0)']"));
				zero.click();
			}
			
			
			//Thread.sleep(3000);
			
	
			String result2=driver.findElement(By.xpath("//*[@id='sciOutPut']")).getText();
			
		    System.out.println(result2);
		    
		    // assertEquals("20", result2);
		     WebElement clearagainadd=driver.findElement(By.xpath("/html/body/div[3]/div/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/div/div[5]/span[3]"));
			 clearagainadd.click();	
		    
	}


	
@Test (priority=2)	
public void add() throws InterruptedException
{
		
			
			WebElement mins=driver.findElement(By.xpath("/html/body/div[3]/div/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/div/div[2]/span[4]"));
			mins.click();
			for (int i = 2; i < 5; i++)
			{
				WebElement two=driver.findElement(By.xpath("//div/div[3]/span[@onclick='r(2)']"));
				two.click();
				WebElement three=driver.findElement(By.xpath("//div/div[3]/span[@onclick='r(3)']"));
				three.click();
				WebElement four=driver.findElement(By.xpath("//div/div[2]/span[@onclick='r(4)']"));
				four.click();
				WebElement twotw=driver.findElement(By.xpath("//div/div[3]/span[@onclick='r(2)']"));
				twotw.click();
				WebElement threethh=driver.findElement(By.xpath("//div/div[3]/span[@onclick='r(3)']"));
				threethh.click();
				WebElement fourfo=driver.findElement(By.xpath("//div/div[2]/span[@onclick='r(4)']"));
				fourfo.click();
				
				
			}
			
			WebElement add=driver.findElement(By.xpath("//html/body/div[3]/div/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/div/div[1]/span[4]"));
			add.click();
			
			for (int i = 2; i < 3; i++)
			{
				
				WebElement three=driver.findElement(By.xpath("//div/div[3]/span[@onclick='r(3)']"));
				three.click();
				WebElement four=driver.findElement(By.xpath("//div/div[2]/span[@onclick='r(4)']"));
				four.click();
				WebElement five=driver.findElement(By.xpath("//div/div[2]/span[@onclick='r(5)']"));
				five.click();
				WebElement threethh=driver.findElement(By.xpath("//div/div[3]/span[@onclick='r(3)']"));
				threethh.click();
				WebElement fourfo=driver.findElement(By.xpath("//div/div[2]/span[@onclick='r(4)']"));
				fourfo.click();
				WebElement fivesix=driver.findElement(By.xpath("//div/div[2]/span[@onclick='r(5)']"));
				fivesix.click();
			}
				String result3=driver.findElement(By.xpath("//*[@id='sciOutPut']")).getText();
				
				System.out.println(result3);
			  //  assertEquals(111111, result3);

				
			
			WebElement clearagainadd=driver.findElement(By.xpath("/html/body/div[3]/div/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/div/div[5]/span[3]"));
			clearagainadd.click();
		
			
	}
	
@Test	
void sub() throws InterruptedException
{
	WebElement two=driver.findElement(By.xpath("//div/div[3]/span[@onclick='r(2)']"));
	two.click();
	WebElement three=driver.findElement(By.xpath("//div/div[3]/span[@onclick='r(3)']"));
	three.click();
	WebElement four=driver.findElement(By.xpath("//div/div[2]/span[@onclick='r(4)']"));
	four.click();
	WebElement twoon=driver.findElement(By.xpath("//div/div[1]/span[@onclick='r(8)']"));
	twoon.click();
	WebElement twotw=driver.findElement(By.xpath("//div/div[3]/span[@onclick='r(2)']"));
	twotw.click();
	WebElement threthree=driver.findElement(By.xpath("//div/div[3]/span[@onclick='r(3)']"));
	threthree.click();
	WebElement minssub=driver.findElement(By.xpath("/html/body/div[3]/div/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/div/div[2]/span[4]"));
	minssub.click();		
	WebElement minssubon=driver.findElement(By.xpath("/html/body/div[3]/div/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/div/div[2]/span[4]"));
	minssubon.click();
	
			
	WebElement twodc=driver.findElement(By.xpath("//div/div[3]/span[@onclick='r(2)']"));
	twodc.click();
	WebElement thremie=driver.findElement(By.xpath("//div/div[3]/span[@onclick='r(3)']"));
	thremie.click();	
	WebElement zero=driver.findElement(By.xpath("//div/div[4]/span[@onclick='r(0)']"));
	zero.click();	
	WebElement twoonni=driver.findElement(By.xpath("//div/div[1]/span[@onclick='r(8)']"));
	twoonni.click();	
	WebElement fourni=driver.findElement(By.xpath("//div/div[2]/span[@onclick='r(4)']"));
	fourni.click();
	WebElement twoolon=driver.findElement(By.xpath("//div/div[1]/span[@onclick='r(8)']"));
	twoolon.click();
	WebElement twotwlop=driver.findElement(By.xpath("//div/div[3]/span[@onclick='r(2)']"));
	twotwlop.click();
	WebElement threthresde=driver.findElement(By.xpath("//div/div[3]/span[@onclick='r(3)']"));
	threthresde.click();
			
			
			String result4=driver.findElement(By.xpath("//*[@id='sciOutPut']")).getText();
			System.out.println("result4");
		    System.out.println(result4);
			// assertEquals(23329646, result4);
			
}
	
}



		 


		 
		
		 
		 
		 
	
		 
	


		
	

