package okv.selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumusedtable {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\IFOCUS\\eclipse-workspace\\Seleniumex1\\library\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
//		table with and xpath
		List<WebElement> column = driver.findElements(By.xpath("//table[@id='table_id']//th"));
		int columncount = column.size();
		System.out.println(columncount);
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='table_id']//tr"));
		int rowscount = rows.size();
		System.out.println(rowscount);
		WebElement train = driver.findElement(By.xpath("//td[text()='Learn to interact with Elements']//following::td[1]"));
		String value = train.getText();
		System.out.println(value);
		List<WebElement> fullprogress = driver.findElements(By.xpath("//td[2]"));
		List<Integer> total = new ArrayList<Integer>();
		for (WebElement allvalues : fullprogress)
		{
			String strings = allvalues.getText().replace("%", "");
			total.add( Integer.parseInt(strings));
		}
		System.out.println(total+"all values");
 
		int smallvalue = Collections.min(total);
		System.out.println(smallvalue);

        String lowvalue = Integer.toString(smallvalue)+"%";	
        
     String finalxpath =  ("//td[text()="+"\""+lowvalue+"\""+"]"+"//following::td[1]");
		System.out.println(finalxpath);
     WebElement check = driver.findElement(By.xpath("//td[text()='30%']//following::td[1]"));
	 check.click();	
//		WebElement chack = driver.findElement(By.xpath(finalxpath));
//		chack.click();

    










	}
}
