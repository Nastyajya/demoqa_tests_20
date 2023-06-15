package com.demoqa.utils;

import com.github.javafaker.Faker;

import java.util.concurrent.ThreadLocalRandom;


public class RandomUtils {
    static Faker faker = new Faker();

    public String getFirstName() {
        return faker.name().firstName();
    }

    public String getLastName() {
        return faker.name().lastName();
    }

    public String getEmail() {
        return faker.internet().emailAddress();
    }

    public String getRandomGender() {
        String[] genders = {"Male", "Female", "Other"};
        return faker.options().option(genders);
    }

    public int getRandomInt(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    public String getRandomNumber() {
        return faker.number().digits(10);
    }

    public String getRandomDay() {
        return String.format("%02d", faker.number().numberBetween(1, 28));
    }

    public String getRandomMonth() {
        String[] month = {"January", "February", "March", "April", "May", "June", "July", "August",
                "September", "October", "November", "December"};
        return faker.options().option(month);
    }

    public String getRandomYear() {
        return String.valueOf(getRandomInt(1950, 2019));
    }

    public String getRandomSubjects() {
        String[] subjects = {"Biology", "Hindi", "English", "Maths", "Accounting", "Arts"};
        return faker.options().option(subjects);
    }

    public String getRandomHobbies() {
        String[] hobbies = {"Sports", "Reading", "Music"};
        return faker.options().option(hobbies);
    }

    public String getRandomAddress() {
        return faker.address().fullAddress();
    }

    public String getRandomState() {
        String[] state = {"NCR", "Uttar Pradesh", "Haryana", "Rajasthan"};
        return faker.options().option(state);
    }

    public String getRandomCity(String state) {
        if (state.equals("NCR")) {
            String[] city = {"Delhi", "Gurgaon", "Noida"};
            return faker.options().option(city);
        } else if (state.equals("Uttar Pradesh")) {
            String[] city = {"Agra", "Merrut", "Lucknow"};
            return faker.options().option(city);
        } else if (state.equals("Haryana")) {
            String[] city = {"Karnal", "Panipat"};
            return faker.options().option(city);
        } else if (state.equals("Rajastha")) {
            String[] city = {"Jaipur", "Jaiselmer"};
            return faker.options().option(city);
        }
        return null;
    }
}






