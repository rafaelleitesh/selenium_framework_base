package page;

import core.DriverFactory;

public class HomePage {

    public void accessHomePage() {
        DriverFactory.getDriver().get("https://google.com.br/");
    }

}
