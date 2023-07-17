package agendatelefonica1;

public class Contacto1 {
     String telefono, nombre, domicilio;

    public Contacto1 (String telefono, String nombre, String domicilio) {
        this.telefono = telefono;
        this.nombre = nombre;
        this.domicilio = domicilio;
    }

    public String verTelefono() {
        return telefono;
    }

    public String verNombre() {
        return nombre;
    }

    public String verDomicilio() {
      return domicilio;
    }
  public void setTelefono(String telefono){
      this.telefono = telefono;
  }        

  public void setNombre(String nombre){
      this.nombre = nombre;
  }
  public void setDomicilio(String domicilio){
      this.domicilio = domicilio;
      
  }
  
}
