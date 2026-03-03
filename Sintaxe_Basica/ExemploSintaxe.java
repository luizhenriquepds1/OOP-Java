package Sintaxe_Basica;

public class ExemploSintaxe {

    public static void main(String[] args) {
        
        // Impressão de texto
        System.out.println("Podemos imprimir texto e números " + 25);

        // Tipos Primitivos
        int idade = 25;  // 'int' guarda números inteiros
        System.out.println("Eu tenho " + idade + " anos de idade.");

        double altura = 1.70;   // 'double' guarda números decimais (use ponto, não vírgula)
        System.out.println("Eu tenho " + idade + " anos de idade e " + altura + " de altura.");  
        
        String nome = "Luiz";   // 'String' guarda textos e exige aspas duplas
        System.out.println("Meu nome é " + nome + "e tenho " + idade + " anos de idade e " + altura + " de altura."); 
        
        boolean vaiChoverHoje = true;   // 'boolean' guarda apenas 'true' (verdadeiro) ou 'false' (falso)
            if (vaiChoverHoje == true ) {
                System.out.println("Infelizmente hoje vai chover.");
            } else {
                System.out.println("Oba! Felizmente hoje não vai chover.");
            }

        // Lógica de Decisão (O famoso if / else)
        int nota = 8;
            if (nota >= 7) {
                System.out.println("Sua nota foi " + nota +". Voce foi aprovado! Parabens.");
            } else {
                System.out.println("Sua nota foi " + nota + ". Infelizmente voce foi reprovado.");
            }

        
        // Lógica de Repetição (Os "Loops")
        // O for tem 3 partes: (1. início; 2. condição para continuar rodando; 3. o que fazer a cada volta)
        for (int contador = 1; contador <= 5; contador++) {
            System.out.println("Número: " + contador);
        }

    }
    
}
