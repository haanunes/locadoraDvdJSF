
package br.com.haan.bean;

import br.com.haan.dao.ClienteDAO;
import br.com.haan.vo.Cliente;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class ClienteBean implements Serializable{
    private Cliente cliente;
    private List<Cliente> lista;
    private List<Cliente> listaFiltrada;
    public ClienteBean(){
        cliente = new Cliente();
        lista= new ClienteDAO().listarTudo();
        listaFiltrada = new ArrayList<Cliente>();
    }

    public List<Cliente> getLista() {
        return lista;
    }

    public void setLista(List<Cliente> lista) {
        this.lista = lista;
    }

    public List<Cliente> getListaFiltrada() {
        return listaFiltrada;
    }

    public void setListaFiltrada(List<Cliente> listaFiltrada) {
        this.listaFiltrada = listaFiltrada;
    }
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public String salvar(){
        new ClienteDAO().salvar(this.cliente);
        return "index.xhtml";
    }
   
    public List<Cliente> listar(){
       return new ClienteDAO().listarTudo();
        // como seria a consulta para vir ordenado???
        // String sql= " select * from Cliente order by nome asc;"
        // String´[] param = {};
        // return new ClienteDAO().listar(sql,param);
    }
}
