package selenide.tests;

import configuration.BaseTest;
import org.junit.jupiter.api.Test;
import selenide.pages.GitHubPage;

public class GitHubSelenideTests extends BaseTest {

    private final static String REPOSITORY = "nastiykr/qa_guru_5_5_allure_reports";
    private final static String TAB = "Issue";

    GitHubPage gitHubPage = new GitHubPage();

    @Test
    void searchIssueTabTest() {
        gitHubPage.openPage("")
                .search(REPOSITORY)
                .goToRepository(REPOSITORY)
                .checkData(TAB);
    }
}
