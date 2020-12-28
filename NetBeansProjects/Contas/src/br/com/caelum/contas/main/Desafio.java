package br.com.caelum.contas.main;

public class Desafio {
    
    public static void main(String[] args) {
        String x = "7620";
        System.out.println(converterInt(x));
    }
    
    public static int converterInt(String x) {
        int j = 0;
        int tamanho = x.length() - 1;
        for (int i = 0; i < x.length(); i++) {
            int y = Character.getNumericValue(x.charAt(i));
            j = (int) (j + y * Math.pow(10, tamanho));
            tamanho--;
        }
        return j;
    }
}
