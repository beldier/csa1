import java.util.ArrayList;
import java.util.List;
public class Central
{
    private List<Local> listaLocal;
    public Central()
    {
        listaLocal = new ArrayList<Local>();
    }
    public void anadirChifa(Local l)
    { 
        listaLocal.add(l);
    }
    public void imprimirChifas()
    {
        for(Local c : listaLocal){
            c.informacion();
        }
    }
}
