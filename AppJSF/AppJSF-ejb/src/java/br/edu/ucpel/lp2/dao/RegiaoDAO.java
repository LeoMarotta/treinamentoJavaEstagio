package br.edu.ucpel.lp2.dao;

import br.edu.ucpel.lp2.jpa.Regiao;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class RegiaoDAO implements RegiaoDAOLocal {

    @PersistenceContext
    private EntityManager em;

    @Override
    public Regiao create(Regiao value) {
        if (this.valida(value)) {
            em.persist(value);
            return value;
        } else {
            return null;
        }
    }

    @Override
    public Regiao retrieve(Regiao value) {
        Regiao valueRet = em.find(Regiao.class, value.getCodigo());
        return valueRet;
    }

    @Override
    public void update(Regiao value) {
        if (this.valida(value)) {
            em.merge(value);
        }
    }

    @Override
    public void delete(Regiao value) {
        value = this.retrieve(value);
        em.remove(value);
    }

    @Override
    public List<Regiao> listaTodos() {
        return (List<Regiao>) em.createNamedQuery("Regiao.findAll").getResultList();
    }

    @Override
    public boolean valida(Regiao value) {
        boolean ret = false;
        if (value != null) {
            ret = true;
        }
        return ret;
    }
}
