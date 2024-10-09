package br.com.joao.dao;

import java.util.List;

import br.com.joao.domain.Acessorio;
import br.com.joao.domain.Carro;
import br.com.joao.domain.Marca;

public interface IGenericCar<T> {
    void salvar(T t);
    void atualizar(T t);
    void remover(T t);
    T buscarPorId(Long id);
    List<T> listarTodos();
	Carro salvar(Carro carro);
	Acessorio salvar(Acessorio acessorio);
	Marca salvar(Marca marca);
}
