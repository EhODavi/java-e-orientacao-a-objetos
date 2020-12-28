package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Casa;
import br.com.caelum.contas.modelo.Porta;

public class TestaCasa {

    public static void main(String[] args) {
        Casa casinha = new Casa("Amarela");

        casinha.pinta("Verde");

        Porta p1 = new Porta();
        p1.setDimensaoX(100);
        p1.setDimensaoY(100);
        p1.setDimensaoZ(100);
        p1.pinta("Marron");
        p1.setAberta(true);

        Porta p2 = new Porta();
        p2.setDimensaoX(100);
        p2.setDimensaoY(100);
        p2.setDimensaoZ(100);
        p2.pinta("Azul");
        p2.setAberta(false);

        Porta p3 = new Porta();
        p3.setDimensaoX(100);
        p3.setDimensaoY(100);
        p3.setDimensaoZ(100);
        p3.pinta("Verde");
        p3.setAberta(true);

        casinha.adicionaPorta(p1);
        casinha.adicionaPorta(p2);
        casinha.adicionaPorta(p3);
        p1.fecha();
        p2.abre();
        p3.fecha();

        System.out.println("Número de Portas Abertas: " + casinha.quantasPortasEstaoAbertas());
        System.out.println("Total de Portas: " + casinha.totalDePortas());
    }
}
