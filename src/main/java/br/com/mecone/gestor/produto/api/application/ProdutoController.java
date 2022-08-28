package br.com.mecone.gestor.produto.api.application;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
public class ProdutoController implements ProdutoAPI {

	@Override
	public ProdutoResponse postProduto(@Valid ProdutoRequest produtoRequest) {
		log.info("[start] ProdutoController -  postProduto");
		log.info("[finish] ProdutoController -  postProduto");
		return null;
	}

}
