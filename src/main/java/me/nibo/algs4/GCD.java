package me.nibo.algs4;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 找到两个数的最大公约数（欧几里德算法）
 *
 * @author NiBo
 */
// CSOFF: AbbreviationAsWordInName
@SuppressWarnings({"PMD.UseUtilityClass"})
public class GCD {
    private static final Logger LOGGER = LoggerFactory.getLogger(GCD.class);

    // CSOFF: Javadoc
    @SuppressWarnings("PMD.UnusedFormalParameter")
    public static void main(String[] args) {
        int p = 24;
        int q = 60;
        LOGGER.info("{}, {} 的最大公约数：{}", p, q, gcd(p, q));
    }
    // CSON: Javadoc

    private static int gcd(int p, int q) {
        if (q == 0) {
            return p;
        }
        int r = p % q;
        return gcd(q, r);
    }
}
