package me.nibo.algs4;

/**
 * 找到两个数的最大公约数（欧几里德算法）
 *
 * @author NiBo
 */
// CSOFF: AbbreviationAsWordInName
@SuppressWarnings({"PMD.UseUtilityClass", "PMD.ClassNamingConventions"})
public class Gcd {

    /**
     * 计算两个数的最大公约数
     *
     * @param p Number1
     * @param q Number2
     * @return 最大公约数
     */
    public static int gcd(int p, int q) {
        if (q == 0) {
            return p;
        }
        int r = p % q;
        return gcd(q, r);
    }
}
