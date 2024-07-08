package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class JournalsPage {
    private static final SelenideElement FREE_CATEGORY = $(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div/div[12]"));
    private static final SelenideElement JOURNAL_CARD = $(By.xpath("//*[@id=\"root\"]/div/div/div/div[3]/div[1]/div[1]/img"));
    public void clickJournalInFreeCategory() {
        FREE_CATEGORY.shouldBe(Condition.visible).click();
        JOURNAL_CARD.shouldBe(Condition.visible).click();
    }
}
