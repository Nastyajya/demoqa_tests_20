package com.demoqa.pages;

import com.codeborne.selenide.SelenideElement;
import com.demoqa.pages.components.CalendarComponent;
import com.demoqa.pages.components.VerifyComponent;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationPage {
    CalendarComponent calendarComponent = new CalendarComponent();
    VerifyComponent verifyComponent = new VerifyComponent();
    SelenideElement
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            userEmailInput = $("#userEmail"),
            GenderWrapper = $("#genterWrapper"),
            userNumberInput = $("#userNumber"),
            birthDayInput = $("#dateOfBirthInput"),
            userSubjectsInput = $("#subjectsInput"),
            userHobbiesInput = $("#hobbiesWrapper"),
            userPictureInput = $("#uploadPicture"),
            userAddressInput = $("#currentAddress"),
            userStateAndCityInput = $("#stateCity-wrapper"),
            userStateInput = $("#state"),
            userCityInput = $("#city"),
            submitButton = $("#submit");


    public RegistrationPage openPage() {
        open("/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
        return this;
    }

    public RegistrationPage setFirstName(String value) {
        firstNameInput.setValue(value);
        return this;
    }

    public RegistrationPage setLastName(String value) {
        lastNameInput.setValue(value);
        return this;
    }

    public RegistrationPage setUserEmail(String value) {
        userEmailInput.setValue(value);
        return this;
    }

    public RegistrationPage setGender(String value) {
        GenderWrapper.$(byText(value)).click();
        return this;
    }

    public RegistrationPage setUserNumber(String value) {
        userNumberInput.setValue(value);
        return this;
    }

    public RegistrationPage setBirthDay(String day, String month, String year) {
        birthDayInput.click();
        calendarComponent.setBirthDay(day, month, year);
        return this;
    }

    public RegistrationPage setSubjects(String value) {
        userSubjectsInput.setValue(value).pressEnter();
        return this;
    }

    public RegistrationPage setHobbies(String value) {
        userHobbiesInput.$(byText(value)).click();
        return this;
    }

    public RegistrationPage setPicture(String value) {
        userPictureInput.uploadFromClasspath(value);
        return this;
    }

    public RegistrationPage setAddress(String value) {
        userAddressInput.setValue(value);
        return this;
    }

    public RegistrationPage setState(String value) {
        userStateInput.click();
        userStateAndCityInput.$(byText(value)).click();
        return this;
    }

    public RegistrationPage setCity(String value) {
        userCityInput.click();
        userStateAndCityInput.$(byText(value)).click();
        return this;
    }

    public RegistrationPage onSubmit() {
        submitButton.click();
        return this;
    }

    public RegistrationPage verifyResult(String label, String value) {
        verifyComponent.verifyResult(label, value);
        return this;
    }

}











