
public class Chifa
{
    private String nombre;
    private String direccion;
    private String platoNombre;
    private int platoPrecio;
    private int cantidadPlatosDisponibles;
    public Chifa(String nombre, String direccion)
    {
        this.nombre = nombre;
        this.direccion = direccion;
        cantidadPlatosDisponibles = 200;
    }
    public void informacion()
    {
        System.out.println("El nombre de la chifa es :"+getNombre());
        System.out.println("Su direccion "+ getDireccion());
        System.out.println("La cantidad de platos que posee "+cantidadPlatosDisponibles());
        System.out.println("####################");
    }
    public void venderPlato()
    {
        cantidadPlatosDisponibles--;
    }
    public String getDireccion()
    {
        return direccion;
    }
    public String getNombre()
    {
        return nombre;
    }
    public String getPlato()
    {
        return platoNombre;
    }
    public int cantidadPlatosDisponibles()
    {
        return cantidadPlatosDisponibles;
    }
    public void setPlatoNombre(String nombre)
    {
        platoNombre = nombre;
    }
    public void setPlatoPrecio(int precio)
    {
        platoPrecio = precio;
    }
    public String getPlatoNombre()
    {
        return platoNombre;
    }
    public int getPlatoPrecio()
    {
        return platoPrecio;
    }
    
}
