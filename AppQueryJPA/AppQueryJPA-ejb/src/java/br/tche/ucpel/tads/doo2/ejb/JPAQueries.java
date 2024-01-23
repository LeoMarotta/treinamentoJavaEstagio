package br.tche.ucpel.tads.doo2.ejb;

import br.tche.ucpel.tads.doo2.persisty.Departamento;
import br.tche.ucpel.tads.doo2.persisty.Funcionario;
import br.tche.ucpel.tads.doo2.persisty.Disciplina;
import br.tche.ucpel.tads.doo2.persisty.Pessoa;
import br.tche.ucpel.tads.doo2.persisty.Aluno;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author mertins
 */
@Stateless
public class JPAQueries implements JPAQueriesRemote {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void popula() {
        try {
            
            Departamento dept = new Departamento();
            dept.setDescricao("RH");
            em.persist(dept);
            
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Funcionario func = new Funcionario();
            func.setDepartamento(dept);
            func.setDtContratacao(new Date());
            func.setDtNascimento(sdf.parse("23/09/1970"));
            func.setNome("João");
            func.setSalario(1000.0);
            func.setCpf("12142");
            em.persist(func);
            
            func = new Funcionario();
            func.setDepartamento(dept);
            func.setDtContratacao(new Date());
            func.setDtNascimento(sdf.parse("23/09/1982"));
            func.setNome("Maria");
            func.setSalario(3000.0);
            func.setCpf("45445");
            em.persist(func);

            //Inserts chatgpt
            Departamento deptTI = new Departamento();
            deptTI.setDescricao("TI");
            em.persist(deptTI);

            Departamento deptVendas = new Departamento();
            deptVendas.setDescricao("Vendas");
            em.persist(deptVendas);

            Funcionario func2 = new Funcionario();
            func2.setDepartamento(deptTI);
            func2.setDtContratacao(new Date());
            func2.setDtNascimento(sdf.parse("15/03/1990"));
            func2.setNome("Ana");
            func2.setSalario(2500.0);
            func2.setCpf("78901");
            em.persist(func2);

            Funcionario func3 = new Funcionario();
            func3.setDepartamento(deptVendas);
            func3.setDtContratacao(new Date());
            func3.setDtNascimento(sdf.parse("10/08/1985"));
            func3.setNome("Carlos");
            func3.setSalario(2000.0);
            func3.setCpf("45678");
            em.persist(func3);

            Disciplina disciplina2 = new Disciplina();
            disciplina2.setDescricao("Estatística");
            disciplina2.setCargaHoraria(60);
            em.persist(disciplina2);

            Disciplina disciplina3 = new Disciplina();
            disciplina3.setDescricao("Arquitetura de Software");
            disciplina3.setCargaHoraria(80);
            em.persist(disciplina3);

            Aluno aluno2 = new Aluno();
            aluno2.setNome("Laura");
            aluno2.setDtNascimento(sdf.parse("05/12/1995"));
            aluno2.setCpf("12345");
            aluno2.setSexo(Pessoa.Sexo.FEMININO);
            em.persist(aluno2);

            aluno2.addDisciplina(disciplina2);
            aluno2.addDisciplina(disciplina3);

            em.persist(aluno2);

        } catch (ParseException ex) {
            Logger.getLogger(JPAQueries.class.getName()).log(Level.SEVERE, "Provavelmente Data Inválida", ex);
        }

    }

    @Override
    public List<Departamento> findDepartamentos() {
        Query query = em.createNamedQuery("departamento.findAll");
        return query.getResultList();
    }

    @Override
    public List<Pessoa> findPessoasPorNome(String partenome) {
        Query query = em.createNamedQuery("pessoa.findPartNome");
        query.setParameter("partNome", partenome.toUpperCase());
        query.setMaxResults(20);
        return query.getResultList();
    }

    @Override
    public Pessoa findPessoaCPF(String cpf) {
        Query query = em.createQuery("select o from Pessoa o where o.cpf=:cpfParam");
        query.setParameter("cpfParam", cpf);
        Pessoa pessoa = null;
        try {
            pessoa = (Pessoa) query.getSingleResult();
        } catch (NoResultException ex) {
        }
        return pessoa;
    }

    @Override
    public List<Pessoa> findPessoasPorNomeDepartamento(String nomeDept) {
        Query query = em.createQuery("select o from Funcionario o join o.departamento d where d.descricao=:nomeDept");
        query.setParameter("nomeDept", nomeDept);
        return query.getResultList();
    }

    @Override
    public int aumentoSalario(Integer porcentagem) {
        Query query = em.createQuery("update Funcionario o set o.salario =  o.salario * :porcent/100 + o.salario");
        query.setParameter("porcent", porcentagem);
        return query.executeUpdate();
    }
}
