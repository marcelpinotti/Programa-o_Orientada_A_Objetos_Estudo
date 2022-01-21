import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.List;

@AllArgsConstructor
@Data
public class Banco {

    private String nome;

    private List<Conta> contas;

}
