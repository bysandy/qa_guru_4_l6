package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.*;

public class GoogleTests {

    @Test
    void selenideSearchTest() {
        // Открыть google
        open("https://www.google.com/");

        // Ввести Selenide в поиск
        $(byName("q")).setValue("Selenide").pressEnter();

        // Проверить, что Selenide появился в результатах поиска
        $("#search").shouldHave(text("selenide.org"));
    }

    @Test
    void searchForSelenideTest() {
        // Open ya.ru
        open("https://www.ya.ru/");

        // Fill in Selenide in search field
        $("#text").setValue("Selenide").pressEnter();

        // Check that  Selenide available in search results
        $("#search-result").shouldHave(text("selenide.org"));
    }
}
