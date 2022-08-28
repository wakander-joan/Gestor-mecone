package br.com.mecone.gestor.produto.api.application;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/v1/produto")
public interface ProdutoAPI {
	
	@PostMapping
	@ResponseStatus (code = HttpStatus.CREATED)
	ProdutoResponse postProduto ( @RequestBody ProdutoRequest produtoRequest);
}
