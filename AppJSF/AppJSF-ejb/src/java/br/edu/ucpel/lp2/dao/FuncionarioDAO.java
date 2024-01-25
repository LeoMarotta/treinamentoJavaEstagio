package br.edu.ucpel.lp2.dao;

import br.edu.ucpel.lp2.jpa.Funcionario;
import br.edu.ucpel.lp2.jpa.Regiao;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class FuncionarioDAO implements FuncionarioDAOLocal {

    @PersistenceContext
    private EntityManager em;

    @Override
    public Funcionario create(Funcionario value) {
        if (this.valida(value)) {
            em.persist(value);
            return value;
        } else {
            return null;
        }
    }

    @Override
    public Funcionario retrieve(Funcionario value) {
        Funcionario valueRet = em.find(Funcionario.class, value.getCodigo());
        return valueRet;
    }

    @Override
    public void update(Funcionario value) {
        if (this.valida(value)) {
            em.merge(value);
        }
    }

    @Override
    public void delete(Funcionario value) {
        value = this.retrieve(value);
        em.remove(value);
    }

    @Override
    public List<Funcionario> listaTodos() {
        return (List<Funcionario>) em.createNamedQuery("Funcionario.findAll").getResultList();
    }

    @Override
    public boolean valida(Funcionario value) {
        boolean ret = false;
        if (value != null) {
            ret = true;
        }
        return ret;
    }

    @Override
    public List<Funcionario> getFuncionariosPorRegiao(Regiao regiao) {
        // Ajuste conforme a estrutura real da sua classe Funcionario
        return em.createQuery("SELECT f FROM Funcionario f WHERE f.regiao = :regiao", Funcionario.class)
                .setParameter("regiao", regiao)
                .getResultList();
    }
}