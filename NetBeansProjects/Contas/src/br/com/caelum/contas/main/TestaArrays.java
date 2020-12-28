package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

public class TestaArrays {

    public static void main(String[] args) {
        Conta[] contas = new Conta[10];
        
        for (int i = 0; i < contas.length; i++) {
            contas[i] = new ContaCorrente();
            contas[i].deposita(i * 100.0);
        }
        
        double somaMedia = 0;
        
        for (int i = 0; i < contas.length; i++) {
            somaMedia = somaMedia + contas[i].getSaldo();
        }
        
        double media = somaMedia / contas.length;
        System.out.println("Média = " + media);
    }
}
