package br.com.caelum.contas.modelo;

public class Casa {

    private String cor;
    private int totalDePortas = 0;
    private Porta[] portas;

    public Casa(String cor) {
        this.cor = cor;
        this.portas = new Porta[10];
    }

    public void pinta(String s) {
        if (s != null && s.equals("") == false) {
            this.cor = s;
        }
    }

    public int quantasPortasEstaoAbertas() {
        int numPortasAbertas = 0;

        for (int i = 0; i < portas.length; i++) {
            if (portas[i] != null) {
                if (portas[i].estaAberta() == true) {
                    numPortasAbertas++;
                }
            }
        }

        return numPortasAbertas;
    }

    public void adicionaPorta(Porta p) {
        if (p != null) {
            if (this.totalDePortas != this.portas.length) {
                for (int i = 0; i < this.portas.length; i++) {

                    if (this.portas[i] == null) {
                        this.portas[i] = p;
                        this.totalDePortas++;
                        break;
                    }

                }
            } else {
                Porta[] portas1 = new Porta[this.portas.length + 1];
                for (int i = 0; i < this.portas.length; i++) {
                    portas1[i] = this.portas[i];
                }
                portas1[this.portas.length] = p;
                this.portas = portas1;
            }
        }
    }

    public int totalDePortas() {
        return this.totalDePortas;
    }

    public String getCor() {
        return this.cor;
    }

}
