
import java.util.ArrayList;
import java.util.List;

public class Cadastro {
    
    private static List<Pessoa> listaPessoas = new ArrayList();
    
    public static List<Pessoa> getListaPessoas() {

        return listaPessoas;

    } 
    
    public static void cadastrar(Pessoa pessoa) {

        listaPessoas.add(pessoa);

    }

    public static Pessoa buscar(String id) {

        for (Pessoa pessoa : listaPessoas) {
            
            if (pessoa.getId().equals(id)) {
                
                return pessoa;

            }

        }
        
        return null;

    }

}
