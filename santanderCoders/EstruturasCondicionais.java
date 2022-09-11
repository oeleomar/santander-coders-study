package santanderCoders;

public class EstruturasCondicionais {
  public static void main(String[] args) {
    /* Estruturas condicionais */
    String aluno = "Eleomar";
    int nota = -1;
    String graduacao;

    /*
     * > Maior
     * < Menor
     * >= Maior ou igual
     * <= Menor ou
     * == Igual
     */
    if (nota >= 70) {
      System.out.println("O aluno " + aluno + " está aprovado");
    } else {
      System.out.println("Aluno " + aluno + " não aprovado");
    }

    // Se for apenas uma linha como é esse caso as {} não são necessárias
    if (nota >= 70)
      System.out.println("O aluno " + aluno + " está aprovado");
    else
      System.out.println("Aluno " + aluno + " não aprovado");

    /* Multiplas condições */
    if (nota >= 80)
      graduacao = "A";
    else if (nota < 80 && nota >= 70)
      graduacao = "B";
    else if (nota < 70 && nota >= 60)
      graduacao = "C";
    else if (nota < 60 && nota >= 0)
      graduacao = "D";
    else
      graduacao = "";

    /* Switch */
    switch (graduacao) {
      case "A":
        System.out.println("O aluno tirou A");
        break;
      case "B":
        System.out.println("O aluno tirou B");
        break;
      case "C":
        System.out.println("O aluno tirou C");
        break;
      case "D":
        System.out.println("O aluno tirou D");
        break;
      default:
        System.out.println("Nota inválida");
        break;
    }

    /* Segundo exemplo */

    switch (graduacao) {
      case "A":
      case "B":
        System.out.println("O aluno APROVADO");
        break;

      case "C":
      case "D":
        System.out.println("O aluno REPROVADO");
        break;

      default:
        System.out.println("Graduação inválida");
        break;
    }

  }
}
