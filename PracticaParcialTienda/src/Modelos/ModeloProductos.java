
package Modelos;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class ModeloProductos {
    
    ArrayList MiLista =  new ArrayList();
    DefaultTableModel ModeloTabla;
    
    public void IngresarDatos(String nom, String id, String color)
    {
        Productos nuevosProductos = new Productos(nom, color, id);
        this.MiLista.add(nuevosProductos);
    }
    public DefaultTableModel ListarProcutos()
    {
        ArrayList<Productos>listaLocal = MiLista;
        ModeloTabla = new DefaultTableModel();
        this.ModeloTabla.setRowCount(0);
        this.ModeloTabla.addColumn("NOMBRE DEL PRODUCTO");
        this.ModeloTabla.addColumn("COLOR");
        this.ModeloTabla.addColumn("ID");
        for(Productos MiListaDeProductos: listaLocal)
        {
            this.ModeloTabla.addRow(new Object []{MiListaDeProductos.getNombre(),
                MiListaDeProductos.getId(), MiListaDeProductos.getColor()});
        }
        return ModeloTabla;       
    }    
}
