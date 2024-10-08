package br.com.farmacia.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.Ignore;
import org.junit.Test;

import br.com.farmacia.DAO.FornecedoresDAO;
import br.com.farmacia.DAO.ProdutosDAO;
import br.com.farmacia.domain.Fornecedores;
import br.com.farmacia.domain.Produtos;
import br.com.farmacia.factory.ConexaoFactory;

public class ProdutosDAOTeste {
	@Test
	@Ignore
	public void salvar()throws SQLException{
	 Produtos p1 = new Produtos();
		p1.setDescricao("ASPIRINA");
		p1.setPreco(4.99);
		p1.setQuantidade(12L);
		
		Fornecedores f = new Fornecedores();
		f.setCodigo(13);
		p1.setFornecedores(f);

		ProdutosDAO fdao = new ProdutosDAO();
		
		fdao.salvar(p1);
	}
	
	@Test
	@Ignore
	public void listar()throws SQLException{
	
		ProdutosDAO fdao = new ProdutosDAO();
		ArrayList<Produtos> lista = fdao.listar();
		
		for (Produtos p : lista){
			System.out.println("Código do Produto: " + p.getCodigo());
			System.out.println("Descrição do Produto: " + p.getDescricao());
			System.out.println("Valor do Produto: " + p.getPreco());
			System.out.println("Quantidade: " + p.getQuantidade());
			System.out.println("Código do Fornecedor: " + p.getFornecedores().getCodigo());
			System.out.println("Descrição do Fornecedor: " + p.getFornecedores().getDescricao());
			System.out.println("");
		}
	}
	
	@Test
	@Ignore
	public void excluir()throws SQLException{
		Produtos p = new Produtos();
		p.setCodigo(3L);
		
		ProdutosDAO dao = new ProdutosDAO();
		dao.excluir(p);
	}

	@Test
	public void editar()throws SQLException{
		Produtos p = new Produtos();
		p.setCodigo(5L);
		p.setDescricao("Cataflan");
		p.setPreco(15.75);
		p.setQuantidade(2L);
		
		Fornecedores f = new Fornecedores();
		f.setCodigo(10);
		p.setFornecedores(f);

		ProdutosDAO dao = new ProdutosDAO();
		dao.editar(p);
	}
}

