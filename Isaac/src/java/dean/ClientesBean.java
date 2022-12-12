/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dean;

import dao.ClienteDAO;
import java.sql.SQLException;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import models.Cliente;

/**
 *
 * @author personas
 */
@Named(value = "clientesBean")
@RequestScoped
public class ClientesBean {

    /**
     * Creates a new instance of ClientesBean
     */
    
    //ATRIBUTOS
    private List<Cliente> listaClienates;
    private Cliente cliente;
    
    public ClientesBean()
	{
        cliente = new Cliente();
    }
    
    
    //AGREGAMOS LOS METODOS(GETTER AND SETTERS)

    public List<Cliente> getListaClienates() throws SecurityException, SQLException{
        ClienteDAO dao = new ClienteDAO();
        listaClienates = dao.getClientes();
        return listaClienates;
    }

    public void setListaClienates(List<Cliente> listaClienates) {
        this.listaClienates = listaClienates;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
    //MÈTODO PARA BORRAR LOS VALORES DEL BEAN
    public void clearBean(){
        cliente.setIdClientes(0);
        cliente.setNombre("");
        cliente.setApellidos("");
        cliente.setEmail("");
        cliente.setTelefono("");
    }
    
    //MÉTODO PARA INSERTAR UN CLIENTE
    public void insertar() throws SQLException{
        ClienteDAO dao = new ClienteDAO();
        dao.insertarCliente(cliente);
        cliente = new Cliente();
        clearBean();
    }
    
    
    //MÉTODO PARA MODIFICAR EL CLIENTE
    public void modificar() throws SQLException{
        ClienteDAO dao = new ClienteDAO();
        dao.modificarCliente(cliente);
        cliente = new Cliente();
        clearBean();
    }
    
    
    //MÉTODO PARA ELIMINAR UN CLIENTE
    public void eliminar(Cliente c)throws SQLException{
        ClienteDAO dao = new ClienteDAO();
        dao.eliminarCliente(c);
        cliente = new Cliente();
        clearBean();
    }
}
