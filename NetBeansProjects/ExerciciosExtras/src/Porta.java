
public class Porta {

    boolean aberta;
    String cor;
    double dimensaoX;
    double dimensaoY;
    double dimensaoZ;

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
}
