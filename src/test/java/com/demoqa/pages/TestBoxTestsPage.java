package com.demoqa.pages;

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
            submitButton = $("#submit"),
            fullNameResult = $("#output #name"),
            emailResult = $("#output #email"),
            currentResult = $("#output #currentAddress"),
            permanentResult = $("#output #permanentAddress");


    public TestBoxTestsPage openPage() {
        open("/text-box");
        return this;

    }

    public TestBoxTestsPage setFullName(String name) {
        userNameInput.setValue(name);
        return this;
    }

    public TestBoxTestsPage setEmail(String email) {
        userEmailInput.setValue(email);
        return this;
    }

    public TestBoxTestsPage setCurrent(String address) {
        userAddressInput.setValue(address);
        return this;

    }

    public TestBoxTestsPage setPermanent(String address) {
        addressInput.setValue(address);
        return this;
    }

    public void submitButtonClick() {
        submitButton.click();
    }

    public TestBoxTestsPage fullNameResult(String name) {
        fullNameResult.shouldHave(text(name));
        return this;
    }

    public TestBoxTestsPage emailResult(String email) {
        emailResult.shouldHave(text(email));
        return this;
    }

    public TestBoxTestsPage currentResult(String value) {
        currentResult.shouldHave(text(value));
        return this;
    }

    public TestBoxTestsPage permanentResult(String value) {
        permanentResult.shouldHave(text(value));
        return this;
    }
}




