/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelos.ModeloProductos;
import Vistas.frmPrincipal;
import Vistas.frmProductos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author revol
 */
public class ProductosController implements ActionListener {
    frmPrincipal VistaPrincipal;
    frmProductos VistaProductos; 
    ModeloProductos ProductosModelo;
    
    public ProductosController( frmPrincipal VistaPrincipal, frmProductos VistaProductos,
            ModeloProductos ProductosModelo){
        
         this.VistaPrincipal = VistaPrincipal;
         this.VistaProductos = VistaProductos;
         this.ProductosModelo = ProductosModelo;
         
         this.VistaPrincipal.btnAggProd.addActionListener(this);
         this.VistaPrincipal.btnListaProductos.addActionListener(this);
         
         this.VistaPrincipal.setExtendedState(frmPrincipal.MAXIMIZED_BOTH);
         this.VistaPrincipal.setVisible(true);
         
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == VistaPrincipal.btnAggProd)
        {
            this.ProductosModelo.IngresarDatos(this.VistaPrincipal.txtNombre.getText(),
                    this.VistaPrincipal.txtId.getText(),this.VistaPrincipal.txtColor.getText());
            
             this.VistaPrincipal.txtNombre.setText("");
             this.VistaPrincipal.txtId.setText("");
             this.VistaPrincipal.txtColor.setText("");
             
        }
        if(e.getSource() == VistaPrincipal.btnListaProductos)
        {
          this.VistaProductos.jTableProductos.setModel(this.ProductosModelo.ListarProcutos());
          
          this.VistaProductos.setLocationRelativeTo(VistaPrincipal);
          this.VistaProductos.setVisible(true);
        }
        
    }
    
}
