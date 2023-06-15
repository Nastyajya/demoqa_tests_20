package com.demoqa;


import com.demoqa.pages.RegistrationPage;
import org.junit.jupiter.api.Test;

public class RegistrationWithFakerTest extends TestBase {
    RegistrationPage registrationPages = new RegistrationPage();

    @Test
    void successfulRegistrationTest() {
        String firstName = randomUtils.getFirstName(),
                lastName = randomUtils.getLastName(),
                email = randomUtils.getEmail(),
                gender = randomUtils.getRandomGender(),
                number = randomUtils.getRandomNumber(),
                day = randomUtils.getRandomDay(),
                month = randomUtils.getRandomMonth(),
                year = randomUtils.getRandomYear(),
                subjects = randomUtils.getRandomSubjects(),
                hobbies = randomUtils.getRandomHobbies(),
                failPicture = "Test.jpg",
                address = randomUtils.getRandomAddress(),
                state = randomUtils.getRandomState(),
                city = randomUtils.getRandomCity(state);


        registrationPages.openPage()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setUserEmail(email)
                .setGender(gender)
                .setUserNumber(number)
                .setBirthDay(day, month, year)
                .setSubjects(subjects)
                .setHobbies(hobbies)
                .setPicture(failPicture)
                .setAddress(address)
                .setState(state)
                .setCity(city)
                .onSubmit();

        registrationPages
                .verifyResult("Student Name", firstName + " " + lastName)
                .verifyResult("Student Email", email)
                .verifyResult("Gender", gender)
                .verifyResult("Mobile", number)
                .verifyResult("Date of Birth", day + " " + month + "," + year)
                .verifyResult("Subjects", subjects)
                .verifyResult("Hobbies", hobbies)
                .verifyResult("Picture", failPicture)
                .verifyResult("Address", address)
                .verifyResult("State and City", state + " " + city);
    }
}

