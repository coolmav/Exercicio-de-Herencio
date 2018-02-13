
public class Profesor extends Persona{
    
    private String IdProfesor;
    
    public Profesor(String nombre, String apellido, String edad){
        super(nombre, apellido, edad);
    }

    public Profesor(String IdProfesor, String nombre, String apellido, String edad) {
    
    super(nombre, apellido, edad);
    this.IdProfesor = IdProfesor;
    }

    public String getIdProfesor() {
        return IdProfesor;
    }
    
   



}



