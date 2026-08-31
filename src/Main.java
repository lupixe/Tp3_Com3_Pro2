import  java.util.Scanner;
public class Main {
    public static void main(String[]args) {
        ///1)
        /*
        Empleado empleado1 = new Empleado();
        empleado1.setNombre("Carlos Gutiérrez");
        empleado1.setDni(23456345);
        empleado1.setSalario(27500);
        Empleado empleado2 = new Empleado();
        empleado2.setNombre("Ana Sánchez");
        empleado2.setDni(34234123);
        empleado2.setSalario(27500);
        double num= empleado1.getSalario();
        num=num+num*0.15;
        empleado1.setSalario(num);
        empleado1.imprimir();
        System.out.println("salario Anual"+empleado1.SalarioAnual());
         */
        ///2)
        /*
        Cuenta_Bancaria cuenta1 = new Cuenta_Bancaria ("rodrigo",15000);
        cuenta1.credito(2500);
        cuenta1.debito(1500);
        cuenta1.debito(2500);
        cuenta1.imprimir();
         */
        //3)
        Scanner Scaner= new Scanner(System.in);
        item_Venta item= new item_Venta();
        System.out.println("ingrese la descripcion del item: ");
        String auxN= Scaner.nextLine();
        System.out.println("ingrese la contidad= ");
        int auxC=Scaner.nextInt();
        Scaner.nextLine();
        System.out.println("ingrese el precio por unidad= ");
        double auxP=Scaner.nextDouble();




    }
}