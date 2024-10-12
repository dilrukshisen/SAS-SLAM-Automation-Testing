package pages;

import org.junit.Test;
import org.openqa.selenium.By;
import utility.BrowserDriver;

public class VenuePage extends BrowserDriver {

    public static String venue_main_menu_xpath = "//*[@id=\"menu\"]/ul/li[2]/a";
    //public static String tournament_guide_xpath= "//*[@id=\"section1\"]/div/div[1]/div[2]/div/a";
    public static String tournament_guide_xpath= "//*[@id=\"section0\"]/div/div/div[1]/div/div/div[2]/a";


    public static void click_venue_main_menu_xpath() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(venue_main_menu_xpath)).click();

    }

    public static void click_tournament_guide_xpath() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(tournament_guide_xpath)).click();
    }

}

