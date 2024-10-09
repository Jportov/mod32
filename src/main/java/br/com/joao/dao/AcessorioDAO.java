package br.com.joao.dao;

import br.com.joao.domain.Acessorio;
import br.com.joao.domain.Carro;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AcessorioDAO implements IGenericCar{

    private EntityManagerFactory emf;
    private EntityManager em;

    public AcessorioDAO() {
        emf = Persistence.createEntityManagerFactory("ExemploJPA"); // Nome da persistence-unit no persistence.xml
        em = emf.createEntityManager();
    }

    @Override
    public Acessorio salvar(Acessorio acessorio) {
        try {
            em.getTransaction().begin();
            em.persist(acessorio);  // Persistindo o objeto
            em.getTransaction().commit();
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            e.printStackTrace();
        } finally {
            em.close();
        }
        return acessorio;
    }

	@Override
	public void salvar(Object t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizar(Object t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remover(Object t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object buscarPorId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List listarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Carro salvar(Carro carro) {
		// TODO Auto-generated method stub
		return null;
	}
}
