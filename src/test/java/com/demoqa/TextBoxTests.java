package com.demoqa;

import com.codeborne.selenide.Configuration;
import com.demoqa.pages.TestBoxTestsPage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TextBoxTests {
    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
//        Configuration.browser = FIREFOX;
//        Configuration.browserVersion = "100.0";
//        Configuration.holdBrowserOpen = true;
    }

    TestBoxTestsPage testBoxTestsPage = new TestBoxTestsPage();

    @Test
    void successTest() {
        testBoxTestsPage.openPage()
                .setName("Alex Egorov")
                .setEmail("alex@egorov.com")
                .currentAddress("Some address 1")
                .permanentAddress("Another address 1")
                .onSubmit()

                .resultName("Alex Egorov")
                .resultEmail("alex@egorov.com")
                .resultCurrent("Some address 1")
                .resultPermanent("Another address 1");
    }
}

