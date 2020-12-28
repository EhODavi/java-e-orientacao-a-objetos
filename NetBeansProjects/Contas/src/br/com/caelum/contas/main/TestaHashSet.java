package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import java.util.HashSet;
import java.util.Set;

public class TestaHashSet {

    public static void main(String[] args) {
        Conta c1 = new ContaCorrente();
        c1.setNumero(1000);
        c1.setAgencia("ABC");
        Conta c2 = new ContaCorrente();
        c2.setNumero(1000);
        c2.setAgencia("ABC");
        Set<Conta> setContas = new HashSet<>();
        System.out.println(setContas.add(c1));
        System.out.println(setContas.add(c2));
    }
}
