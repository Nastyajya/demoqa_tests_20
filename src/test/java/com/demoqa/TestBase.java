package com.demoqa;

import com.codeborne.selenide.Configuration;
import com.demoqa.pages.TestBoxTestsPage;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {
    TestBoxTestsPage testBoxTestsPage = new TestBoxTestsPage();
    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
    }
}
