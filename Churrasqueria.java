
public class Churrasqueria extends Local implements Comparable<Churrasqueria>
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
    public double  getChicha()
    {
        return chicha;
    }
    public void venderPlato()
    {
        super.cantidadPlatosDisponibles--;
    }
 
    public void informacion()
    {
        System.out.println("Nombre de churrasqueria: "+ super.getNombre());
    }
    public int compareTo(Churrasqueria local)
    {
        int ans =0;
        if(chicha<local.getChicha())
            ans=-1;
        else
            if(chicha == local.getChicha())
                ans=0;
            else
                ans=1;
        return ans;
    }
}
