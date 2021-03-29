package annotations.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GitHubPage {
    @Step("Open main page {url}")
    public void openPage(String url) {
        open(url);
    }

    @Step("Search {repository}")
    public void search(String repository) {
        $(".header-search-input").click();
        $(".header-search-input").val(repository).pressEnter();
    }

    @Step("Move to {repository}")
    public void goToRepository(String repository) {
        $(By.linkText(repository)).click();
    }

    @Step("Check tab {tab}")
    public void checkData(String tab) {
        $(withText(tab)).click();
        $(".blankslate h3").shouldHave(text("Welcome to issues!"));

    }
}
