
public class Persona {
    
    private String Nombre;
    private String Apellido;
    private String Edad;
    
    
    
    //Creacion de constructor por defecto
    
    public Persona(){
        
    }
    
    //Constructor con dos parametros
    
 public Persona(String nomb, String apel, String ed){
        this.Nombre=nomb;
        this.Apellido=apel;
        this.Edad=ed;
    }

   
   
   /*Metodo Set...*/
   public void setNombre(String Nombre){
         this.Nombre = Nombre;   
    }
    
    public void setApellido(String apellido){
         this.Apellido = apellido;    
    }
    
    public void setEdad(String edad){
         this.Edad = edad;    
    }
    
    
    /* Metodo Get...*/
    public String getNombre(){
         return Nombre;
    }
         
       
    public String getApellido(){
         return Apellido;
    }    
     
         
         
     public String getEdad(){
         return Edad;
     }
         
}

