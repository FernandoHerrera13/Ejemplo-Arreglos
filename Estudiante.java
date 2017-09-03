public class Estudiante
{
    private String nombre="";
    private int clave;
    
    public Estudiante(String nombre, int clave)
    {
        this.nombre=nombre;
        this.clave=clave;
    }
    
    /**
     * Muestra la clave unica del alumno
     * @return regresa un int que representa la CU del alumno
     */
    public int dimeClave()
    {
        return clave;
    }
    
    /**
     * Muestra la informacion del alumno
     * @return int CU del alumno
     * @return String que representa el nombre del alumno
     */
    public String dimeDetalles()
    {
        return "Clave: "+clave+" Nombre: "+nombre;
    }
}
