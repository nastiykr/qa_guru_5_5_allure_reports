package selenide.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GitHubPage {

    public void openPage(String url) {
        open(url);
    }

    public void search(String repository) {
        $(".header-search-input").click();
        $(".header-search-input").sendKeys(repository);
        $(".header-search-input").pressEnter();
    }

    public void goToRepository(String repository) {
        $(By.linkText(repository)).click();
    }

    public void checkData(String tab) {
        $(withText(tab)).click();
        $(".blankslate h3").shouldHave(text("Welcome to issues!"));

    }
}
