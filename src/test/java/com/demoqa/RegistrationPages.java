package com.demoqa;

import com.codeborne.selenide.SelenideElement;
import com.demoqa.pages.components.CalendarComponent;
import com.demoqa.pages.components.VerifyComponent;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationPages {
    CalendarComponent calendarComponent = new CalendarComponent();
    VerifyComponent verifyComponent = new VerifyComponent();
    //String LoginInputLocator = "#first_name"; // BAD PRACTICE
    SelenideElement
            firstNameInput = $("#firstname"),
            lastNameInput = $("#lastName"),
            userEmaileInput = $("#userEmail"),
            GenderWrapper = $("#genterWrapper"),
            userNumberInput = $("#userNumber"),
            birthDayInput = $("#dateOfBirthInput"),
            userSubjectsInput = $("#subjectsInput"),
            userHobbiesInput = $("#hobbiesWrapper"),
            userPictureInput = $("#uploadPicture"),
            userAddresInput = $("#currentAddress"),
            userStateInput = $("#stateCity-wrapper"),
            userCityInput = $("#stateCity-wrapper"),
            SubmitInput = $("#submit");


    public RegistrationPages openPage() {
        open("/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
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

    public RegistrationPages setUserNumber(String value) {
        userNumberInput.$(byText("value"));
        return this;
    }

    public RegistrationPages setBirthDay(String day, String month, String year) {
        $("#dateOfBirthInput").click();
        calendarComponent.setBirthDay(day, month, year);
        return this;
    }

    public RegistrationPages setSubjects(String value) {
        userSubjectsInput.setValue("value").pressEnter();
        return this;
    }

    public RegistrationPages setHobbies(String value) {
        userHobbiesInput.$(byText(value)).click();
        return this;
    }

    public RegistrationPages setPicture(String value) {
        userPictureInput.uploadFromClasspath(value);
        return this;
    }

    public RegistrationPages setAddres(String value) {
        userAddresInput.setValue("value");
        return this;
    }

    public RegistrationPages setState(String value) {
        userStateInput.$(byText("value")).click();
        return this;
    }

    public RegistrationPages setCity(String value) {
        userCityInput.$(byText("value")).click();
        return this;
    }

    public RegistrationPages setSubmit() {
        SubmitInput.click();
        return this;
    }

    public RegistrationPages setResult(String label, String value) {
        verifyComponent.verifyResult(label, value);
        return this;
    }

    public RegistrationPages closeTableClick() {
        verifyComponent.closeTable();
        return this;
    }
}











