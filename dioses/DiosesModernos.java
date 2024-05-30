
import java.util.Random;

public class DiosesModernos extends Dios{

  private String popularidad;
  public DiosesModernos(){

  }

  public DiosesModernos(String nombre, int edad, float fuerza, String popularidad){
    super(nombre, edad, fuerza);
    this.popularidad = popularidad;
  }

  
  public String getPopularidad() {
    return popularidad;
  }

  public void setPopularidad(String popularidad) {
    this.popularidad = popularidad;
  }

  public int modernPower(){
    Random power = new Random();
    return power.nextInt(300);
  }


  @Override
  public String toString() {
    return super.toString()+"popularidad: "+getPopularidad()+"\n";
          
  }

}