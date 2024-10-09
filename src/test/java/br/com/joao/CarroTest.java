package br.com.joao;

import br.com.joao.dao.CarroDAO;
import br.com.joao.dao.MarcaDAO;
import br.com.joao.dao.AcessorioDAO;
import br.com.joao.domain.Carro;
import br.com.joao.domain.Marca;
import br.com.joao.domain.Acessorio;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

public class CarroTest {

    private CarroDAO carroDao;
    private MarcaDAO marcaDao;
    private AcessorioDAO acessorioDao;

    public CarroTest() {
        carroDao = new CarroDAO();
        marcaDao = new MarcaDAO();
        acessorioDao = new AcessorioDAO();
    }

    @Test
    public void salvar() {
        // Criando uma marca
        Marca marca = new Marca();
        marca.setNome("Toyota");
        marca = marcaDao.salvar(marca);

        // Criando acessórios
        Acessorio acessorio1 = new Acessorio();
        acessorio1.setNome("Ar-condicionado");
        acessorio1 = acessorioDao.salvar(acessorio1);}}

       
