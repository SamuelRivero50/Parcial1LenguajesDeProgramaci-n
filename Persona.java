public class Persona {
//Encapsulamiento (con private y static se modificarán las propiedad con métodos propios de la clase)
    private String nombre, apellido, labor;
    private double salario;
    private int edad;
    //Al crear estas propiedades se puede evidenciar la abstracción ya que identificamos las características
    //esenciales del objeto que buscamos crear

    public Persona(String nombre, String apellido, String labor, double salario, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.labor = labor;
        this.salario = salario;
        this.edad = edad;

    }

    //En este método se evidencia el polimorfismo ya que se presenta un constructor de la misma
    //clase persona pero con una propiedad menos, sigue siendo una persona pero con distintas propiedades
    public Persona(String nombre, String apellido, String labor, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.labor = labor;
        this.edad = edad;

    }

    //Aquí hago los métodos de mi clase persona para después usarlos con las instancias de mi clase Persona

    public static void cambiarLabor(Persona persona, String nuevaLabor) {
        persona.setLabor(nuevaLabor);
        System.out.println(persona.getNombre() + " ahora trabaja como " + nuevaLabor);
    }

    public static void verificarMayorEdad(Persona persona) {
        if (persona.getEdad() >= 18) {
            System.out.println(persona.getNombre() + " es mayor de edad.");
        } else {
            System.out.println(persona.getNombre() + " no es mayor de edad.");
        }
    }

    public static void imprimirNombreCompleto(Persona persona) {
        System.out.println("Nombre completo: " + persona.getNombre() + " " + persona.getApellido());
    }

    //Creo setters y getters de mi clase persona

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getLabor() {
        return labor;
    }

    public void setLabor(String labor) {
        this.labor = labor;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
    