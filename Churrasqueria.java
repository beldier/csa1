
public class Churrasqueria extends Local
{
    private double chicha;
    private double guarapo;
    public Churrasqueria(String nombre, String direccion)
    {
        super(nombre,direccion);
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
        System.out.println("El nombre de la churrasqueria es :"+getNombre());
        System.out.println("Su direccion "+ getDireccion());
        System.out.println("La cantidad de platos que posee "+cantidadPlatosDisponibles());
        System.out.println("####################");
    }
    
    public void venderPlato()
    {
        super.cantidadPlatosDisponibles--;
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
