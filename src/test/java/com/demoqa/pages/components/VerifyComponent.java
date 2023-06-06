package com.demoqa.pages.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class VerifyComponent {
    SelenideElement
            tableResponsive = $(".table-responsive"),
            closeTableButton = $("#closeLargeModal");

    public void verifyResult(String label, String value) {
        tableResponsive.$(byText(label)).sibling(0).shouldHave(text(value));

    }

    public void closeTable() {
        closeTableButton.click();

    }
}

