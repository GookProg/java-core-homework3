package homework;

import org.junit.Assert;
import org.junit.Test;

import static homework.Task2.twoSum;

public class Task2Tests {
    @Test
    public void testHomeWork() {
        int[] expected = new int[] { 3, 7 };
        int[] actual = twoSum(new int[] { 3, 4, 2, 7 }, 10);

        Assert.assertArrayEquals(actual, expected);
    }

    @Test
    public void testWithNegativeNumbers() {
        int[] expected = new int[] { -7, -5 };
        int[] actual = twoSum(new int[] { -7, 2, 4, -5, 1, -3, 0 }, -12);

        Assert.assertArrayEquals(actual, expected);
    }

    @Test
    public void testNotExistAnswer() {
        int[] expected = new int[] { };
        int[] actual = twoSum(new int[] { 100, 200, 300, 150 }, 10);

        Assert.assertArrayEquals(actual, expected);
    }

    @Test
    public void testNullArray() {
        int[] expected = new int[] { };
        int[] actual = twoSum(null, 10);

        Assert.assertArrayEquals(actual, expected);
    }
}
