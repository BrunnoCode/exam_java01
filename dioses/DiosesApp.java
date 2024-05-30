
import java.util.Scanner;



public class DiosesApp{
  public static void main(String[] args){
    System.out.println("Ha empezado la batalla de los Dioses de los siglos!");
    System.out.println("Porfavor rellene los datos de los dioses que van a pelear:");
    System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
    System.out.println("Dios del Olimpo:");
    Scanner scan = new Scanner(System.in);
    DiosesOlimpo do1 = new DiosesOlimpo();
    DiosesModernos dm1 = new DiosesModernos();
    fillGods(do1, scan);
    System.out.print("Poder: ");
    do1.setPoder(scan.nextLine());
    System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
    System.out.println("Dios Moderno:");
    fillGods(dm1, scan);
    System.out.print("Poder moderno: ");
    dm1.setPopularidad(scan.nextLine());
    System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
    System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
    System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");

    System.out.println("Listo todo rellenado, vamos empezar la batalla!!!");
    System.out.println("De um lado tenemos: ");
    System.out.println(do1);
    System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
    System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
    System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
    System.out.println("De outro lado tenemos: ");
    System.out.println(dm1);
    System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
    System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
    System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
    slowWords("Invocando poderes", 55);
    slowWords("............................", 100);
    System.out.println("\nEl ganador es: ");
    int diosModerno = dm1.modernPower();
    int diosOlimpo = do1.olimpoPower();
    if (diosModerno > diosOlimpo)
      System.out.println(dm1);
    else if(diosOlimpo > diosModerno)
      System.out.println(do1);
    else
      System.out.println("Empate, vuelve ejecutar la batalla!!!");
    scan.close();
  }

  public static void fillGods(Dios dios, Scanner scan){
    System.out.print("Nombre; ");
    dios.setNombre(scan.nextLine());
    System.out.print("Edad: ");
    dios.setEdad(Integer.parseInt(scan.nextLine()));
    System.out.print("Ahora la fuerza, debes poner ejemplo: 00.00: ");
    dios.setFuerza(Float.parseFloat(scan.nextLine()));
  }

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
}