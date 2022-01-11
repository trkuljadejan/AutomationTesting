package suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.FailedLoginTest;
import tests.LoginTest;
import tests_with_login.CheckItemNameTest;
import tests_with_login.LogoutTest;
import tests_with_login.RemoveItemFromCartTest;
import tests_with_login.ShoppingTest;

@RunWith(Suite.class)

@Suite.SuiteClasses({FailedLoginTest.class, LoginTest.class, LogoutTest.class,
        RemoveItemFromCartTest.class, ShoppingTest.class, CheckItemNameTest.class})

public class TestSuites {
}
