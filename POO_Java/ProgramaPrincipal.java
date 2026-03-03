package POO_Java;

public class ProgramaPrincipal {
    
    public static void main(String[] args) {

        // Criar uma pessoa -> instanciar (new)
        // tipo(classe) var = new classe()
        Pessoa pessoa1 = new Pessoa(null, 0, 0, 0);

        pessoa1.setNome("Luiz Henrique");
        System.out.println(pessoa1.getNome());
        pessoa1.setIdade(24);
        pessoa1.setAltura(1.70);
        pessoa1.setPeso(53);

        System.out.println("Meu nome é " + pessoa1.getNome() + " e eu tenho " + pessoa1.getIdade() + " anos. E a minha altura é " + pessoa1.getAltura() + ". meu peso é de aproximadamente " + pessoa1.getPeso());

        Pessoa pessoa2 = new Pessoa("James", 18, 1.70, 60);

        System.out.println(pessoa2.getAltura());
        System.out.println(pessoa2.getNome());
        System.out.println("Meu nome é " + pessoa2.getNome());
    }

}
