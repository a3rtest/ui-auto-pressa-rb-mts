package tests;

import com.codeborne.selenide.Selenide;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.junit.Before;
import org.junit.Test;

import pages.JournalDetailPage;
import pages.JournalReaderPage;
import pages.JournalsPage;
import pages.MainPage;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;
import static pages.MainPage.BASE_URL;

public class JournalFreeCategoryTest {
    private static final Logger logger = LogManager.getLogger(JournalFreeCategoryTest.class);
    private MainPage mainPage;
    private JournalsPage journalsPage;
    private JournalDetailPage journalDetailPage;
    private JournalReaderPage journalReaderPage;

    @Before
    public void setup() {
        Selenide.clearBrowserCookies();
        logger.info("Куки очищены");
        logger.info("Открытие главной страницы");
        open(BASE_URL);
        mainPage = page(MainPage.class);
        journalsPage = page(JournalsPage.class);
        journalDetailPage = page(JournalDetailPage.class);
        journalReaderPage = page(JournalReaderPage.class);
    }

    @Test
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
