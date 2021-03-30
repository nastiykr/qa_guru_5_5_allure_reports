package lambda.tests;

import configuration.BaseTest;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class GitHubLambdaTest extends BaseTest {

    private final static String REPOSITORY = "nastiykr/qa_guru_5_5_allure_reports";
    private final static String TAB = "Issue";

    @Test
    void searchIssueTabTest() {
        step("Open main page", (step) ->
        {
            step.parameter("url", "");
            open("");
        });


        step("Search repository", (step) ->
        {
            step.parameter("url", REPOSITORY);
            $(".header-search-input").click();
            $(".header-search-input").val(REPOSITORY).pressEnter();
        });


        step("Move to repository", (step) ->
        {
            step.parameter("url", REPOSITORY);
            $(By.linkText(REPOSITORY)).click();
        });


        step("Issue have tab", (step) ->
        {
            step.parameter("tab", TAB);
            $(withText("Issues")).click();
            $(".blankslate h3").shouldHave(text("Welcome to issues!"));
        });
    }
}
