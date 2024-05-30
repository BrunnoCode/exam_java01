
public abstract class Dios{
  protected String nombre;
  protected int edad;
  protected float fuerza;

  public Dios(){}

  public Dios(String nombre, int edad, float fuerza){
    this.nombre = nombre;
    this.edad = edad;
    this.fuerza = fuerza;
  }

  public String getNombre() {
    return nombre;
  }
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  public int getEdad() {
    return edad;
  }
  public void setEdad(int edad) {
    this.edad = edad;
  }
  public float getFuerza() {
    return fuerza;
  }
  public void setFuerza(float fuerza) {
    this.fuerza = fuerza;
  }
  public String toString(){
    return "DiosesOlimpo:\nNombre: "+getNombre()+"\nEdad: "+getEdad()+"\nFuerza: "+getFuerza()+"\n";
  }
  
}