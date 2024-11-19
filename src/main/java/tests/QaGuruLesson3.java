package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class QaGuruLesson3 {


    @Test

    public void CodeForJunit5(){
        SelenideElement fieldOfSearch = $(By.xpath("//span[@class='flex-1' and @data-target='qbsearch-input.inputButtonText']"));
        SelenideElement inputOfSearch = $(By.xpath("//input[@id='query-builder-test']"));
        SelenideElement firstElement = $(By.xpath("(//span[@class='Text__StyledText-sc-17v1xeu-0 fsOMbO search-match'])[1]"));
        SelenideElement wiki = $(By.id("wiki-tab"));
        SelenideElement block = $(By.xpath("//div[@class=' d-flex flex-wrap flex-items-center wb-break-word f3 text-normal']"));
        SelenideElement showMore = $(By.xpath("//button[@class='Link--muted js-wiki-more-pages-link btn-link mx-auto f6']"));
        SelenideElement block2 = $(By.xpath("//div[@class=' js-wiki-sidebar-toggle-display']"));
        SelenideElement softAssertions = $(By.xpath("(//a[@href='/selenide/selenide/wiki/SoftAssertions'])[2]"));
        SelenideElement block3 = $(By.xpath("//div[@class='markdown-body']"));

        open("https://github.com/"); //открыть главную страницу
        fieldOfSearch.click();
        inputOfSearch.sendKeys("Selenide");
        inputOfSearch.pressEnter();
        firstElement.click();
        //поверка заголовка
        block.shouldHave(text("selenide / selenide"));
        wiki.click();
        showMore.click();
        block2.shouldHave(text("SoftAssertions"));
        softAssertions.click();
        block3.shouldHave(text("Using JUnit5 extend test class:"));


        sleep(4000);





    }
}
