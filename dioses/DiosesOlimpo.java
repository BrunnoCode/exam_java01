

import java.util.Random;

public class DiosesOlimpo extends Dios{
  private String poder;
  public DiosesOlimpo(){

  }

  public DiosesOlimpo(String nombre, int edad, float fuerza, String poder){
    super(nombre, edad, fuerza);
    this.poder = poder;
  }

  
  public String getPoder() {
    return poder;
  }

  public void setPoder(String poder) {
    this.poder = poder;
  }

  // Pderes especiales
  public int olimpoPower(){
    Random power = new Random();
    return power.nextInt(300);
  }

  @Override
  public String toString() {
    return super.toString()+"Poder: "+getPoder()+"\n";
          
  }

  
}