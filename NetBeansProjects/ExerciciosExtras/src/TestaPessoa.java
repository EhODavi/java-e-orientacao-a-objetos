
public class TestaPessoa {

    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.nome = "Davi de Paula Oliveira";
        p.idade = 18;
        p.fazAniversario();
        System.out.println("Nome: " + p.nome);
        System.out.println("Idade: " + p.idade);
    }
}
