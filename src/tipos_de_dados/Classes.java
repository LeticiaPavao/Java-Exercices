class Pessoa {
    String nome;
    int idade;
    boolean temCnh;

    public Pessoa() {} // Construtor padrão

    public Pessoa(String nome, int idade, boolean temCnh) { // Construtor com parâmetros
        this.nome = nome;
        this.idade = idade;
        this.temCnh = temCnh;
    }
}

public class Classes {
    public static void main(String[] args){
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "João";
        pessoa1.idade = 30;
        pessoa1.temCnh = true;

        Pessoa pessoa2 = new Pessoa("Letícia",26,true);

        System.out.println("Nome: " + pessoa1.nome);
        System.out.println("Idade: " + pessoa1.idade);
        System.out.println("Tem CNH: " + pessoa1.temCnh);

        System.out.println("Nome: " + pessoa2.nome);
        System.out.println("Idade: " + pessoa2.idade);
        System.out.println("Tem CNH: " + pessoa2.temCnh);
    }
    
}
