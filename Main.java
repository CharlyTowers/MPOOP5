class Main {
  public static void main(String[] args) {
    Circulo cir = new Circulo();
    cir.setRadio(5.6f);
    System.out.println(cir);
    float var=-8.66f;
    cir.setRadio(var);
    System.out.println(cir);

    System.out.println("##### Composicion 1 #####");
    Persona persona1 = new Persona();
    persona1.setNombre("Susana");
    persona1.setApellido("Vazquez");
    Fecha fecha = new Fecha(2,1,2021);
    persona1.setfNacimiento(fecha);
    System.out.println(persona1); 
    System.out.println("Su año de cumpleaños es:");
    System.out.println(persona1.getfNacimiento().getAño());

    System.out.println("##### Composicion 2 #####");
    Persona persona2 = new Persona("Rafael", "Zavala",8,4,1998);
    System.out.println(persona2);
    System.out.println("Su año de cumpleaños es:");
    System.out.println(persona2.getfNacimiento().getAño());

    System.out.println("######ACTIVIDAD EXTRA#######");
    Coche coche1 = new Coche();
    coche1.setMarca("Nissan");
    coche1.setAño(2005);
    coche1.setColor("Rojo");
    coche1.setNumPuertas(4);
    coche1.setAutomático(true);
    coche1.setPotencia(700);
    Fecha fchof = new Fecha(29, 4, 1999);
    Persona chofer1 = new Persona("Carlos","Torres", fchof);
    coche1.setChofer(chofer1);
    Fecha fcop = new Fecha(21, 11, 1996);
    Persona cop1 = new Persona("Alejandro", "Martínez", fcop);
    coche1.setCopiloto(cop1);
    Fecha fpasajero1 = new Fecha(24, 9, 2001);
    Persona pasajero1 = new Persona("Guadalupe", "Reyes", fpasajero1);
    coche1.setPasajero1(pasajero1);
    Fecha fpasajero2 = new Fecha(3, 5, 2000);
    Persona pasajero2 = new Persona("Estéban", "Juárez", fpasajero2);
    coche1.setPasajero2(pasajero2); 
    System.out.println(coche1);
  }


}