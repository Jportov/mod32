package br.com.joao;

import br.com.joao.dao.MarcaDAO;
import br.com.joao.domain.Marca;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class MarcaTest {

    private MarcaDAO marcaDao;

    public MarcaTest() {
        marcaDao = new MarcaDAO();
    }

    @Test
    public void salvar() {
        // Criando uma marca
        Marca marca = new Marca();
        marca.setNome("Honda");

        // Usando o método salvar ao invés de cadastrar
        marca = marcaDao.salvar(marca);

        // Verificando se a marca foi criada corretamente
        assertNotNull(marca);
        assertNotNull(marca.getId());
    }
}
