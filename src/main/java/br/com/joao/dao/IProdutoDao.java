package br.com.joao.dao;

import java.util.List;

import br.com.joao.domain.Produto;

public interface IProdutoDao {
	
	public Produto cadastrar(Produto produto);
	
	public void excluir(Produto prod);
	
	public List<Produto> buscarTodos();
	
	
}
