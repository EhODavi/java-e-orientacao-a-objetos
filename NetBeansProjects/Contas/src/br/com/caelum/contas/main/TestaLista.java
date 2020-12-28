package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class TestaLista {
    public static void main(String[] args) {
        List<Conta> contas = new LinkedList<Conta>();
        Random aleatorio = new Random();
        
        for (int i = 0; i < 10; i++) {
            ContaCorrente cc = new ContaCorrente();
            cc.deposita(aleatorio.nextInt(1000));
            contas.add(cc);
        }
        
        System.out.println(contas.toArray());
    }
}
