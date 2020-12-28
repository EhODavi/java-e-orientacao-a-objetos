
public class Casa {

    String cor;
    Porta porta1;
    Porta porta2;
    Porta porta3;

    public void pinta(String s) {
        if (s != null) {
            this.cor = s;
        }
    }

    public int quantasPortasEstaoAbertas() {
        int numPortasAbertas = 0;
        if (porta1.estaAberta()) {
            numPortasAbertas++;
        }

        if (porta2.estaAberta()) {
            numPortasAbertas++;
        }

        if (porta3.estaAberta()) {
            numPortasAbertas++;
        }
        return numPortasAbertas;
    }
}
