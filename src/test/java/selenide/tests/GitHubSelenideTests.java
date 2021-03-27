package selenide.tests;

import org.junit.jupiter.api.Test;
import selenide.pages.GitHubPage;

public class GitHubSelenideTests extends BaseTest {

    private final String BASE_URL = "https://github.com";
    private final static String REPOSITORY = "nastiykr/qa_guru_5_5_allure_reports";
    private final static String TAB = "Issue";

    GitHubPage gitHubPage = new GitHubPage();

    @Test
    void searchIssueTabTest() {
        gitHubPage.openPage(BASE_URL);
        gitHubPage.search(REPOSITORY);
        gitHubPage.goToRepository(REPOSITORY);
        gitHubPage.checkData(TAB);
    }
}
