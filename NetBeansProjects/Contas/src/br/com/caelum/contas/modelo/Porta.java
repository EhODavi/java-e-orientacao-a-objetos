package br.com.caelum.contas.modelo;

public class Porta {

    private boolean aberta;
    private String cor;
    private double dimensaoX;
    private double dimensaoY;
    private double dimensaoZ;

    public void abre() {
        if (this.aberta == false) {
            this.aberta = true;
        }
    }

    public void fecha() {
        if (this.aberta == true) {
            this.aberta = false;
        }
    }

    public void pinta(String s) {
        if (s != null) {
            this.cor = s;
        }
    }

    public boolean estaAberta() {
        return this.aberta;
    }

    public String getCor() {
        return cor;
    }

    public double getDimensaoX() {
        return dimensaoX;
    }

    public void setDimensaoX(double dimensaoX) {
        this.dimensaoX = dimensaoX;
    }

    public double getDimensaoY() {
        return dimensaoY;
    }

    public void setDimensaoY(double dimensaoY) {
        this.dimensaoY = dimensaoY;
    }

    public double getDimensaoZ() {
        return dimensaoZ;
    }

    public void setDimensaoZ(double dimensaoZ) {
        this.dimensaoZ = dimensaoZ;
    }

    public boolean isAberta() {
        return aberta;
    }

    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }

}
