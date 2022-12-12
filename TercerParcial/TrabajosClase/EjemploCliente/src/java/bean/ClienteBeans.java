package bean;

import dao.ClienteDao;
import java.sql.SQLException;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import model.Cliente;

@ManagedBean
@RequestScoped
public class ClienteBeans {

    private List<Cliente> listaClientes;
    private Cliente cliente;
    private int contador;
    
    public ClienteBeans() {
        cliente = new Cliente();
    }
    
    /*Metodos de acceso setter y getter*/
    public List<Cliente> getListaClientes() throws SQLException{
        ClienteDao conexion = new ClienteDao();
        listaClientes = conexion.getClientes();
        return listaClientes;
    }
    
    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }


    /*Metodo Cliente*/
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    /*Metodo para borrar los valores de bean*/
    public void clearBean(){
        cliente.setIdCliente(0);
        cliente.setNombre("");
        cliente.setApellido("");
        cliente.setEmail("");
        cliente.setTelefono("");
    }
    
    /*Insertar datos*/
    public void insertar() throws SQLException{
        ClienteDao conexion = new ClienteDao();
        conexion.insertar(cliente);
        cliente = new Cliente();
        clearBean();
    }
    
    /*Modificar datos*/
    public void modificar() throws SQLException{
        ClienteDao conexion = new ClienteDao();
        conexion.modificar(cliente);
        cliente = new Cliente();
        clearBean();
    }
    
    /*Eliminar dato*/
    public void borrar(Cliente c) throws SQLException{
        ClienteDao conexion = new ClienteDao();
        conexion.eliminar(c);
        cliente = new Cliente();
        clearBean();
    }

    public int getContador() {
        contador = contador + 1;
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
}
