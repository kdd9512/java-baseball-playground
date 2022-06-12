package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.contentOf;

public class StringTest {

    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void testForReq1AndReq2() {

        String str = "1,2";
        String str2 = "1";
        String str3 = "(1,2)";

        String[] splitString1 = str.split(",");
        String[] splitString2 = str2.split(",");

        String subStr = str3.substring(1, 4);

        String sp1 = splitString1[0];
        String sp2 = splitString1[1];
        String sp3 = splitString2[0];

        assertThat(splitString1).contains("1", "2");
        assertThat(splitString1).containsExactly("1", "2");
        assertThat(splitString2).contains("1");
        assertThat(splitString2).containsExactly("1");

        System.out.println("=============req1=============");
        System.out.printf("%s %s\n", sp1, sp2);
        System.out.println(sp3);
        System.out.println("=============req2=============");
        System.out.println(subStr);

    }


    @Test
    @DisplayName("Test For Requirement 3")
    public static void main(String[] args) {
        String str4 = "abc";

        while (true) {
            Scanner sc = new Scanner(System.in);

            System.out.println("abc 중 몇 번째 글자를 출력? : ");
            String val = sc.nextLine();

            try {
                char charAt = str4.charAt(Integer.parseInt(val) - 1);
                System.out.println("=============req3=============");
                System.out.println(charAt);
                break;

            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("범위를 벗어났습니다. 다시 입력하세요");

            }

        }

    }


}
