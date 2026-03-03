package POO_Java;

 // Novos objetos para poer fazer ações no programa com eles
 // Interação entre objetos

 // Classes -> objetos
 // Molde do objeto = classe
 // Cria um novo objeto = instancia

public class Pessoa {

    // Atributos -> caracteristicas
    private String nome;
    private int idade;
    private double altura;
    private double peso;

    // Função construtora
    //public Pessoa() {
    //    this.nome = "Sem nome";
    //    this.idade = 0;
    //    this.altura = 0.0;
    //    this.peso = 0.0;
    //}

    // Função construtora com atributos
    public Pessoa(String nome, int idade, double altura, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }




    // Métodos -> ações
    // setters = dar valor | getters = pegar valor
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }


    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getIdade() {
        return this.idade;
    }


    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getAltura() {
        return this.altura;
    }


    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getPeso() {
        return this.peso;
    }
}
