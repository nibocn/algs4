package me.nibo.algs4;

import static org.hamcrest.CoreMatchers.is;

import org.junit.Assert;
import org.junit.Test;

/**
 * GCD 单元测试
 *
 * @author NiBo
 */
// CSOFF: AbbreviationAsWordInName
public class GCDTests {

    /**
     * 测试两个数的最大公约数
     */
    @Test
    public void testGcd() {
        Assert.assertThat(GCD.gcd(4, 33), is(1));
        Assert.assertThat(GCD.gcd(33, 4), is(1));
        Assert.assertThat(GCD.gcd(88, 198), is(22));
        Assert.assertThat(GCD.gcd(90, 66), is(6));
    }
}
