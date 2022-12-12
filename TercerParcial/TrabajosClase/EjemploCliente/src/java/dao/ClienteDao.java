
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Cliente;

public class ClienteDao {
    Connection con;
    Statement stm;
    ResultSet rs;
    
    public void conectar(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Cliente", "root", "root");
            stm = con.createStatement();
        } catch (ClassNotFoundException ex) {
            System.out.println("Error en el drive: "+ex );
        } catch (SQLException ex){
            System.out.println("Error en los parametros de la BD: "+ex);
        }
    }
    
    public void desconectar(){
        try {
            con.close();
        } catch (SQLException ex) {
            System.out.println("Error al desconectar la BD: "+ex);
        }
    }
    
    public void insertar(Cliente c){
        conectar();
        String sql ="insert into usuario (nombre,apellido,email,telefono) values ('"+c.getNombre()+"','"+c.getApellido()+"','"+c.getEmail()+"','"
                +c.getTelefono()+"')";
        try {
            stm.executeUpdate(sql);
            System.out.println("Dato insertado correctamente");
        } catch (SQLException ex) {
            System.out.println("Error al insertar el dato: "+ex);
        }
        desconectar();
    }
    
    /*Obtener registro de los ussuarios*/
    public List<Cliente> getClientes() throws SQLException{
        conectar();
        String sql = "select * from usuario order by idCliente";
        rs = stm.executeQuery(sql);
        List<Cliente> listaClientes = new ArrayList<Cliente>();
        while(rs.next()){
            Cliente c = new Cliente(); 
            c.setIdCliente(rs.getInt("idCliente"));
            c.setNombre(rs.getString("nombre"));
            c.setApellido(rs.getString("apellido"));
            c.setEmail(rs.getString("email"));
            c.setTelefono(rs.getString("telefono"));
            listaClientes.add(c);
        }
        desconectar();
        return listaClientes;
    }
    
    public void modificar(Cliente c){
    conectar();
    String sql ="update usuario set nombre='"+c.getNombre()+"',apellido='"+c.getApellido()+"',"
            + "email='"+c.getEmail()+"',telefono='"+c.getTelefono()+"' where (idCliente ='"+c.getIdCliente()+"')";
    try {
        stm.executeUpdate(sql);
        System.out.println("Dato modificado correctamente");
    } catch (SQLException ex) {
        System.out.println("Error al modificar el dato: "+ex);
    }
    desconectar();
    }
    
    public void eliminar(Cliente c){
    conectar();
    String sql ="delete from usuario where idCliente="+c.getIdCliente();
    try {
        stm.executeUpdate(sql);
        System.out.println("Dato eliminado correctamente");
    } catch (SQLException ex) {
        System.out.println("Error al eliminar el dato: "+ex);
    }
    desconectar();
    }
}
