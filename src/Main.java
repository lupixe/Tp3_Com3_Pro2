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
        int op;
        do {
            System.out.println("ingrese una opcion:");
            System.out.println("1: modificar todo el item");
            System.out.println("2: modificar descripcion");
            System.out.println("3: modificar Cantidad");
            System.out.println("4: modificar Precio");
            System.out.println("5: mostrar item");
            System.out.println("6: mostrar precio total");
            System.out.println("0: salir");
            op = Scaner.nextInt();
            Scaner.nextLine();
            switch (op) {
                case 1:
                    System.out.println("ingrese la descripcion del item: ");
                    String auxD = Scaner.nextLine();
                    System.out.println("ingrese la contidad: ");
                    int auxC = Scaner.nextInt();
                    Scaner.nextLine();
                    System.out.println("ingrese el precio por unidad: ");
                    double auxP = Scaner.nextDouble();
                    item.setDescripcion(auxD);
                    item.setCantidad(auxC);
                    item.setPrecioUnitario(auxP);
                    break;
                case 2:
                    System.out.println("ingrese la descripcion del item: ");
                    String aux1 = Scaner.nextLine();
                    item.setDescripcion(aux1);
                    break;
                case 3:
                    System.out.println("ingrese la contidad: ");
                    int aux2 = Scaner.nextInt();
                    Scaner.nextLine();
                    item.setCantidad(aux2);
                    break;
                case 4:
                    System.out.println("ingrese el precio por unidad: ");
                    double aux3 = Scaner.nextDouble();
                    item.setPrecioUnitario(aux3);
                    break;
                case 5:
                    item.imprimir();
                    break;
                case 6:
                    System.out.println("precio Total: " + item.precioTotal());
                default:
                    break;
            }
        }while (op!=0);



    }
}