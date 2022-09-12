package santanderCoders;

import java.util.Arrays;

public class Vetores {
  public static void main(String[] args) {
    /* Vetores */
    int[] numeros = new int[5]; // Posso adicionar um limite de array
    numeros[0] = 1;
    numeros[1] = 2;
    numeros[2] = 3;
    numeros[3] = 4;
    numeros[4] = 5;

    for (int i = 0; i < numeros.length; i++) {
      // System.out.println(numeros[i]);
    }

    String[] letras = { "E", "L", "E", "O", "M", "A", "R" }; // Forma de declara já passando os valores

    for (int i = 0; i < letras.length; i++) {
      // System.out.print(letras[i]);
    }

    /* Alterações comuns trabalhando com arrays */

    // System.out.println(Arrays.toString(letras));

    /* Maior array, menor array e igual */
    int[] numbers = { 1, 50, 20, 40, 70, 80 };
    int maior = numeros[0];
    int menor = numeros[0];
    int media = 0;

    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] > maior)
        maior = numbers[i];
      if (numbers[i] < menor)
        menor = numbers[i];

      media += numbers[i];
    }

    System.out.println("Maior: " + maior);
    System.out.println("Menor: " + menor);
    System.out.println("Média: " + media / numbers.length);

  }
}
