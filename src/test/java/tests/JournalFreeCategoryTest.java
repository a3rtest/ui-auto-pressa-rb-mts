package tests;

import com.codeborne.selenide.Selenide;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.JournalDetailPage;
import pages.JournalReaderPage;
import pages.JournalsPage;
import pages.MainPage;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;
import static pages.MainPage.*;

public class JournalFreeCategoryTest {
    private static final Logger logger = LogManager.getLogger(JournalFreeCategoryTest.class);
    private static MainPage mainPage;
    private static JournalsPage journalsPage;
    private static JournalDetailPage journalDetailPage;
    private static JournalReaderPage journalReaderPage;
   // static MainPage mainPage = new MainPage();

    @BeforeEach
    public void setup() {
        open(BASE_URL);
        Selenide.clearBrowserCookies();
        logger.info("Куки очищены");
        logger.info("Открытие главной страницы");
        mainPage = page(MainPage.class);
        journalsPage = page(JournalsPage.class);
        journalDetailPage = page(JournalDetailPage.class);
        journalReaderPage = page(JournalReaderPage.class);
    }
    @Test
    @DisplayName("Проверка журналов категории Бесплатно")
     public void testJournalFreeCategory() {

        logger.info("Начало теста: testJournalFreeCategory");
        logger.info("Нажатие на кнопку 'Журналы' на главной странице");
        mainPage.clickJournalButton();

        logger.info("Выбор категории 'Бесплатные' на странице журналов");
        journalsPage.clickJournalInFreeCategory();

        logger.info("Нажатие на кнопку 'Читать' на странице деталей журнала.");
        journalDetailPage.clickJournalReadButton();

        logger.info("Проверка открытия читалки журнала.");
        journalReaderPage.showPageJournal();

        logger.info("Тест 'testJournalFreeCategory' завершен успешно.");
    }
}
