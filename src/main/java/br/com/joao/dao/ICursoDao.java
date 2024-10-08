package br.com.joao.dao;


import java.util.List;

import br.com.joao.domain.Curso;

/**
 * @author rodrigo.pires
 *
 */
public interface ICursoDao {

	public Curso cadastrar(Curso curso);

	public void excluir(Curso cur);

	public List<Curso> buscarTodos();
}