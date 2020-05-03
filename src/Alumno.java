
import java.util.HashSet;

public class Alumno 
{
    private int legajo;
    private String apellido;
    private String nombre;
    private HashSet<Integer> materias = new HashSet<>();

    public Alumno(int legajo, String apellido, String nombre) 
    {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public int getLegajo() 
    {
        return legajo;
    }

    public void setLegajo(int legajo) 
    {
        this.legajo = legajo;
    }

    public String getApellido() 
    {
        return apellido;
    }

    public void setApellido(String apellido) 
    {
        this.apellido = apellido;
    }

    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }
    
    public void agregarMateria(Materia m)
    {
        if(this.materias.add(m.getIdMateria()))
        {
            System.out.println("Se inscribio al alumno "+this.nombre+" "+this.apellido+" en la materia "+m.getNombre());
        }
        else
        {
            System.out.println("El alumno "+this.nombre+" "+this.apellido+" ya se encontraba inscripto en la materia "+m.getNombre()+"!");
        }
    }
    
    public int cantidadMaterias()
    {
        return this.materias.size();
    }
}
