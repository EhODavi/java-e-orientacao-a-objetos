package br.com.caelum.contas.modelo;

public class Data {

    private int dia;
    private int mes;
    private int ano;

    public String formatada() {
        String dados = this.dia + "/" + this.mes + "/" + this.ano;
        return dados;

    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

}