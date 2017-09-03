public class Grupo
{
    private String nombreMateria;
    private Estudiante[] estudiantes;
    public Grupo(int totalEstudiantes, String nomMateria)
    {
        estudiantes = new Estudiante[totalEstudiantes];
        this.nombreMateria=nomMateria;
    }
        /**
     * Busca un estudiante por medio de su clave.
     * @param claveEstudiante.
     * @retunr Regresa la posicion del estudiante en el arreglo o -1 si no existe.
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
     * @return Regresa la poscion nula dentro del arreglo
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
     * Inscribe un estudiante nuevo del grupo.
     * @param unEstudiante Es el objeto estuduante a inscribir en el grupo.
     * @return Regresa verdadero si el estudiante fue inscrito o falso en caso de que
     *         no se pudiera inscribir.
     */
    public boolean inscribir(Estudiante unEstudiante)
    {
        int existe = this.buscarEstudiante(unEstudiante.dimeClave());
        if(existe ==-1)
        {
            return false;//Existe el estudiante inscrito
        }
        int posDisponible = this.buscaEspacioDisponible();
        if(posDisponible == -1)
        {
            return false;//No existe espacio disponible
        }
        estudiantes[posDisponible]=unEstudiante;//el estudiante fue inscrito
        return true;
    }
    /**
     * Inscribe un estudiante nuevo del grupo.
     * @param claveUnica Es la del estudiante a dar de baja en el grupo.
     * @return Regresa verdadero si el estudiante fue dado de baja o falso en caso de que
     *         no se pudiera dar de baja por que no existe.
     */
    public boolean baja(int claveUnica)
    {
        int existe = this.buscarEstudiante(claveUnica);
        if(existe ==-1)
        {
            return false;//No existe el estudiante inscrito
        }
        this.estudiantes[existe] = null;
        return true;
    }
}