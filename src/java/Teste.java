
import br.com.haan.dao.ArtistaDAO;
import br.com.haan.dao.HibernateUtil;
import br.com.haan.vo.Artista;

public class Teste {
    public static void main (String [] args){
        int a;
        String nome="João";
        nome.toUpperCase();
        Artista d = new Artista();
        d.setNome("Will Smith");
       // new ArtistaDAO().salvar(d);
        String sql = "Select * from Artista where nome like ?";
        String [] param = {"%il%"};
        
        for (Artista a : new ArtistaDAO().listar(sql, param)){
            System.out.println(a);
        }
    }
}
