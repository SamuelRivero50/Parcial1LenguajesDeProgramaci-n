public class ObjetosDePersona {
   public static void main (String[] args){
      // Herencia (Capacidad de crear clases u objetos partiendo de otras clases)

      //En esta parte del código instancio mis objetos de la clase persona
      Persona Estudiante = new Persona("Samuel", "Rivero", "Estudiante", 18);
      Persona Docente = new Persona("Pedro", "Arboleda", "Docente", 2000000, 32);
      Persona Administrativo = new Persona("Maria", "Villada", "Administrativo", 1500000, 24);

      //Aquí imprimo cada una de las características de los objetos de mi clase persona
      System.out.println("Caracteristicas de Estudiante");
      System.out.println("Nombre: "+ Estudiante.getNombre());
      System.out.println("Apellido: "+ Estudiante.getApellido());
      System.out.println("Labor: "+ Estudiante.getLabor());
      System.out.println("Edad: "+ Estudiante.getEdad()+"\n");

      System.out.println("Caracteristicas de Docente");
      System.out.println("Nombre: "+ Docente.getNombre());
      System.out.println("Apellido: "+ Docente.getApellido());
      System.out.println("Labor: "+ Docente.getLabor());
      System.out.println("Salario: "+ Docente.getSalario());
      System.out.println("Edad: "+ Docente.getEdad()+"\n");

      System.out.println("Caracteristicas de Administrativo");
      System.out.println("Nombre: "+ Administrativo.getNombre());
      System.out.println("Apellido: "+ Administrativo.getApellido());
      System.out.println("Labor: "+ Administrativo.getLabor());
      System.out.println("Salario: "+ Administrativo.getSalario());
      System.out.println("Edad: "+ Administrativo.getEdad()+"\n");

      //Ahora aplico los métodos creados en la clase persona que no son setters y getters

      Persona.cambiarLabor(Administrativo, "Docente");

      Persona.imprimirNombreCompleto(Estudiante);

      Persona.verificarMayorEdad(Docente);

   }

}