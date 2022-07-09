public class main {
    public static void main(String[] args){

       Persona estudiante = new Persona();

       estudiante.setNombre("Pablo");
       estudiante.setEdad(24);
       estudiante.setTelefono("+15551235523");
       System.out.println("Nombre del estudiante: " + estudiante.getNombre());
       System.out.println("Edad del estudiante: " + estudiante.getEdad());
       System.out.println("Telefono del estudiante: " + estudiante.getTelefono());
    }
}
class Persona{
    private String nombre;
    private String telefono;
    private int edad;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}