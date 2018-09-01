

public abstract class Local
{
    protected String nombre;
    protected String direccion;
    protected String platoNombre;
    protected int platoPrecio;
    protected int cantidadPlatosDisponibles;
    public Local(String nombre,String direccion)
    {
        this.nombre=nombre;
        this.direccion=direccion;
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
    public abstract void informacion();
    

}
