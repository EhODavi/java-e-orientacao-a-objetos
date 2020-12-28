
public class TestaCasa {

    public static void main(String[] args) {
        Porta p1 = new Porta();

        p1.aberta = false;
        p1.cor = "Marrom";
        p1.dimensaoX = 100;
        p1.dimensaoY = 100;
        p1.dimensaoZ = 100;

        Porta p2 = new Porta();

        p2.aberta = true;
        p2.cor = "Verde";
        p2.dimensaoX = 150;
        p2.dimensaoY = 200;
        p2.dimensaoZ = 250;

        Porta p3 = new Porta();

        p3.aberta = false;
        p3.cor = "Azul";
        p3.dimensaoX = 100;
        p3.dimensaoY = 200;
        p3.dimensaoZ = 300;

        Casa c = new Casa();
        c.pinta("Amarela");
        c.porta1 = p1;
        c.porta2 = p2;
        c.porta3 = p3;
        
        p1.abre();
        p3.abre();

        System.out.println("Num. Portas Abertas: " + c.quantasPortasEstaoAbertas());
    }
}
