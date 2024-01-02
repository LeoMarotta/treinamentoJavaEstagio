package controle;

/**
 *
 * @author leomarotta
 */
import java.util.HashMap;
import java.util.Map;

public class Carrinho {
    private Map<String, Map<String, Object>> produtos;

    public Carrinho() {
        produtos = new HashMap<>();
    }

    public void adicionarProduto(String produto, double valor) {
        if (produtos.containsKey(produto)) {
            Map<String, Object> item = produtos.get(produto);
            int quantidade = (int) item.get("quantidade");
            item.put("quantidade", quantidade + 1);
        } else {
            Map<String, Object> item = new HashMap<>();
            item.put("quantidade", 1);
            item.put("valorUnitario", valor);
            produtos.put(produto, item);
        }
    }

    public Map<String, Map<String, Object>> getProdutos() {
        return produtos;
    }

    public double getTotal() {
        double total = 0.0;
        for (Map<String, Object> item : produtos.values()) {
            int quantidade = (int) item.get("quantidade");
            double valorUnitario = (double) item.get("valorUnitario");
            total += quantidade * valorUnitario;
        }
        return total;
    }
}
