
import java.util.ArrayList;
//import java.util.HashSet;
import java.util.Iterator;
//import java.util.Set;

public class Alumno 
{
    private int legajo;
    private String apellido;
    private String nombre;
    //private HashSet<Integer> materias = new HashSet<>();
    //private HashSet<Materia> materias = new HashSet<>();
    private ArrayList<Materia> materias = new ArrayList<>();

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
    
    //Override
    public boolean equals(Materia materia) 
    {
        boolean control = false;
        
        if(materia != null)
        {
            //Materia materia2 = (Materia)materia;
            
            Iterator<Materia> it = this.materias.iterator();
            
            while(it.hasNext())
            {
                if(it.next().getIdMateria() == materia.getIdMateria())
                {
                    control = true;
                }
            }
            
            return control;     
        }
        else
        {
            return control;
        }
    }
    
    public void agregarMateria(Materia materia)
    {   
        if(!this.equals(materia))
        {
            this.materias.add(materia);
            System.out.println("Se inscribio al alumno "+this.nombre+" "+this.apellido+" en la materia "+materia.getNombre());
        }
        else
        {
            System.out.println("El alumno "+this.nombre+" "+this.apellido+" ya se encontraba inscripto en la materia "+materia.getNombre()+"!");
        }        
        /*if(this.materias.add(m.getIdMateria()))
        {
            System.out.println("Se inscribio al alumno "+this.nombre+" "+this.apellido+" en la materia "+m.getNombre());
        }
        else
        {
            System.out.println("El alumno "+this.nombre+" "+this.apellido+" ya se encontraba inscripto en la materia "+m.getNombre()+"!");
        }*/
    }
    
    public int cantidadMaterias()
    {
        return this.materias.size();
    }
}
