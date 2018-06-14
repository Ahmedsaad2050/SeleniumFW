package wikiPac;


import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class Wiki {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new ChromeDriver();
    System.setProperty("webdriver.chrome.driver","chromedriver.exe");
    baseUrl = "https://www.wikipedia.org/";
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
  }

  @Test
  public void testWiki0() throws Exception {
    driver.get(baseUrl + "/");
   driver.manage().window().maximize();
  // .resize_to(1280, 1024);


    Thread.sleep(2000);
try {
	Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"www-wikipedia-org\"]/h1/div/div")).getText(), "Wikipedia");  //Check for the title
System.out.println("The title check passed");
} catch (Exception e) {
	// TODO Auto-generated catch block
	System.out.println("The Title isn't (Wikipedia)");
}
   
  }
  @Test
  public void testWiki1() throws Exception {
   
    driver.findElement(By.xpath("//*[@id=\"searchInput\"]")).clear();			
    driver.findElement(By.cssSelector("#searchInput")).sendKeys("furry rabbits");		//Search for furry rabbits
    driver.findElement(By.cssSelector("button.pure-button.pure-button-primary-progressive")).click(); 
    try {
    	Assert.assertEquals(driver.findElement(By.cssSelector("#mw-content-text > div.searchdidyoumean")).getText(), "Did you mean: fury rabbit");  //Check for the title
    	System.out.println("The suggestion check passed");
    } catch (Exception e) {
    	// TODO Auto-generated catch block
    	System.out.println("There's no (Did you mean)");  									//Check for Did you mean
    }
    
   
  }
  
  
  
  @Test
  public void testWiki2() throws Exception {
   
   
    
    driver.findElement(By.xpath("//*[@id=\"mw-search-DYM-suggestion\"]/em")).click();
//    Thread.sleep(2000);
    String v = new String(driver.findElement(By.xpath("//*[@id=\"mw-search-top-table\"]/div[2]/strong[1]")).getText().getBytes("UTF-8"));
    try {
    	Assert.assertEquals(v,"1 – 20");														// Check for 20 results     
  	System.out.println("The results check passed");
    } catch (Exception e1) {
  	// TODO Auto-generated catch block
  	System.out.println("The results are not 20");
  }
  }
  
  @Test
  public void testWiki3() throws Exception {
   
    	
    driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div/ul/li[1]/div[1]/a")).click(); 
    try {
    	Assert.assertNotNull(driver.findElement(By.xpath("//*[@id=\"firstHeading\"]/i")));  //Check for the article title
    	System.out.println("The article title check passed");
    } catch (Exception e) {
    	// TODO Auto-generated catch block
    	System.out.println("There's no title for the article");  
    }
    
   
  }
  
  
  
  @Test
  public void testWiki4() throws Exception {
   
	  try {
	    	Assert.assertNotNull(driver.findElement(By.xpath("//*[@id=\"toc\"]")));  //Check for the article Table Of Content TOC
	    	System.out.println("The article TOC check passed");
	    } catch (Exception e) {
	    	// TODO Auto-generated catch block
	    	System.out.println("There's no TOC for the article");  
	    }
    
   
  }
  
  
  @Test
  public void testWiki5() throws Exception {
	  try {
	    	Assert.assertNotNull(driver.findElement(By.xpath("//*[@id=\"References\"]")));  //Check for the References 
	    	System.out.println("The article References check passed");
	    } catch (Exception e) {
	    	// TODO Auto-generated catch block
	    	System.out.println("There's no References for the article");  
	    }
	  
  }
  
  @Test
  public void testWiki6() throws Exception {
	  try {
		  Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"pt-anonuserpage\"]")).getText(),"Not logged in");  //Check the user isn't logged-in 
	    	System.out.println("The user isn't logged in & the check passed");
	    } catch (Exception e) {
	    	// TODO Auto-generated catch block
	    	System.out.println("The user isn't logged in");  
	    }
	  
  }
  
  
  @Test
  public void testWiki7() throws Exception {
	  driver.findElement(By.xpath("//*[@id=\"searchInput\"]")).clear();			
	    driver.findElement(By.cssSelector("#searchInput")).sendKeys("furry rabbits");		//Search for furry rabbits
	    driver.findElement(By.xpath("//*[@id=\"searchButton\"]")).click();
	    driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div[2]/p[2]/a[1]")).click();
	    String vv = new String(driver.findElement(By.xpath("//*[@id=\"mw-search-top-table\"]/div[2]/strong[1]")).getText().getBytes("UTF-8"));
	  
	    
	   
	    try {
	    	Assert.assertEquals(vv, "21 – 40");  								//Check for the paging feature
	    	System.out.println("The paging check passed");
	    } catch (Exception e) {
	    	// TODO Auto-generated catch block
	    	System.out.println("The paging feature isn't working fine");  
	    }
	  
  }

  @Test
  public void travelex() throws Exception {
	  org.openqa.selenium.Dimension d=new org.openqa.selenium.Dimension(500,500);
	  baseUrl="https://www.travelex.co.uk/";
    driver.get(baseUrl + "/");

driver.manage().window().setSize(d);
Thread.sleep(1000);
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("window.scrollBy(0,1000)");

driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/section[2]/article/div[1]/ul/li[2]/button")).click();
driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/section[2]/article/div[1]/ul/li[3]/button")).click();

try {
	Assert.assertEquals(driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/section[2]/article/div[1]/div/div/div[3]/div/h4/span/a")).getText(), "Buy foreign currency");  //Check for the third screen left
System.out.println("The 3rd swiped item check passed");
} catch (Exception e) {
	// TODO Auto-generated catch block
	System.out.println("The 3rd isn't available");
}
   
  }
  
  
  
  
  
  
  

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
