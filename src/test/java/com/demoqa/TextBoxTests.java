package com.demoqa;
import org.junit.jupiter.api.Test;

public class TextBoxTests extends TestBase {
    @Test
    void successTest() {
        testBoxTestsPage.openPage()
                .setFullName("Alex Egorov")
                .setEmail("alex@egorov.com")
                .setCurrent("Some address 1")
                .setPermanent("Another address 1")
                .submitButtonClick();

        testBoxTestsPage.fullNameResult("Alex Egorov")
                .emailResult("alex@egorov.com")
                .currentResult("Some address 1")
                .permanentResult("Another address 1");
    }
}

