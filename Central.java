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
            System.out.println("El nombre de la chifa es :"+c.getNombre());
            System.out.println("Su direccion "+c.getDireccion());
            System.out.println("La cantidad de platos que posee "+c.cantidadPlatosDisponibles());
            System.out.println("####################");
        }
    }
}
