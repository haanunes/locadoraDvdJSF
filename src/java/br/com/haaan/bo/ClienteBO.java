package br.com.haaan.bo;

import br.com.haan.dao.ClienteDAO;
import br.com.haan.vo.Cliente;
import java.util.List;

public class ClienteBO {
    public static List<Cliente> listarClientesOk (){
        List<Cliente> lista;
        ClienteDAO dao = new ClienteDAO();
        String sql = "Select * from cliente where status = 'ok'";
        String valor [] = {};
        lista = dao.listar(sql, valor);
        return lista;
    }
}
