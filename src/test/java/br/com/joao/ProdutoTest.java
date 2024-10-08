package br.com.joao;



import java.math.BigDecimal;
import org.junit.Test;

import br.com.joao.dao.IProdutoDao;
import br.com.joao.dao.ProdutoDao;
import br.com.joao.domain.Produto;

import static org.junit.Assert.assertNotNull;

public class ProdutoTest {

    private IProdutoDao produtoDao;

    public ProdutoTest() {
        produtoDao = new ProdutoDao();
    }

    @Test
    public void cadastrar() {
        Produto produto = new Produto();
        produto.setCodigo("A1");
        produto.setNome("NoteBook");
        produto.setDescricao("Notebook de última geração");
        produto.setQuantidade(10);
        produto.setValor(new BigDecimal("3000.00"));  // Incluindo o valor

        produto = produtoDao.cadastrar(produto);

        assertNotNull(produto);
        assertNotNull(produto.getId());
    }
}
