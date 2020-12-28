
public class Exercicio8 {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
            for (int j = 2; j <= i; j++) {
                System.out.print((i * j) + " ");
            }
            System.out.println();
        }
    }
}
