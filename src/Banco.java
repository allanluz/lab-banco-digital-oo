import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Banco {

    private String nome;
    private List<Conta> contas;

    // Método para listar todos os clientes
    public void listarClientes() {
        if (contas == null || contas.isEmpty()) {
            System.out.println("Nenhuma conta encontrada.");
            return;
        }
        
        System.out.println("Lista de clientes:");
        for (Conta conta : contas) {
            System.out.println(conta.cliente.getNome());
        }
    }
}
