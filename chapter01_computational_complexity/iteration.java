public class iteration {
    /* for 循环 */
//    for 循环是最常见的迭代形式之一，适合在预先知道迭代次数时使用。
    static int forLoop(int n) {
        int res = 0;
        // 循环求和 1, 2, ..., n-1, n
        for (int i = 1; i <= n; i++) {
            res += i;
        }
        return res;
    }

    /*while 循环*/
    static int whileLoop(int n) {
        int res = 0;
        int i = 1;// 初始化条件变量
        // 循环求和 1, 2, ..., n-1, n
        while (i <= n) {
            res += i;
            i++;// 更新条件变量
        }
        return res;
    }

    public static void main(String[] args) {
        int n = 5;
        int res;

        res = forLoop(n);
        System.out.println("\nfor 循环的求和结果 res = " + res);
        res = whileLoop(n);
        System.out.println("\nwhile 循环的求和结果 res = " + res);
    }
}