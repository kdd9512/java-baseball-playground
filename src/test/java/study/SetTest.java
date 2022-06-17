package study;

import org.assertj.core.api.AbstractAssert;
import org.assertj.core.util.Strings;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SetTest {

    private static Set<Integer> numbers;

    @BeforeEach
    void setUp() {
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    //    public static class Strings {
//        public static boolean isBlank(String input) {
//            return input == null || input.trim().isEmpty();
//        }
//    }
//
//    @ParameterizedTest
//    @ValueSource(strings = {"", "  "})
//    void isBlank_ShouldReturnTrueForNullOrBlankStrings(String input) {
//        System.out.println("input : " + input);
//        assertTrue(Strings.isBlank(input));
//    }

    // 이하 isContains_ShouldReturnTrueForNullOfContainsInteger 와 같다.
    // @ParameterizedTest 를 이용, 반복 test 를 줄일 수 있다.
//    @Test
//    void test01() {
//        assertThat(numbers.contains(1)).isTrue();
//        assertThat(numbers.contains(2)).isTrue();
//        assertThat(numbers.contains(3)).isTrue();
//    }


    public static class Contains {
        public static boolean isContain(int number) {
            return numbers.contains(number);
        }
    }

    @ParameterizedTest
    @ValueSource(ints = {1,2,3,4})
    void isContains_ShouldReturnTrueForNullOfContainsInteger(int number) {
        assertTrue(Contains.isContain(number));
    }


    @ParameterizedTest
    @CsvSource(value = {"test:test", "tEst:test", "Java:java"}, delimiter = ':')
    void toLowerCase_ShouldGenerateTheExpectedLowercaseValue(String input, String expected) {
        String actualValue = input.toLowerCase();
        assertEquals(expected, actualValue);
    }

}

