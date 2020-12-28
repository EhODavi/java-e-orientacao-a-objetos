
public class Exercicio6 {

    public static void main(String[] args) {
        for (int i = 0; i < 30; i++) {
            System.out.println("(" + i + "):" + fibo(i) + "\t");
        }
    }

    public static int fibo(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }
}
