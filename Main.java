public class main {
public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Carlos", 45);
        Aluno a1 = new Aluno("Marina", 20, "Engenharia");

        p1.apresentar();
        a1.apresentar();
    }
}

class Pessoa {
    protected String nome;
    protected int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void apresentar() {
        System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos.");
    }
}

class Aluno extends Pessoa {
    private String curso;

    public Aluno(String nome, int idade, String curso) {
        super(nome, idade);
        this.curso = curso;
    }


    public void apresentar() {
        super.apresentar();
        System.out.println("Sou aluno do curso de " + curso + ".");
    }
}
;

