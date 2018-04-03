import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountNonDivisibleTest {
    @Test
    void solution() {
        //Example Input
        int[] A1 = {3,1,2,3,6};
        int[] R1 = {2,4,3,2,0};
        assertArrayEquals(R1, CountNonDivisible.solution(A1));

        //Extreme, Single
        int[] A2 = {2};
        int[] R2 = {0};
        assertArrayEquals(R2, CountNonDivisible.solution(A2));

        //Two Elements
        int[] A3 = {2,4};
        int[] R3 = {1,0};
        assertArrayEquals(R3, CountNonDivisible.solution(A3));

        //Prime Numbers
        int[] A4 = {3,1,7,11,5,1};
        int[] R4 = {3,4,3,3,3,4};
        assertArrayEquals(R4, CountNonDivisible.solution(A4));
    }
}