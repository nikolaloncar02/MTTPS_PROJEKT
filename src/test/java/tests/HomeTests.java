package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomeTests extends BaseTest {

    @Test
    public void testKontaktLink() {
        test = extent.createTest("testKontaktLink");
        HomePage home = new HomePage(driver);
        home.acceptCookies();
        home.openKontakt();

        try {
            Assert.assertTrue(driver.getCurrentUrl().contains("kontakt"));
            test.pass("Kontakt link PASSED");
        } catch (AssertionError e) {
            test.fail("Kontakt link FAILED: " + e.getMessage());
            throw e;
        }
    }

    @Test
    public void testDostavaLink() {
        test = extent.createTest("testDostavaLink");
        HomePage home = new HomePage(driver);
        home.acceptCookies();
        home.openDostava();

        try {
            Assert.assertTrue(driver.getCurrentUrl().contains("dostava"));
            test.pass("Dostava link PASSED");
        } catch (AssertionError e) {
            test.fail("Dostava link FAILED: " + e.getMessage());
            throw e;
        }
    }

    @Test
    public void testPageTitle() {
        test = extent.createTest("testPageTitle");
        HomePage home = new HomePage(driver);
        home.acceptCookies();

        try {
            Assert.assertTrue(driver.getTitle().contains("GymBeam"));
            test.pass("Page title PASSED");
        } catch (AssertionError e) {
            test.fail("Page title FAILED: " + e.getMessage());
            throw e;
        }
    }

    @Test
    public void testPrikaziFiltere() {
        test = extent.createTest("testPrikaziFiltere");
        HomePage home = new HomePage(driver);
        home.acceptCookies();
        home.openProteiniPage();
        home.clickFilterButton();

        test.pass("Prikaži filtere PASSED");
    }

    @Test
    public void testCategoriesVisible() {
        test = extent.createTest("testCategoriesVisible");
        HomePage home = new HomePage(driver);
        home.acceptCookies();

        String[] categories = {"Hrana", "Proteini", "Odjeća", "Top ponude"};

        try {
            for (String category : categories) {
                Assert.assertTrue(home.isCategoryVisible(category), category + " nije vidljiv");
                test.pass(category + " vidljiv");
            }
        } catch (AssertionError e) {
            test.fail("Category visibility FAILED: " + e.getMessage());
            throw e;
        }
    }
}
