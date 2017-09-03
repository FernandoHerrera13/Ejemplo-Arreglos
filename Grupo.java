public class Grupo
{
    private String nombreMateria;
    private Estudiante[] estudiantes;
    
    public Grupo(int totalEstudiantes, String nombreMateria)
    {
        estudiantes = new Estudiante[totalEstudiantes];
        this.nombreMateria=nombreMateria;
    }
    
     /**
     * Ayuda a buscar a  un estudiante por su clave.
     * @param clave
     * @retunr Regresa la posicion del estudiante en el arreglo o -1 si no existe
     */
    public int buscarEstudiante(int clave)
    {
        for(int i = 0; i<estudiantes.length; i++)
        {
            if(clave==estudiantes[i].dimeClave())
            {
            return i;
            }
        }
        return -1;
    }
    
    /**
     * Busca un espacio disponible en el arreglo
     * @return Regresa la poscion nula dentro del arreglo y sino encontro espacio regresa el valor de -1
     */
    private int buscaEspacioDisponible()
    {
        for(int i= 0; i<estudiantes.length;i++)
        {
            if(estudiantes[i] == null)
            {
                return i;
            }
        }
        return -1;
    }
    
    /**
     * Inscribe a un estudiante
     * @param unEstudiante 
     * @return Regresa verdadero si el estudiante fue inscrito o falso en caso de que no
     */
    public boolean inscribir(Estudiante unEstudiante)
    {
        int existe = this.buscarEstudiante(unEstudiante.dimeClave());
        if(existe ==-1)
        {
            return false;
        }
        int posDisponible = this.buscaEspacioDisponible();
        if(posDisponible == -1)
        {
            return false;
        }
        estudiantes[posDisponible]=unEstudiante;
        return true;
    }
    
    /**
     * Da de baja a un estudiante del grupo.
     * @param claveUnica 
     * @return Regresa verdadero si el estudiante fue dado de baja o falso en caso de que no
     */
    public boolean baja(int claveUnica)
    {
        int existe = this.buscarEstudiante(claveUnica);
        if(existe ==-1)
        {
            return false;
        }
        this.estudiantes[existe] = null;
        return true;
    }
}