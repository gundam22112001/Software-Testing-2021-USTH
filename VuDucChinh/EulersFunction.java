public class EulersFunction {
    // This method returns us number of x that (x < n) and gcd(x, n) == 1 in O(sqrt(n)) time
    // complexity;
    public static int getEuler(int n) {
        int result = n;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                while (n % i == 0) n /= i; //2,1
                result -= result / i;//4
            }
        }
        if (n > 1) result -= result / n;
        return result;
    }

    public static void main(String[] args) {

        System.out.println(getEuler(12));

    }
}
