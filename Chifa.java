
public class Chifa extends Local implements Comparable<Chifa>
{
    private int galletasSuerte;
    public Chifa(String nombre, String direccion)
    {
        super(nombre,direccion);
        galletasSuerte = 100;
    }
    public void informacion()
    {
        System.out.println("El nombre de la chifa es :"+getNombre());
        System.out.println("Su direccion "+ getDireccion());
        System.out.println("La cantidad de galletas especiales que tiene es "+galletasSuerte);
        System.out.println("####################");
    }
    public void venderPlato()
    {
        super.cantidadPlatosDisponibles--;
    }
    public int getCantidadGalletas()
    {
        return galletasSuerte;
    }
    public void cantidadGalletas(int cantidad)
    {
        galletasSuerte-= cantidad;
    }
     public int compareTo(Chifa f)
    {       
        int ans=-1;
        if(galletasSuerte==f.getCantidadGalletas())
            ans=0;
        else
            if(galletasSuerte<f.getCantidadGalletas())
                ans=-1;
            else
                ans=1;
        return ans;
    }
    
}
