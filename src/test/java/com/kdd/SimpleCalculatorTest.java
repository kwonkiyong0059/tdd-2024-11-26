package com.kdd;

import com.kkd.SimpleCalculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
public class SimpleCalculatorTest {

    @Test
    @DisplayName("1 + 2 = 3")
    public void test1() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int rs = simpleCalculator.plus(1, 2);

        assertThat(rs).isEqualTo(3);
    }

    @Test
    @DisplayName("2 + 10 = 12")
    public void test2() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int rs = simpleCalculator.plus(2, 10);

        assertThat(rs).isEqualTo(12);
    }

    @Test
    @DisplayName("20 + 10 = 30")
    public void test3() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int rs = simpleCalculator.plus(20, 10);

        assertThat(rs).isEqualTo(30);
    }

    @Test
    @DisplayName("10 - 5 = 5")
    public void test4() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int re = simpleCalculator.minus(10, 5);

        assertThat(re).isEqualTo(5);
    }

    @Test
    @DisplayName("10 * 5 = 50")
    public void test5() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int re = simpleCalculator.multiply(10, 5);

        assertThat(re).isEqualTo(50);
    }

    @Test
    @DisplayName("10 / 5 = 2")
    public void test6() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int re = simpleCalculator.divide(10, 5);

        assertThat(re).isEqualTo(2);
    }
}
