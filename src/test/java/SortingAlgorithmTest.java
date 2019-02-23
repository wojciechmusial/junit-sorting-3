import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

public class SortingAlgorithmTest {

    private SortingAlgorithms classUnderTest;

    @Before
    public void setUp() {
        classUnderTest = new SortingAlgorithms();
    }

    @Test
    public void testSortowaniaWM1() {
        double[] toSort = {5, 1, 3, 2};
        double[] expected = {1, 2, 3, 5};

        classUnderTest.sort(toSort, true);

        Assert.assertArrayEquals(expected, toSort, 0.001);
    }

    @Test
    public void testSortowaniaWM2() {
        double[] toSort = {5, 1, 3, 2};
        double[] expected = {5, 3, 2, 1};

        classUnderTest.sort(toSort, false);

        Assert.assertArrayEquals(expected, toSort, 0.001);
    }

    @Test
    public void testSortowanieTO1() {
        double[] toSort = {1, 4, 5, 3, 2};
        double[] expected = {1, 2, 3, 4, 5};
        classUnderTest.sort(toSort, true);
        Assert.assertArrayEquals(expected, toSort, 0.001);
    }

    @Test
    public void testLosowejTablicy() {
        Random random = new Random();

        double[] toSort = new double[1000];

        for (int i = 0; i < toSort.length; i++) {
            toSort[i] = random.nextDouble();
        }

        classUnderTest.sort(toSort, true);

        for (int i = 0; i < toSort.length - 1; i++) {
            Assert.assertTrue(toSort[i] <= toSort[i+1]);
        }
    }
}
