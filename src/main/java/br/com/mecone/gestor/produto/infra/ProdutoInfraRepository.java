package br.com.mecone.gestor.produto.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import br.com.mecone.gestor.handler.APIException;
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
		try {
			produtoSpringDataJPARepository.save(produto);
		} catch (DataIntegrityViolationException e) {
			throw APIException.build(HttpStatus.BAD_REQUEST, "Produto já cadastrada", e);
		}
		log.info("[finish] ProdutoInfraRepository -  salva");
		return produto;
	}

	@Override
	public Produto buscaProdutoIdProduto(UUID idProduto){
		log.info("[start] ProdutoInfraRepository -  buscaProdutoPorCodigo");
		Produto produto = produtoSpringDataJPARepository.findById(idProduto)
				.orElseThrow(()-> APIException.build(HttpStatus.BAD_REQUEST, "Produto não encontrada!"));
		log.info("[finish] ProdutoInfraRepository -  buscaProdutoPorCodigo");
		return produto;
	}

	@Override
	public List<Produto> getTodosProdutos(UUID idEmpresa) {
		log.info("[start] ProdutoInfraRepository -  getTodosProdutos");
		var produtos = produtoSpringDataJPARepository.findAllByIdEmpresaPertencente(idEmpresa);
		log.info("[finish] ProdutoInfraRepository -  getTodosProdutos");
		return produtos;
	}

	@Override
	public void deletaProduto(UUID idProduto) {
		log.info("[start] ProdutoInfraRepository -  deletaProduto");
		produtoSpringDataJPARepository.deleteById(idProduto);
		log.info("[finish] ProdutoInfraRepository -  deletaProduto");
	}
}
