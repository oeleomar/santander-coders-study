package santanderCoders;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class ManipulacaoStringsDatas {
  public static void main(String[] args) {
    /* Manipulação de Strings */
    String nome = "Eleomar";

    System.out.println(nome.toUpperCase()); // Texto para letras maiusculas;
    System.out.println(nome.toLowerCase()); // Convertendo para letras minúsculas;
    System.out.println(nome.length()); // Tamanho do texto;

    String outroNome = "eleomar";
    System.out.println(nome.equals(outroNome)); // Compara duas strings
    System.out.println(nome.equalsIgnoreCase(outroNome)); // Compara duas strings ignorando maiusculos e minusculos

    /* Objetivo */

    LocalDate data = LocalDate.now(); // Retorna a data de hoje. Seguindo as regras da ISO 8601
    Locale brasil = new Locale("pt", "BR"); // Pega a localidade
    System.out.println(data.getDayOfWeek()); // Mostra o dia da semana;
    System.out.println(data.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));
    // Passa dois parâmetros o estilo de texto e a localidade
    String diaSemana = data.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);

    String saudacao;
    LocalDateTime hora = LocalDateTime.now();

    if (hora.getHour() >= 0 && hora.getHour() < 12)
      saudacao = "bom dia";
    else if (hora.getHour() >= 12 && hora.getHour() < 18)
      saudacao = "boa tarde";
    else if (hora.getHour() >= 18 && hora.getHour() < 24)
      saudacao = "boa noite";
    else
      saudacao = "ola";

    System.out.println();
    System.out.printf("Olá, %s. Hoje é %s, %s.%n", nome, diaSemana, saudacao.toUpperCase());

  }
}
