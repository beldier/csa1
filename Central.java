import java.util.ArrayList;
public class Central
{
    private ArrayList<Chifa> listaChifa;
    private ArrayList<Churrasqueria> listaChurrasqueria;
    public Central()
    {
        listaChifa = new ArrayList<Chifa>();
        listaChurrasqueria = new ArrayList<Churrasqueria>();
    }
    public void anadirChurrasqueria(Churrasqueria c)
    {
        listaChurrasqueria.add(c);
    } 
    public void anadirChifa(Chifa chifa)
    {
        listaChifa.add(chifa);
    }
    public void imprimirChifas()
    {
        for(Chifa c : listaChifa)
            c.informacion();
    }
    public void imprimirChurrasquerias()
    {
        for(Churrasqueria c : listaChurrasqueria)
            c.informacion();
    }

}
