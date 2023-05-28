import org.example.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void minSwapsTest1() {
        int[] nums = {0,1,0,1,1,0,0};
        Assert.assertEquals(1, new Solution().minSwaps(nums));
    }

    @Test
    public void minSwapsTest2() {
        int[] nums = {0,1,1,1,0,0,1,1,0};
        Assert.assertEquals(2, new Solution().minSwaps(nums));
    }

    @Test
    public void minSwapsTest3() {
        int[] nums = {1,1,0,0,1};
        Assert.assertEquals(0, new Solution().minSwaps(nums));
    }
}
