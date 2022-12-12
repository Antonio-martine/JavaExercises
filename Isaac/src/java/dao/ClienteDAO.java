/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import models.Cliente;

/**
 *
 * @author personas
 */
public class ClienteDAO {
    
    //ATRIBUTOS
    Connection con;
    Statement stm;
    ResultSet rs;
    
    //CONSTRUCTO VACIO
    public ClienteDAO(){
    }
    
    
    //MÉTODO PARA CONECTARSE A LA BD
    public void conectar() throws SQLException{
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/clientesds02sv22","root","");
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }
    
    //MÉTODO PARA DESCONECTARNOS DE LA BD
    public void desconectar() throws SQLException{
        con.close();
    }
    
    //MÉTODO PARA OBTENER EL LISTADO DE REGUISTROS
    
    public List<Cliente> getClientes() throws SQLException{
     //NOS CONECTAMOS A LA BD
     conectar();
     //INICIALIZAMOS EL STATEMENT
     stm = con.createStatement();
     
     //HACEMOS LA CONSULTA Y GUARDAMOS LOS DATOS EN LA RS
     
     rs =stm.executeQuery("select * from clientes order by idClientes");
     
     //DECLARAMOS LA VARIABLE DE RETORNO
     List<Cliente> listaClientes = new ArrayList<Cliente>();
     
     //RECOREMOS EL RS Y AGREGAMOS CADA REGUISTRO A LA LISTA
     while(rs.next()){
         Cliente c = new Cliente();
         c.setIdClientes(rs.getInt("idCliente"));
         c.setNombre(rs.getString("nombre"));
         c.setApellidos(rs.getString("apellidos"));
         c.setEmail(rs.getString("email"));
         c.setTelefono(rs.getString("telefono"));
         
         listaClientes.add(c);
     }
        desconectar();
        return listaClientes;
    }
    
    
    //MÉTODO PARA INSERTAR NUEVO CLIENTE
    public void insertarCliente(Cliente c)throws SQLException{
        conectar();
        stm = con.createStatement();
        
        //VARIABLE DE RESPUESTA
        int respuesta = 0;
        
        //HACEMOS LA INSERCION DEL REGUISTRO
        respuesta = stm.executeUpdate("insert into Clientes " + "values("+null+",'"+c.getNombre()+"','"+c.getApellidos()+"','"+c.getEmail()+"','"+c.getTelefono()+"')");
    desconectar();
    }
    
    //MÉTODO PARA MODIFICAR UN CLIENTE EXISTENTE
    public  void modificarCliente(Cliente c) throws SQLException{
    conectar();
    stm = con.createStatement();
    
    //VARIABLE DE RESPUESTA
    int respuesta = 0;
    
    //HACEMOS EL UPDATE
    respuesta = stm.executeUpdate("update Clientes " + "set nombre = '"+c.getNombre()+"',"
                                                     + "apellidos = '"+c.getApellidos()+"',"
                                                     + "email ='"+c.getEmail()+"',"
                                                     + "telefono ='"+c.getTelefono()+"'"
                                                     + "where (idClientes = "+c.getIdClientes()+")");
    desconectar();
            }
    
    //MÉTODO PARA ELIMINAR UN CLIENTE
    
    public void eliminarCliente(Cliente c)throws SQLException{
    conectar();
    stm = con.createStatement();
    
    //VARIABLE DE RESPUESTA
    
    int respuesta = 0;
    
    //HACEMOS EL DELETE
    respuesta = stm.executeUpdate("delete from clientes "+"where (idClientes = "+c.getIdClientes()+")");
    
    desconectar();
    }
    
    
}
