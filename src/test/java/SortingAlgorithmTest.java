import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SortingAlgorithmTest {

    private SortingAlgorithms classUnderTest;

    @Before
    public void setUp() throws Exception {
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
    public void testSortowanieTO1(){
        double[] toSort={1,4,5,3,2};
        double[] expected={1,2,3,4,5};
        classUnderTest.sort(toSort,true);
        Assert.assertArrayEquals(expected,toSort,0.001);
    }
}
