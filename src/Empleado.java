public class Empleado {
    private int dni;
    private String Nombre;
    private double salario;

    public Empleado(){}
    public int getDni() {
        return dni;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }
    public String getNombre(){
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void imprimir()
    {
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("\nDni: " + this.getDni());
        System.out.println("\nSalario: " + this.getSalario());
    }
    public double SalarioAnual() {return (salario*12);}
}
