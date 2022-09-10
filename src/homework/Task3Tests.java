package homework;

import org.junit.Assert;
import org.junit.Test;

import static homework.Task3.fuzzySearch;

public class Task3Tests {
    @Test
    public void testTrue() {
        boolean actual = fuzzySearch("car", "ca6$$#_rtwheel");

        Assert.assertTrue(actual);
    }

    @Test
    public void testFalse() {
        boolean actual = fuzzySearch("cwhf", "oaipjcaoisjdwklhcvbf");

        Assert.assertFalse(actual);
    }

    @Test
    public void testNullPattern() {
        boolean actual = fuzzySearch(null, "oaipjcaoisjdwklhcvbf");

        Assert.assertFalse(actual);
    }

    @Test
    public void testNullTarget() {
        boolean actual = fuzzySearch("car", null);

        Assert.assertFalse(actual);
    }
}
