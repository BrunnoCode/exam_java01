import java.util.Random;
import java.util.Scanner;

public class Aladim{
  public  static void main(String[] args){
    slowWords("-Whoou!!! hemos encontrado una lampara magica!", 50);
    System.out.print("\uD83D\uDE2E\n");
    slowWords("-Espera sale algo de dentro...\n", 50);
    System.out.print("\uD83E\uDDDE");
    slowWords("-Hola quién me ha despertado? Ahora tienes que hacer 7 deseos, pero solo 1 sera concedido!, estas preparado ? pues digame\n", 50);
    slowWords("...", 300);
    String[] deseos = new String[7];
    Scanner scan = new Scanner(System.in);
    int i = 0;
    int cont = 7;
    while (i < deseos.length){
      System.out.println("\uD83E\uDDDE-Muy bien, aun faltan "+cont+" deseos! \uD83D\uDE03");
      deseos[i++] = scan.nextLine();
      cont--;
    }
    putLine();
    Random indexRandom = new Random();
    slowWords("\uD83E\uDDDE-Tus Deseos se han hecho realidad, pediste los 7 deseos\uD83D\uDE03 pues aqui 1 lo tienes: ", 100);
    System.out.println(deseos[indexRandom.nextInt(i)].toUpperCase());
    putLine();
    slowWords("\uD83E\uDDDE-Espero que te haya gustado!!!", i);
    scan.close();
  }

  // Printa mensaje letra a letra
  public static void slowWords(String frase, int t){
    try {
      for (int i = 0; i < frase.length(); i++){
        Thread.sleep(t);
        System.out.print(frase.charAt(i));
      }
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
  // Sparador por lineas *-*-*-*-*-*
  public static void putLine(){
    System.out.println("\n-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");
  }
}
