import java.util.ArrayList;
public class Central
{
    private ArrayList<Chifa> listaChifa;
    public Central()
    {
        listaChifa = new ArrayList<Chifa>();
    }
    public void anadirChifa(Chifa chifa)
    {
        listaChifa.add(chifa);
    }
    public void imprimirChifas()
    {
        for(Chifa c : listaChifa){
            c.informacion();
        }
    }

}
