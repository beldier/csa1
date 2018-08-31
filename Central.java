import java.util.ArrayList;
public class Central
{
    private ArrayList<Local> listaLocal;
    public Central()
    {
        listaLocal=new ArrayList<Local>();
    }
    public void anadirLocal(Local c)
    {
        listaLocal.add(c);
    } 
    public void imprimirChifas()
    {
        for(Local c : listaLocal)
            c.informacion();
    }
}
