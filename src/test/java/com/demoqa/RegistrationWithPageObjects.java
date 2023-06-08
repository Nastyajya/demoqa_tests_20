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
                .setSubmit();

        registrationPages
                .setResult("Student Name", "Alex Egorov")
                .setResult("Student Email", "EgorovA@gmail.com")
                .setResult("Gender", "Female")
                .setResult("Mobile", "8932127698")
                .setResult("Date of Birth", "1 April,1991")
                .setResult("Subjects", "Hindi")
                .setResult("Hobbies", "Sports")
                .setResult("Picture", "Test.jpg")
                .setResult("Address", "New York")
                .setResult("State and City", "NCR Noida");
    }
}

