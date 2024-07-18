package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class JournalDetailPage {
    private static final SelenideElement JOURNAL_READ_BUTTON = $(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[1]/div[2]/div[2]/div[3]/button[1]"));
    public void clickJournalReadButton() {
        JOURNAL_READ_BUTTON.shouldBe(Condition.visible).shouldBe(Condition.enabled);
        JOURNAL_READ_BUTTON.click();
    }
}