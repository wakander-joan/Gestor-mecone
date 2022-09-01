package br.com.mecone.gestor.produto.api.application;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@GetMapping 
	@ResponseStatus (code = HttpStatus.OK)
	List <ProdutoListResponse> getTodosProdutos();
	
	@GetMapping (value = "/findByCode/{codigo}")
	@ResponseStatus (code = HttpStatus.OK)
	ProdutoDetalhadoResponse buscaProdutoPorCodigo (@PathVariable int codigo);
	
}
