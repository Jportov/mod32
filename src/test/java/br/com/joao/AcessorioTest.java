package br.com.joao;

import br.com.joao.dao.AcessorioDAO;
import br.com.joao.domain.Acessorio;
import org.junit.Test;
import static org.junit.Assert.assertNotNull;

public class AcessorioTest {

    private AcessorioDAO acessorioDao;

    public AcessorioTest() {
        acessorioDao = new AcessorioDAO();
    }

    @Test
    public void salvar() {
        // Criando um acessório
        Acessorio acessorio = new Acessorio();
        acessorio.setNome("Vidro Elétrico");

        // Usando o método salvar
        acessorio = acessorioDao.salvar(acessorio);

        // Verificando se o acessório foi criado corretamente
        assertNotNull(acessorio);
        assertNotNull(acessorio.getId());
    }
}
