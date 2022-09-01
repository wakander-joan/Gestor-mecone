package br.com.mecone.gestor.produto.api.infra;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.mecone.gestor.produto.api.repository.ProdutoRepository;
import br.com.mecone.gestor.produto.domain.Produto;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@RequiredArgsConstructor
@Log4j2
public class ProdutoInfraRepository implements ProdutoRepository {
	private final ProdutoSpringDataJPARepository produtoSpringDataJPARepository;

	@Override
	public Produto salva(Produto produto) {
		log.info("[start] ProdutoInfraRepository -  salva");
		produtoSpringDataJPARepository.save(produto);
		log.info("[finish] ProdutoInfraRepository -  salva");
		return produto;
	}

	@Override
	public List<Produto> getTodosProdutos() {
		log.info("[start] ProdutoInfraRepository -  getTodosProdutos");
		List<Produto> produtos = produtoSpringDataJPARepository.findAll();
		log.info("[finish] ProdutoInfraRepository -  getTodosProdutos");
		return produtos;
	}

	@Override
	public Produto buscaProdutoPorCodigo(int codigo) {
		log.info("[start] ProdutoInfraRepository -  buscaProdutoPorCodigo");
		Produto produto = produtoSpringDataJPARepository.findByCodigo(codigo);
		log.info("[finish] ProdutoInfraRepository -  buscaProdutoPorCodigo");
		return produto;
	}

}
