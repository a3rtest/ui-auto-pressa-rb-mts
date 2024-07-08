package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class JournalReaderPage {
    private static final SelenideElement READER_HEADER = $(By.xpath("//*[@id=\"root\"]/div/header/div"));
    private static final SelenideElement READER_PAGE = $(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[1]/div/div[1]/div/img"));
    private static final SelenideElement READER_BUTTON_NEXT = $(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[2]"));
    public void showPageJournal() {
        READER_HEADER.shouldBe(Condition.visible);
        READER_PAGE.shouldBe(Condition.visible);
        READER_BUTTON_NEXT.shouldBe(Condition.visible).shouldBe(Condition.enabled);

    }
}


