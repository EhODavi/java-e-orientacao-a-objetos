
public class TestaPorta {

    public static void main(String[] args) {
        Porta p = new Porta();

        p.aberta = false;
        p.cor = "Marrom";
        p.dimensaoX = 100;
        p.dimensaoY = 100;
        p.dimensaoZ = 100;

        p.abre();

        p.fecha();

        p.pinta("Amarelo");
        p.pinta("Verde");
        p.pinta("Branco");

        p.dimensaoX = 150;
        p.dimensaoY = 200;
        p.dimensaoZ = 250;

        p.estaAberta();

    }
}
