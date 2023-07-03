package com.demoqa;


import com.demoqa.pages.RegistrationPage;
import org.junit.jupiter.api.Test;

public class RegistrationWithPageObjects extends TestBase {
    RegistrationPage registrationPages = new RegistrationPage();

    @Test
    void successRegistrationTest() {
        registrationPages.openPage()
                .setFirstName("Alex")
                .setLastName("Egorov")
                .setUserEmail("EgorovA@gmail.com")
                .setGender("Female")
                .setUserNumber("89321276981")
                .setBirthDay("01", "April", "1991")
                .setSubjects("Hindi")
                .setHobbies("Sports")
                .setPicture("Test.jpg")
                .setAddress("New York")
                .setState("NCR")
                .setCity("Noida")
                .onSubmit();

        registrationPages
                .verifyResult("Student Name", "Alex Egorov")
                .verifyResult("Student Email", "EgorovA@gmail.com")
                .verifyResult("Gender", "Female")
                .verifyResult("Mobile", "8932127698")
                .verifyResult("Date of Birth", "1 April,1991")
                .verifyResult("Subjects", "Hindi")
                .verifyResult("Hobbies", "Sports")
                .verifyResult("Picture", "Test.jpg")
                .verifyResult("Address", "New York")
                .verifyResult("State and City", "NCR Noida");
    }
}

