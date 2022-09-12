package santanderCoders;

public class LacosNumericos {
  public static void main(String[] args) {
    /* Laços numéricos */
    /*
     * for (int i = 0; i <= 10; i++) {
     * System.out.println(i);
     * }
     */

    /* Laços aninhados */
    for (int i = 1; i <= 10; i++) {
      for (int j = 1; j <= 10; j++) {
        System.out.println(j + " * " + i + " = " + j * i);
      }
      System.out.println("----------------------");
    }
  }
}
