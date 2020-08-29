package BD;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class CargarComboBox {

    Conexion c = new Conexion();

    public void consultar_puestos(JComboBox myCbox){

        //Creamos objeto tipo Connection    
        java.sql.Connection conectar = null;    
        PreparedStatement pst = null;
        ResultSet result = null;

        //Creamos la Consulta SQL
        String SSQL = "SELECT id, puesto FROM tb_puestos order by puesto ASC";

        //Establecemos bloque try-catch-finally
        try {
           //Establecemos conexión con la BD 
           conectar = c.getConexion();
           //Preparamos la consulta SQL
           pst = conectar.prepareStatement(SSQL);
           //Ejecutamos la consulta
           result = pst.executeQuery();

           //LLenamos nuestro ComboBox
           myCbox.addItem("Seleccione");

           while(result.next()){
               myCbox.addItem(result.getString("puesto"));
           }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }finally{
            if(conectar!=null){
                try {
                    conectar.close();
                    result.close();

                    conectar=null;
                    result=null;
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex);
                }
            }
        }
    } // fin consultar_puestos
    
    
    public void consultar_grupos(JComboBox myCbox){

        //Creamos objeto tipo Connection    
        java.sql.Connection conectar = null;    
        PreparedStatement pst = null;
        ResultSet result = null;

        //Creamos la Consulta SQL
        String SSQL = "SELECT id, grupo FROM tb_grupos order by grupo ASC";

        //Establecemos bloque try-catch-finally
        try {
           //Establecemos conexión con la BD 
           conectar = c.getConexion();
           //Preparamos la consulta SQL
           pst = conectar.prepareStatement(SSQL);
           //Ejecutamos la consulta
           result = pst.executeQuery();

           //LLenamos nuestro ComboBox
           myCbox.addItem("Seleccione");

           while(result.next()){
               myCbox.addItem(result.getString("grupo"));
           }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }finally{
            if(conectar!=null){
                try {
                    conectar.close();
                    result.close();

                    conectar=null;
                    result=null;
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex);
                }
            }
        }
    } // fin consultar_grupos
    
    public void consultar_status(JComboBox myCbox){

        //Creamos objeto tipo Connection    
        java.sql.Connection conectar = null;    
        PreparedStatement pst = null;
        ResultSet result = null;

        //Creamos la Consulta SQL
        String SSQL = "SELECT id, status FROM tb_estatus order by status ASC";

        //Establecemos bloque try-catch-finally
        try {
           //Establecemos conexión con la BD 
           conectar = c.getConexion();
           //Preparamos la consulta SQL
           pst = conectar.prepareStatement(SSQL);
           //Ejecutamos la consulta
           result = pst.executeQuery();

           while(result.next()){
               myCbox.addItem(result.getString("status"));
           }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }finally{
            if(conectar!=null){
                try {
                    conectar.close();
                    result.close();

                    conectar=null;
                    result=null;
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex);
                }
            }
        }
    } // fin consultar_puestos

}
