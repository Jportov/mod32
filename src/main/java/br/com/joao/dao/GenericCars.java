package br.com.joao.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.com.joao.domain.Acessorio;
import br.com.joao.domain.Carro;

import java.util.List;

public class GenericCars<T> implements IGenericCar<T> {

    private final EntityManager em;
    private final Class<T> classe;

    public GenericCars(EntityManager em, Class<T> classe) {
        this.em = em;
        this.classe = classe;
    }

    @Override
    public void salvar(T t) {
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            em.persist(t);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        }
    }

    @Override
    public void atualizar(T t) {
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            em.merge(t);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        }
    }

    @Override
    public void remover(T t) {
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            em.remove(em.merge(t));
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        }
    }

    @Override
    public T buscarPorId(Long id) {
        return em.find(classe, id);
    }

    @Override
    public List<T> listarTodos() {
        return em.createQuery("FROM " + classe.getName(), classe).getResultList();
    }

	@Override
	public Carro salvar(Carro carro) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Acessorio salvar(Acessorio acessorio) {
		// TODO Auto-generated method stub
		return null;
	}
}
