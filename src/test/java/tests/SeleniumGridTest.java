package tests;

import org.testng.annotations.Test;

import static utilities.SeleniumGridDrivers.remoteDriverChromeOptions;

public class SeleniumGridTest {

    @Test
    public void test01() {
        remoteDriverChromeOptions().get("https://www.amazon.com");
    }
}
