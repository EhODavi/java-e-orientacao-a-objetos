package br.com.caelum.contas.modelo;

import java.util.Objects;

public abstract class Conta implements Comparable<Conta> {

    protected static int geraIdentificador = 1;
    protected int identificador;
    protected int numero;
    protected double saldo;
    protected String titular;
    protected String agencia;
    protected Data dataDeAbertura;

    public Conta() {
        this.identificador = Conta.geraIdentificador;
        Conta.geraIdentificador++;
    }

    public Conta(String titular) {
        this.titular = titular;
        this.identificador = Conta.geraIdentificador;
        Conta.geraIdentificador++;
    }

    public void saca(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
        }
    }

    public void deposita(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Você tentou depositar"
                    + " um valor negativo");
        } else {
            this.saldo += valor;
        }
    }

    public double getRendimento() {
        return this.saldo * 0.1;
    }

    public String recuperaDadosParaImpressao() {
        String dados = "Titular: " + this.titular;
        dados += "\nNúmero: " + this.numero;
        dados += "\nAgência: " + this.agencia;
        dados += "\nData de Abertura: " + this.dataDeAbertura.formatada();
        dados += "\nSaldo: " + this.saldo;
        dados += "\nRendimento: " + this.getRendimento();
        dados += "\nTipo: " + this.getTipo();
        return dados;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getAgencia() {
        return this.agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public Data getDataDeAbertura() {
        return this.dataDeAbertura;
    }

    public void setDataDeAbertura(Data dataDeAbertura) {
        this.dataDeAbertura = dataDeAbertura;
    }

    public int getIdentificador() {
        return this.identificador;
    }

    public int getGeraIdentificador() {
        return Conta.geraIdentificador;
    }

    public abstract String getTipo();

    public void transfere(double valor, Conta conta) {
        this.saca(valor);
        conta.deposita(valor);
    }

    @Override
    public String toString() {
        return "[titular=" + titular.toUpperCase() + ", numero=" + numero
                + ", agencia=" + agencia + "]";
    }

    public int compareTo(Conta outraConta) {
        return this.titular.compareTo(outraConta.titular);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.numero;
        hash = 53 * hash + Objects.hashCode(this.agencia);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Conta other = (Conta) obj;
        if (this.numero != other.numero) {
            return false;
        }
        if (!Objects.equals(this.agencia, other.agencia)) {
            return false;
        }
        return true;
    }

}
