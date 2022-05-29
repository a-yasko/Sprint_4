import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AccountTest {
  private final String name;
  private final boolean expected;

  public AccountTest(String name, boolean expected) {
    this.name = name;
    this.expected = expected;
  }

  @Parameterized.Parameters
  public static Object[][] getName() {
    return new Object[][] {
            { "Тимоти Шаламе", true },
            { "Тимоти Шаламе Тимоти", false },
            { "ТимотиШаламе", false },
            { "Тимоти  Шаламе", false },
            { " Тимоти Шаламе", false },
            { "Тимоти Шаламе ", false },
            { " Тимоти Шаламе ", false },
            { " Тимоти  Шаламе ", false },
            { "  Тимоти Шаламе  ", false },
            { "Т ", false },
            { "Т Ш", true },
            { "123 456789123456789", true },
            { "123 4567891234567890", false },
            { "        ", false },
            { "", false },
    };
  }

  @Test
  @DisplayName("checkNameToEmboss test")
  @Description("Parametrized tests of Account.checkNameToEmboss()")
  public void checkNameToEmbossTest() {
    Account account = new Account(name);
    boolean actual = account.checkNameToEmboss();
    assertEquals(expected, actual);
  }
}