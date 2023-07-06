package com.demoqa;

import com.codeborne.selenide.Configuration;
import com.demoqa.pages.TestBoxTestsPage;
import com.demoqa.utils.RandomUtils;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {
    TestBoxTestsPage testBoxTestsPage = new TestBoxTestsPage();
    RandomUtils randomUtils = new RandomUtils();
    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
    }
}
