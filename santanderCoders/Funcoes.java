package santanderCoders;

public class Funcoes {
  public static void main(String[] args) {
    String nome = "Eleomar";
    /* Funções sem retorno */
    saudacao(nome);

    /* Funções com retorno */
    int result = calculo(1, 1);
    System.out.println(result);
  }

  // Parametro;

  public static void saudacao(String nome) {
    System.out.println("Hello " + nome);
  }

  public static int calculo(int a, int b) {
    return a + b;
  }
}
