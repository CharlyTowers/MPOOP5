public class Coche{
  //sección de atributos
  private String color;
  private String marca;
  private int numPuertas;
  private int año;
  private int potencia;
  private boolean automático;
  private Persona chofer;
  private Persona copiloto;
  private Persona pasajero1;
  private Persona pasajero2;

  //sección de constructores
  public Coche(){
  }
    public Coche(String marca, int año, String color, int numPuertas, boolean automático, int potencia, Persona chofer, Persona copiloto, Persona pasajero1, Persona pasajero2){
      this.marca = marca;
      this.año = año;
      this.color = color;
      this.numPuertas= numPuertas;
      this.automático = automático;
      this.potencia = potencia;

      chofer = new Persona ();
      this.chofer = chofer;
      copiloto = new Persona ();
      this.copiloto = copiloto;
      pasajero1 = new Persona ();
      this.pasajero1 = pasajero1;
      pasajero2 = new Persona ();
      this.pasajero2 = pasajero2;

    } 

  //sección de métodos
  public void encender(){
    System.out.println("Soy el coche de la marca "+marca+" y estoy encendiendo");

  }

  public void avanzar(boolean avanza){
    if(avanza){
      System.out.println("Estoy avanzando a 10 km/h");
    }else{
      System.out.println("Voy a 0km/h");
    }
  }

  public void apagar(){
    System.out.println("Soy el coche de la marca "+marca+" y estoy apagandome");
  }

  public void frenar(boolean frenar){
    if(frenar){
      System.out.println("Estoy frenando");
    }else{
      System.out.println("No estoy frenando");
    }
  }

  public void abrirPuertas(int numPuertasAAbrir){
    if(numPuertasAAbrir > numPuertas){
      System.out.println("El numero de puertas a abrir es mayor al numero del puertas del coche");
    }else{
      System.out.println("Abriendo "+numPuertasAAbrir+" puertas");
    }
  }

  public String getColor(){
    return color;   }
  public void setColor(String color){
    this.color = color;   }

  public String getMarca(){
    return marca;   }
  public void setMarca(String marca){
    this.marca = marca;   }

  public int getNumPuertas(){
    return numPuertas;  }
  public void setNumPuertas(int numPuertas){
    this.numPuertas = numPuertas;   }

  public int getAño(){
  return año;   }
  public void setAño(int año){
    this.año = año;   }

  public int getPotencia(){
    return potencia;   }
  public void setPotencia(int potencia){
    this.potencia = potencia;   }

  public boolean getAutomático(){
    return automático;   }
  public void setAutomático(boolean automático){
    this.automático = automático;   }

  public Persona getChofer(){
    return chofer;   }
  public void setChofer(Persona chofer){
    this.chofer = chofer;   }

  public Persona getCopiloto(){
    return copiloto;   }
  public void setCopiloto(Persona copiloto){
    this.copiloto = copiloto;   }

  public Persona getPasajero1(){
    return pasajero1;   }
  public void setPasajero1(Persona pasajero1){
    this.pasajero1 = pasajero1;   }

  public Persona getPasajero2(){
    return pasajero2;   }
  public void setPasajero2(Persona pasajero2){
    this.pasajero2 = pasajero2;   }

  @Override
  public String toString(){
    return "Coche{ Este es un vehículo de la marca: "+marca+" del año: "+año+" de color: "+color+", con un total de "+numPuertas+" puertas, es "+automático+" que es automático, con una potencia de "+potencia+" HP. Las personas abordo son: CHOFER= "+chofer+" COPILOTO= "+copiloto+" PASAJERO1= "+pasajero1+" PASAJERO2= "+pasajero2+"}";
  }
}