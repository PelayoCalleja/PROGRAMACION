package prog07bloqueiii;

public class Contacto implements Comparable<Contacto> {

    //Atributos
    private String nombrePila;
    private String nombre;
    private String apellidos;
    private String email;
    private String telefono;

    //Metodos
    public Contacto(String nombrePila, String nombre, String apellidos, String email, String telefono) {
        this.nombrePila = nombrePila;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.telefono = telefono;
    }
    
    public Contacto(String nombrePila, String telefono) {
        this.nombrePila = nombrePila;
        this.telefono = telefono;
    }
    
    public String getNombrePila() {
        return nombrePila;
    }
    
    public void setNombrePila(String nombrePila) {
        this.nombrePila = nombrePila;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getApellidos() {
        return apellidos;
    }
    
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getTelefono() {
        return telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    @Override
    public String toString() {
        return "Contacto{" + "nombrePila=" + nombrePila + ", nombre=" + nombre + ", apellidos=" + apellidos + ", email=" + email + ", telefono=" + telefono + '}';
    }
    
    @Override
    public int compareTo(Contacto c) {
        return this.getNombrePila().compareTo(c.getNombrePila());
            
        }
    }
    

