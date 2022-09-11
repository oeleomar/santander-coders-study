package santanderCoders;

public class Variables {
  public static void main(String[] args) {

    String nome = "Eleomar"; /* Variável do tipo string */
    Integer idade = 10; /* Número inteiro */
    double peso = 0.5; /* Número de ponto flutuante */

    /*
     * Posso apenas declara e depois atribuir o valor:
     * String nome;
     * nome = "Eleomar";
     * nome = "Outro nome"
     * 
     * Tipos numériocos:
     * byte
     * short
     * int
     * long
     * float
     * double
     * 
     * Mais usados:
     * Int e float/double
     * 
     */

    /* Operadores */
    int a = 2;
    int b = 10;
    int soma = a + b;
    int subtacao = a - b;
    int multiplicacao = a * b;
    float divisao = (float) a / b; /* Estou representando os valores como se fosse float */

    System.out.println("Olá, " + nome);
    System.out.println(soma + subtacao + multiplicacao + divisao);
    ;
  }
}
