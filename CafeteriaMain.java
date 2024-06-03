/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cafeteria;

import java.util.Scanner;


public class CafeteriaMain {
    public static void main(String args[]) {
        
        
        int centinela = 1;
        String prod_producto = "", prov_nombre = "", prov_telefono = "", prov_direccion = "", ven_tipo = "", ven_clasificacion = "", ven_descripcion = "";
        int prod_cantidad = 0, prov_indice = 0, prod_indice = 0;
        float prod_precio = 0, ven_precio = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Si desea ingresa un nuevo producto digite 1,  "
                + "si desea ingresar un nuevo proveedor digite 2"
                + "si desea ingresar un nuevo producto para la venta digite 3");
        int seleccion = entrada.nextInt();
        System.out.println("");
            
        while (centinela == 1) {
                                       
         switch (seleccion) {
             case 1:
                    System.out.println("");
                    prod_producto = entrada.nextLine();
                    System.out.println("Digite el nombre del producto (ej: huevos, leche): ");
                    prod_producto = entrada.nextLine();
                    System.out.println("Digite el precio unitario de compra: ");
                    prod_precio = entrada.nextFloat();
                    System.out.println("Digite la cantidad disponible: ");
                    prod_cantidad = entrada.nextInt();
                    System.out.println("Digite el indice del proveedor (indice para buscar en el archivo proveedores): ");
                    prod_indice = entrada.nextInt();
                    
                    centinela = 0;
                 break;
                
                case 2:
                    System.out.println("");
                    prov_nombre = entrada.nextLine();
                    System.out.println("Digite el nombre del proveedor: ");
                    prov_nombre = entrada.nextLine();
                    System.out.println("Digite el telefono del proveedor: ");
                    prov_telefono = entrada.nextLine();
                    System.out.println("Digite la direccion del proveedor: ");
                    prov_direccion = entrada.nextLine();
                    System.out.println("Digite el indice del proveedor: ");
                    prov_indice = entrada.nextInt();
                
                    centinela = 0;
                    break;
                
            case 3:
                    System.out.println("");
                    ven_tipo = entrada.nextLine();
                    System.out.println("Digite el tipo de producto a vender (ej: bebida, plato): ");
                    ven_tipo = entrada.nextLine();
                    System.out.println("Digite la clasificacion del producto a vender (ej: jugo, bebida caliente): ");
                    ven_clasificacion = entrada.nextLine();
                    System.out.println("Digite la descripcion del producto a vender(jugo de naranja, chocolate): ");
                    ven_descripcion = entrada.nextLine();
                    System.out.println("Digite el precio del producto a vender: ");
                    ven_precio = entrada.nextFloat();
                    centinela = 0;
                break;
            
            default:
                
                    System.out.println("Si desea ingresa un nuevo producto digite 1,  "
                        + "si desea ingresar un nuevo proveedor digite 2"
                        + "si desea ingresar un nuevo producto para la venta digite 3");
                    seleccion = entrada.nextInt();
                break;
                    
                
            }        
        }
        
        Cafeteria valores = new Cafeteria(seleccion, prod_producto, prov_nombre, prov_telefono, prov_direccion, ven_tipo, ven_clasificacion, ven_descripcion, prod_cantidad, prov_indice, prod_indice, prod_precio, ven_precio);
        valores.exportar();    
    }    
}
