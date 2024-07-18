package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    public static final String BASE_URL = "https://pressa.mts.by/";
    private static final SelenideElement JOURNAL_BUTTON = $(By.xpath("//*[@id=\"root\"]/header/div/div[2]/button[1]"));
    public void clickJournalButton() {
        JOURNAL_BUTTON.shouldBe(Condition.visible).shouldBe(Condition.enabled);
        JOURNAL_BUTTON.click();
    }
}
