package com.demoqa.pages.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestBoxTestsPage {
    SelenideElement
            userNameInput = $("#userName"),
            userEmailInput = $("#userEmail"),
            userAddressInput = $("#currentAddress"),
            addressInput = $("#permanentAddress"),
            clickInput = $("#submit"),
            nameResult = $("#output #name"),
            emailResult = $("#output #email"),
            currentResult = $("#output #currentAddress"),
            permanentResult = $("#output #permanentAddress");


    public TestBoxTestsPage openPage() {
        open("/text-box");
        return this;
    }

    public TestBoxTestsPage setName(String name) {
        userNameInput.setValue(name);
        return this;
    }

    public TestBoxTestsPage setEmail(String email) {
        userEmailInput.setValue(email);
        return this;
    }

    public TestBoxTestsPage currentAddress(String address) {
        userAddressInput.setValue(address);
        return this;

    }

    public TestBoxTestsPage permanentAddress(String address) {
        addressInput.setValue(address);
        return this;
    }

    public TestBoxTestsPage onSubmit() {
        clickInput.click();
        return this;
    }

    public TestBoxTestsPage resultName(String name) {
        nameResult.shouldHave(text(name));
        return this;
    }

    public TestBoxTestsPage resultEmail(String email) {
        emailResult.shouldHave(text(email));
        return this;
    }

    public TestBoxTestsPage resultCurrent(String value) {
        currentResult.shouldHave(text(value));
        return this;
    }

    public TestBoxTestsPage resultPermanent(String value) {
        permanentResult.shouldHave(text(value));
        return this;
    }
}



