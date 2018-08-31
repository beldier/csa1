
public class Chifa extends Local
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
    public void cantidadGalletas(int cantidad)
    {
        galletasSuerte-= cantidad;
    }
    
}
