package com.demoqa.pages.components;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class CityComponent {
    public void setState(String state) {
        $("#state").click();
        $("#stateCity-wrapper").$(byText(state)).click();
    }

    public void setCity(String city) {
        $("#city").click();
        $("#stateCity-wrapper").$(byText(city)).click();
    }
}
