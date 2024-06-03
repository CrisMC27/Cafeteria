
package cafeteria;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Cafeteria {
    
    String usuario = System.getProperty("user.name");
    private String prod_pro, prov_nom, prov_tel, prov_dir, ven_tip, ven_cla, ven_des;
    
    private int prod_can, prod_ind, prov_ind,selecc;
    private float prod_pre, ven_pre;
    
    public Cafeteria(int seleccion, String prod_producto, String prov_nombre, 
            String prov_telefono, String prov_direccion, String ven_tipo, 
            String ven_clasificacion, String ven_descripcion, int prod_cantidad, 
            int prov_indice, int prod_indice, float prod_precio, float ven_precio) {
    
        this.selecc = seleccion;
        this.prod_pro = prod_producto;
        this.prov_nom = prov_nombre;
        this.prov_tel = prov_telefono;
        this.prov_dir = prov_direccion;
        this.ven_tip = ven_tipo;
        
        this.ven_cla = ven_clasificacion;
        this.ven_des = ven_descripcion;
        this.prod_can = prod_cantidad;
        this.prod_ind = prod_indice;
        this.prov_ind = prov_indice;
        this.prod_pre = prod_precio;
        this.ven_pre = ven_precio;
        
    }
    
    
    public void exportar () {
        
        switch (selecc) {
            case 1:
                try {
                    
                    FileWriter fw = new FileWriter("C:\\Users\\" + usuario + "\\Documents\\productos.txt", true);
                    fw.write("\n" + prod_pro + " | " +  prod_pre + " | " + prod_can + " | " + prod_ind);
                    fw.close();
                    
                } catch (IOException ex) {
                    
                    Logger.getLogger(Cafeteria.class.getName()).log(Level.SEVERE, null, ex);
                    
                }
            break;
            
            case 2:
                try {
                    
                    FileWriter fw = new FileWriter("C:\\Users\\" + usuario + "\\Documents\\proveedores.txt", true);
                    fw.write("\n" + prov_ind + " | " +  prov_nom + " | " + prov_tel + " | " + prov_dir);
                    fw.close();
                    
                } catch (IOException ex) {
                    
                    Logger.getLogger(Cafeteria.class.getName()).log(Level.SEVERE, null, ex);
                    
                }
            break;
            
            default: 
                try {
                    
                    FileWriter fw = new FileWriter("C:\\Users\\" + usuario + "\\Documents\\productos venta.txt", true);
                    fw.write("\n" + ven_tip + " | " +  ven_cla + " | " + ven_des + " | " + ven_pre);
                    fw.close();
                    
                } catch (IOException ex) {
                    
                    Logger.getLogger(Cafeteria.class.getName()).log(Level.SEVERE, null, ex);
                    
                }
            break;
            
        }
    
    
    }
    
    
}
