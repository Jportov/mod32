package br.com.joao.dao;

import br.com.joao.domain.Acessorio;
import br.com.joao.domain.Carro;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CarroDAO implements IGenericCar {

    private EntityManagerFactory emf;
    private EntityManager em;

    public CarroDAO() {
        emf = Persistence.createEntityManagerFactory("ExemploJPA");  // Nome da persistence-unit
        em = emf.createEntityManager();
    }

    @Override
    public Carro salvar(Carro carro) {
        try {
            em.getTransaction().begin();
            em.persist(carro);  // Persistindo o objeto
            em.getTransaction().commit();
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            e.printStackTrace();
        } finally {
            em.close();
        }
        return carro;
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
	public Acessorio salvar(Acessorio acessorio) {
		// TODO Auto-generated method stub
		return null;
	}
}
