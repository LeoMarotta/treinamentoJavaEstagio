/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroserializado;

import java.util.List;

/**
 *
 * @author leomarotta
 */
public class PessoaDAO {
    private static final String FILE_PATH = "/home/leomarotta/Documentos/BDfake.txt";

    public static List<Pessoa> listarPessoas() {
        return Pessoa.deserializar();
    }

    public static void salvarPessoa(Pessoa pessoa) {
        List<Pessoa> pessoas = listarPessoas();
        pessoas.add(pessoa);
        Pessoa.serializar(pessoas);
    }
}