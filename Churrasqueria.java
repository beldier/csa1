
public class Churrasqueria
{
    private String nombre;
    private String direccion;
    private String platoNombre;
    private int platoPrecio;
    private int cantidadPlatosDisponibles;
    private double chicha;
    private double guarapo;
    public Churrasqueria(String nombre, String direccion)
    {
        this.nombre = nombre;
        this.direccion = direccion;
        cantidadPlatosDisponibles = 200;
        chicha = 150.0;
        guarapo = 100.0;
    }
    public void servirChicha(double pedido){
        chicha-=pedido;
    }
    public void servirGuarapo(double pedido){
        guarapo-= pedido;
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
