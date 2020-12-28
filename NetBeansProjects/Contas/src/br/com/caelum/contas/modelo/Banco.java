package br.com.caelum.contas.modelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Banco {

    private String nome;
    private int numero;
    private List<Conta> contas;
    private int numContas = 0;
    private Map<String, Conta> mapaContas;

    public Banco(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
        this.contas = new ArrayList<>();
        this.mapaContas = new HashMap<>();
    }

    public void adiciona(Conta c) {
        if (c != null) {
            this.contas.add(c);
            this.mapaContas.put(c.getTitular(), c);
            this.numContas++;
        }
    }

    public Conta pega(int x) {
        return this.contas.get(x);
    }

    public void mostraContas() {
        int i = 0;
        for (Conta c : this.contas) {
            if (c != null) {
                System.out.println("Conta na posição " + i);
                System.out.println(c.toString());
                System.out.println();
                i++;
            }
        }
    }

    public boolean contem(Conta conta) {
        if (conta != null && this.contas.contains(conta) == true) {
            return true;
        }
        return false;

    }

    public Conta buscaPorTitular(String nome) {
        Conta c = null;

        c = this.mapaContas.get(nome);

        return c;
    }

    public String getNome() {
        return this.nome;
    }

    public int getNumero() {
        return this.numero;
    }

    public int pegaQuantidadeDeContas() {
        return this.numContas;
    }
}
