package tests;

import com.codeborne.selenide.SelenideElement;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class QaGuruLesson3CSS {


    @Test

    public void CodeForJunit5(){
        SelenideElement fieldOfSearch = $("span.flex-1[data-target='qbsearch-input.inputButtonText']");
        SelenideElement inputOfSearch = $("#query-builder-test");
        SelenideElement firstElement = $$("a.prc-Link-Link-85e08 span.Text__StyledText-sc-17v1xeu-0.fsOMbO.search-match").first();
        SelenideElement wiki = $("#wiki-tab");
       open("https://github.com/"); //открыть главную страницу
        fieldOfSearch.click();
        inputOfSearch.setValue("selenide").pressEnter();
        firstElement.click();
        //проверка
      // $(By.xpath("//div[@class=' d-flex flex-wrap flex-items-center wb-break-word f3 text-normal']")).shouldHave(text("selenide / selenide"));
        wiki.click();
//        $(By.xpath("//button[@class='Link--muted js-wiki-more-pages-link btn-link mx-auto f6']")).click(); TODO Replace for css selector
//        $(By.xpath("//div[@class=' js-wiki-sidebar-toggle-display']")).shouldHave(text("SoftAssertions"));
//        $(By.xpath("(//a[@href='/selenide/selenide/wiki/SoftAssertions'])[2]")).click();
//        $(By.xpath("//div[@class='markdown-body']")).shouldHave(text("Using JUnit5 extend test class:"));


        sleep(4000);







    }
}
