package br.com.mecone.gestor.produto.api.application;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RestController;

import br.com.mecone.gestor.produto.api.service.ProdutoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class ProdutoController implements ProdutoAPI {
	private final ProdutoService produtoService;

	@Override
	public ProdutoResponse postProduto(@Valid ProdutoRequest produtoRequest) {
		log.info("[start] ProdutoController -  postProduto");
		ProdutoResponse produtoResponse = produtoService.postProduto(produtoRequest);
		log.info("[finish] ProdutoController -  postProduto");
		return produtoResponse;
	}

}
