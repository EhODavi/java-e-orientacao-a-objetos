package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.Data;

public class TestaConta {

    public static void main(String[] args) {

        ContaCorrente c1 = new ContaCorrente();

        c1.setTitular("Hugo");
        c1.setNumero(123);
        c1.setAgencia("45678-9");
        try {
            c1.deposita(-200);
        } catch (IllegalArgumentException e) {
            e.getMessage();
        }
        Data data = new Data();
        data.setDia(04);
        data.setMes(06);
        data.setAno(2015);
        c1.setDataDeAbertura(data);
        c1.deposita(-100.0);
        System.out.println(c1.recuperaDadosParaImpressao());
        
    }
}
