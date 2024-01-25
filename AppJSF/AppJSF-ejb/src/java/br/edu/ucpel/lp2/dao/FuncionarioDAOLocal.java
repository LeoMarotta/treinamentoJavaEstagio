package br.edu.ucpel.lp2.dao;

import br.edu.ucpel.lp2.jpa.Funcionario;
import br.edu.ucpel.lp2.jpa.Regiao; // Importe a classe Regiao
import java.util.List;
import javax.ejb.Local;

@Local
public interface FuncionarioDAOLocal {

    Funcionario create(Funcionario value);

    Funcionario retrieve(Funcionario value);

    void update(Funcionario value);

    void delete(Funcionario value);

    List<Funcionario> listaTodos();

    boolean valida(Funcionario value);

    List<Funcionario> getFuncionariosPorRegiao(Regiao regiao);
}
