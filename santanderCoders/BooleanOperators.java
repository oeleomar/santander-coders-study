package santanderCoders;

public class BooleanOperators {
  public static void main(String[] args) {
    /* Boolean é um valor que contem VERDADEIRO ou FALSO */
    boolean resultado = true;

    /* Ir a praia */
    boolean fimDeSemana = true;
    boolean fazendoSol = true;
    /* Operadores lógicos */
    boolean vamosAPraia = fimDeSemana && fazendoSol;

    /*
     * Tabela:
     * 
     * Operador && (AND);
     * true && true = true
     * true && false = false
     * false && false = false
     * 
     * Operador || (OR)
     * true || true = true
     * true || false = true
     * false || false = false
     * 
     * Operador ternário ?()
     * variável = true ? "Texto" : "Não é fim de semana"
     */

    String mensagem = fimDeSemana ? "É fim de semana" : "Não é fim de semana";
    System.out.println(vamosAPraia);
    System.out.println(mensagem);
  }
}
