package TestSuites;
import ObjectRepository.MainPage;
import Utility.UserActions;
import org.junit.Test;

public class abTest {
    UserActions action = new UserActions();
    MainPage mainPage = new MainPage();

    @Test
    public void abtest(){
    action.clickMainPageElement(mainPage.getAbTesting());
    }
}
