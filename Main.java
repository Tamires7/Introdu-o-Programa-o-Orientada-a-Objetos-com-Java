import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    String texto;
    Scanner leitor = new Scanner(System.in);
    System.out.println("Digite o texto");
    texto = leitor.nextLine();
    System.out.println("Você digitou: " +texto);
    leitor.close();
  }
}

