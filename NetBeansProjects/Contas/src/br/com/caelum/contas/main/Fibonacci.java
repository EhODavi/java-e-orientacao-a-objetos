package br.com.caelum.contas.main;

public class Fibonacci {

    public static void main(String[] args) {
        int[] sequencia = new int[30];
        for (int i = 0; i < 30; i++) {
            if (i < 2) {
                sequencia[i] = i;
            } else {
                sequencia[i] = sequencia[i - 1] + sequencia[i - 2];
            }

        }

        for (int i = 0; i < 30; i++) {
            System.out.println("(" + i + "):" + sequencia[i] + "\t");
        }
    }

}
