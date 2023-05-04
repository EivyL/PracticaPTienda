
import Controlador.ProductosController;
import Modelos.ModeloProductos;
import Vistas.frmPrincipal;
import Vistas.frmProductos;


public class main {

    public static void main(String[] args) {
        frmPrincipal VistaPrincipal = new frmPrincipal();
        frmProductos VistaProductos = new frmProductos(null, true);
        ModeloProductos ProductosModelo = new ModeloProductos();
        ProductosController ControlProductos = new ProductosController(VistaPrincipal, 
        VistaProductos, ProductosModelo);

    }
    
}
