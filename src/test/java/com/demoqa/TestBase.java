package com.demoqa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {
    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        //       Configuration.brower = "chrome";
        //    Configuration.timeout = 3000;

        Configuration.holdBrowserOpen = true;
    }
}
