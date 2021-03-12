package ppj.assignments;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.assertj.core.api.Assertions.assertThat;

public class Assignment3Test {

    private Assignment3 assignment = new Assignment3Impl();

    @Test
    public void sumOfDivisibleInRangeMustHandleEmptyRange1() {
        assertThat(assignment.sumOfDivisibleInRange(-1, -2, Collections.emptyList())).isZero();
    }

    @Test
    public void sumOfDivisibleInRangeMustHandleEmptyRange2() {
        assertThat(assignment.sumOfDivisibleInRange(1, 1, Collections.singletonList(1))).isZero();
    }

    @Test
    public void sumOfDivisibleInRangeMustHandleDivisibleBy1() {
        assertThat(assignment.sumOfDivisibleInRange(1, 11, Arrays.asList(1,2,3))).isEqualTo(6);
    }

    @Test
    public void sumOfDivisibleInRangeMustHandleDivisibleBy2() {
        assertThat(assignment.sumOfDivisibleInRange(1, 100, Arrays.asList(1,2,3,5))).isEqualTo(180);
    }

    @Test
    public void sumOfDivisibleInRangeMustHandleDivisibleBy3() {
        assertThat(assignment.sumOfDivisibleInRange(1, 100, Collections.singletonList(1))).isEqualTo(4950);
    }

    @Test
    public void sumOfDivisibleInRangeMustHandleDivisibleBy4() {
        assertThat(assignment.sumOfDivisibleInRange(50, 101, Collections.emptyList())).isEqualTo(3825);
    }

    @Test
    public void deepSumOfEvenSquaredNumbers1() {
       assertThat(assignment.deepSumOfEvenSquaredNumbers(Collections.emptyList())).isZero();
    }

    @Test
    public void deepSumOfEvenSquaredNumbers2() {
        assertThat(assignment.deepSumOfEvenSquaredNumbers(Arrays.asList(Arrays.asList(1,3,4),Arrays.asList(3,5,7,8),Collections.emptyList()))).isEqualTo(80);
    }



}
