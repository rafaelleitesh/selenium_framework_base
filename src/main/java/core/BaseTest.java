package core;

import org.junit.After;
import org.junit.Before;
import page.HomePage;

public class BaseTest {
    private HomePage homePage = new HomePage();

    @Before
    public void openHomePage() {
        homePage.accessHomePage();
    }

    @After
    public void killCurrentDriver() {
        DriverFactory.killDriver();
    }
}
