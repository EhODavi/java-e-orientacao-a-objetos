package br.com.caelum.contas.main;

public class TestaString {

    public static void main(String[] args) {
        String s = "fj11";
        s = s.replaceAll("1", "2");
        System.out.println(s);
        escreveContrarioString("anotaram a data da maratona");
    }

    public static void escreveContrarioString(String s) {
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }
    }
}
