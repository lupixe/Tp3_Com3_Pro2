//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[]args) {
        ///1)
        Empleado empleado1 = new Empleado();
        empleado1.setNombre("Carlos Gutiérrez");
        empleado1.setDni(23456345);
        empleado1.setSalario(27500);
        Empleado empleado2 = new Empleado();
        empleado2.setNombre("Ana Sánchez");
        empleado2.setDni(34234123);
        empleado2.setSalario(27500);
        empleado1.imprimir();
        empleado2.imprimir();
    }
}