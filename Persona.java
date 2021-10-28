public class Persona{
  private String nombre;
  private String apellido;
  private Fecha fNacimiento;
  
public Persona(){}
  public Persona (String nombre, String apellido, Fecha fNacimiento){
    this.nombre = nombre;
    this.apellido = apellido;
    this.fNacimiento = fNacimiento;
  }

  public Persona(String nombre, String apellido, int dia, int mes, int año){
    this.nombre = nombre;
    this.apellido = apellido;
    fNacimiento = new Fecha(dia,mes,año);
    /*fNacimiento = new Fecha();
    this.fNacimiento.setDia(dia);
    this.fNacimiento.setMes(mes);
    this.fNacimiento.setAño(año);*/
  }

  public String getNombre(){
    return nombre;   }
  public void setNombre (String nombre){
    this.nombre = nombre;  }

  public String getApellido(){
    return apellido;   }
  public void setApellido(String apellido){
    this.apellido = apellido;  }

  public Fecha getfNacimiento(){
    return fNacimiento;   }
  public void setfNacimiento( Fecha fNacimiento){
    this.fNacimiento = fNacimiento;  }

@Override
public String toString(){
  return "Es una Persona de nombre: "+nombre+" apellido: "+apellido+" y su fecha de nacimiento es: "+fNacimiento;
}

}