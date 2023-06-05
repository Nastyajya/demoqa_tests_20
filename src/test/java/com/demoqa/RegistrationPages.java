package com.demoqa;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationPages {
    //String LoginInputLocator = "#first_name"; // BAD PRACTICE
    SelenideElement
            firstNameInput = $("#firstname"),
            lastNameInput = $("#lastName"),
            userEmaileInput = $("#userEmail"),
            GenderWrapper = $("#genterWrapper");

    public RegistrationPages openPage() {
        open("https://demoqa.com/automation-practice-form");
        return this;
    }

    public RegistrationPages setFirstName(String value) {
        firstNameInput.setValue(value);
        return this;
    }

    public RegistrationPages setLastName(String value) {
        firstNameInput.setValue(value);
        return this;
    }

    public RegistrationPages setUserEmaile(String value) {
        firstNameInput.setValue(value);
        return this;
    }

    public RegistrationPages setGender(String value) {
        GenderWrapper.$(byText("value")).click();
        return this;
    }

}
