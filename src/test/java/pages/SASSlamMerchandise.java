package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

public class SASSlamMerchandise extends BrowserDriver {

    public static String home_page_xpath = "//*[@id=\"menu\"]/ul/li[3]/a";
    public static String merch_page_xpath = "//*[@id=\"section2\"]/div/div/div[1]/div[2]/div[1]/a[1]";
    public static String product_xpath = "/html/body/section/div/div/div[2]/div/div/div/div[5]/div/a/div[1]/img";
    public static String sample_product_xpath = "/html/body/section/div/div/div[2]/div/div/div/div[5]/div/a/div[1]/img";
   // public static String sample_product_xpath = "//*[@id=\"section2\"]/div/div/div[1]/div[2]/div[1]/a[1]";



    public static void click_home_page_xpath() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(home_page_xpath)).click();

    }

    public static void click_merch_page_xpath() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(merch_page_xpath)).click();

    }

    public static void click_product_xpath() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(product_xpath)).click();

    }

    public static void sample_product() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(sample_product_xpath)).click();

    }

}
