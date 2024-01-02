/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

/**
 *
 * @author leomarotta
 */
import java.util.HashMap;
import java.util.Map;

public class Carrinho {
    private Map<String, Double> produtos;

    public Carrinho() {
        produtos = new HashMap<>();
    }

    public void adicionarProduto(String produto, double valor) {
        produtos.put(produto, valor);
    }

    public Map<String, Double> getProdutos() {
        return produtos;
    }
}