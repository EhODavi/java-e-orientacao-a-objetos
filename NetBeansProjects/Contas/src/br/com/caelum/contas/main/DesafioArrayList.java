package br.com.caelum.contas.main;

import java.util.ArrayList;
import java.util.List;

public class DesafioArrayList {

    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>();

        for (int i = 1; i <= 1000; i++) {
            lista.add(new Integer(i));
        }
    
        for (int i = 999; i >= 0; i--) {
            System.out.println(lista.get(i));
        }
    }
}
