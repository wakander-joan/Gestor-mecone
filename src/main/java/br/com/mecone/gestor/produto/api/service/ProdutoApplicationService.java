package br.com.mecone.gestor.produto.api.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import br.com.mecone.gestor.produto.api.application.ProdutoRequest;
import br.com.mecone.gestor.produto.api.application.ProdutoResponse;
import br.com.mecone.gestor.produto.api.repository.ProdutoRepository;
import br.com.mecone.gestor.produto.domain.Produto;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class ProdutoApplicationService implements ProdutoService {
	private final ProdutoRepository produtoRepository;

	@Override
	public ProdutoResponse postProduto(@Valid ProdutoRequest produtoRequest) {
		log.info("[start] ProdutoApplicationService -  postProduto");
		Produto produtoCriado = produtoRepository.salva(new Produto(produtoRequest));
		log.info("[finish] ProdutoApplicationService -  postProduto");
		return ProdutoResponse.builder().idProduto(produtoCriado.getIdProduto())
										.descricao(produtoCriado.getDescricao())
										.codigo(produtoCriado.getCodigo()).build();
	}

	@Override
	public List<ProdutoResponse> getTodosProdutos() {
		log.info("[start] ProdutoApplicationService -  getTodosProdutos");
		log.info("[finish] ProdutoApplicationService -  getTodosProdutos");
		return null;
	}

}
