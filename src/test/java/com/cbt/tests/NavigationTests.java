package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.WebDriver;

import static com.cbt.utilities.StringUtility.verifyEquals;

public class NavigationTests {
//  2. Go to website https://google.com.
//  3. Save the title in a string variable
//  4. Go to https://etsy.com
//  5. Save the title in a string variable
//  6. Navigate back to previous page
//  7. Verify that title is same is in step 3
//  8. Navigate forward to previous page
//  9. Verify that title is same is in step 5



    public static void main(String[] args) {

       // edge();
        chromeTest();
    }

    public static void chromeTest() {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("https://google.com");
          String saveTitle=driver.getTitle();
          driver.get(" https://etsy.com");
          String saveTitle2=driver.getTitle();
          driver.navigate().back();

          verifyEquals(saveTitle,saveTitle2);

          driver.navigate().forward();

          verifyEquals(saveTitle,saveTitle2);






    }


}


