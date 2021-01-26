import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TeenageJUnitTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    public static Object[][] ageDataProvider() {
        return new Object[][]{
                {10, true},
                {20, false},
        };
    }

    @ParameterizedTest
    @MethodSource("ageDataProvider")
    void isTeenager(int age, boolean result) {
        assertEquals(result, Teenage.isTeenager(age));
    }
}

