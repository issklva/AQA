package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class uMamaRegistration {

    @Test

    public void testPageTitle() {

        open("https://www.u-mama.ru/");
        $x("(//a[@href='/forum/'])[1]").shouldHave(text("Форумы"));
        $x("//a[@href='/user/registration.php']").click();
        $x("//input[@placeholder=\"Укажите имя \"]").setValue("Petr");
        $x("//input[@placeholder=\"Укажите имя \"]").shouldHave(value("Petr"));
        $(By.id("nick")).setValue("MyNick456");
        $(By.id("nick")).shouldHave(Condition.value("MyNick456"));
        $(By.id("pass")).setValue("123456").shouldHave(value("123456"));
        SelenideElement dayOfBirth= $(By.id("dd"));
        dayOfBirth.selectOptionByValue("25");
        dayOfBirth.getSelectedOption().shouldHave(text("25"));

        SelenideElement mounthOfBirth= $(By.id("mm"));
        dayOfBirth.selectOptionByValue("4");
        dayOfBirth.getSelectedOption().shouldHave(text("4"));
        $(By.id("dtby")).setValue("1995");
        $(By.id("dtby")).shouldHave(value("1995"));

        $(By.id("gender")).selectOptionByValue("1");
        $(By.id("gender")).getSelectedOption().shouldHave(text("Мужской"));
        $(By.id("submit")).click();
        $x("//h1").shouldHave(text("Регистрация"));

        $(By.id("customer_phone")).setValue("9022596608");
        $(By.id("politic")).click();
        $(By.id("submit")).click();

        $(".alert-danger").shouldHave(text("Не более двух регистраций в сутки."));

       // $("#phone_code_cont .control-label").shouldHave(text("Код подтверждения"));














    }

    @Test
    public void testForm() {
        open("https://demoqa.com/automation-practice-form");
        SelenideElement firstName = $(By.id("firstName"));

        $x("//h1[@class='text-center']").shouldBe(visible);
        $x("//h1[@class='text-center']").shouldHave(text("Practice Form"));
        firstName.setValue("John");


        //        SelenideElement lastName = $(By.id("lastName"));
//        SelenideElement emailField = $(By.id("userEmail"));
//        SelenideElement genderCheck = $x("(//input[@class='custom-control-input'])[2]");
//        SelenideElement mobileNumber = $x("(//input[@id='userNumber']");
//        SelenideElement dateOfBirthField = $x("(//input[@id='dateOfBirthInput']");
//        SelenideElement dateOfBirthMounth = $x("(//select[@class='react-datepicker__month-select']");
//        SelenideElement dateOfBirthYear = $x("(//select[@class='react-datepicker__year-select']");
//        SelenideElement selectMounth = $x("(//select[@class='react-datepicker__month-select']/option[@value='2']"); //выбираем март
//        SelenideElement selectYear = $x("(//select[@class='react-datepicker__year-select']/option[@value='1995']");
//
//
//       SelenideElement dateElement = $(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--005' and contains(@aria-label, 'November 5th, 2024')]"));


    }

}
