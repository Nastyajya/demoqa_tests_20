package com.demoqa;

import org.junit.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationTest extends TestBase {

    @Test
    void successfulRegistrationTest() {
        open("https://demoqa.com/automation-practice-form");
        $("#firstName").setValue("Alex");
        $("#lastName").setValue("Egorov");
        $("#userEmail").setValue("EgorovA@gmail.com");
        $("#genterWrapper").$(byText("Female")).click();
        $("#userNumber").setValue("89321276981");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("April");
        $(".react-datepicker__year-select").selectOption("1991");
        $(".react-datepicker__day--001").click();
        $("#subjectsInput").setValue("h");
        $(byText("Hindi")).click();
        $("#hobbiesWrapper").$(byText("Sports")).click();
        $("#uploadPicture").uploadFromClasspath("Test.jpg");
        $("#CurrentAddress").setValue("New York");
        $("#state").click();
        $("#stateCity-wrapper").$(byText("NCR")).click();
        $("#city").click();
        $("#stateCity-wrapper").$(byText("Noida")).click();
        $("submit").click();

        $(".modal-body").$(byText("Alex Egorov")).shouldBe(visible);
        $(".modal-body").$(byText("EgorovA@gmail.com")).shouldBe(visible);
        $(".modal-body").$(byText("Female")).shouldBe(visible);
        $(".modal-body").$(byText("89321276981")).shouldBe(visible);
        $(".modal-body").$(byText("1 April,1991")).shouldBe(visible);
        $(".modal-body").$(byText("Hindi")).shouldBe(visible);
        $(".modal-body").$(byText("Sports")).shouldBe(visible);
        $(".modal-body").$(byText("test.jpg")).shouldBe(visible);
        $(".modal-body").$(byText("New York")).shouldBe(visible);
        $(".modal-body").$(byText("NCR Noida")).shouldBe(visible);
        $("#closeLargeModal").click();
    }
}

