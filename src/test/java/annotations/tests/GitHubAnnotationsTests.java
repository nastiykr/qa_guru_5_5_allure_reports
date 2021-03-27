package annotations.tests;

import annotations.pages.GitHubPage;
import io.qameta.allure.Feature;
import io.qameta.allure.Link;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Issue test with annotation")
public class GitHubAnnotationsTests extends BaseTest {

    private final String BASE_URL = "https://github.com";
    private final static String REPOSITORY = "nastiykr/qa_guru_5_5_allure_reports";
    private final static String TAB = "Issue";

    GitHubPage gitHubPage = new GitHubPage();

    @Test
    @Owner("nastiykr")
    @Feature("Work with annotation")
    @Story("Annotations")
    @Severity(SeverityLevel.BLOCKER)
    @Link(name = "GutHubURL", url = "https://github.com")
    @DisplayName("Search issue tab")
    void searchIssueTabTest() {
        gitHubPage.openPage(BASE_URL);
        gitHubPage.search(REPOSITORY);
        gitHubPage.goToRepository(REPOSITORY);
        gitHubPage.checkData(TAB);
    }
}
