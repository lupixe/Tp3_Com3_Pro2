public class Cuenta_Bancaria {
    static int contador=0;
    private int id;
    private String nombre;
    private double saldo;
    public Cuenta_Bancaria(){
        contador=+1;
        this.id=contador;
    }
    public Cuenta_Bancaria(String Nombre, double Saldo)
    {
        contador=+1;
        this.id=contador;
        nombre=Nombre;
        saldo=Saldo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getSaldo() {
        return saldo;
    }
    public double credito(double monto)
    {
        this.saldo=this.saldo+monto;
        return saldo;
    }
    public double debito(double monto)
    {
        if (this.saldo-monto>0) {
            this.saldo = this.saldo - monto;
            return saldo;
        }
        else
        {
            System.out.println("no hay suficiente monto");
            return -1;
        }
    }
    public void imprimir()
    {
        System.out.println("id="+this.id);
        System.out.println("nombre="+this.nombre);
        System.out.println("saldo="+this.saldo);
    }
}
