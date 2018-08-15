import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BirthdayTest {

    StubTimeProvider stubTimeProvider = new StubTimeProvider();
    Birthday birthday = new Birthday(stubTimeProvider);

    @Test
    public void is_not_birthday() {
        stubTimeProvider.setToday(LocalDate.parse("2018-07-15"));

        assertFalse(birthday.isBirthday());
    }

    @Test
    public void is_birthday() {
        stubTimeProvider.setToday(LocalDate.parse("2018-04-09"));

        assertTrue(birthday.isBirthday());
    }

    private class StubTimeProvider extends TimeProvider {
        private LocalDate today;

        public void setToday(LocalDate today) {
            this.today = today;
        }

        @Override
        public LocalDate getNow() {
            return this.today;
        }
    }
}
