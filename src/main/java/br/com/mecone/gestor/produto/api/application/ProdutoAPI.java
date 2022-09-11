package br.com.mecone.gestor.produto.api.application;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
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
	
	@PostMapping (value = "/{idEmpresa}/post-produto")
	@ResponseStatus (code = HttpStatus.CREATED)
	ProdutoResponse postProduto (@PathVariable UUID idEmpresa ,@Valid @RequestBody ProdutoRequest produtoRequest);
	
	@GetMapping (value = "/findBy-produtos/{idEmpresa}")
	@ResponseStatus (code = HttpStatus.OK)
	List <ProdutoListResponse> getProdutosEmpresa(@Valid @PathVariable UUID idEmpresa);
	
	@GetMapping (value = "/findBy-idProduto/{idProduto}")
	@ResponseStatus (code = HttpStatus.OK)
	ProdutoDetalhadoResponse buscaProdutoIdProduto(@PathVariable UUID idProduto);
	
	@DeleteMapping (value = "/{idProduto}")
	@ResponseStatus (code = HttpStatus.NO_CONTENT)
	void deletaProduto(@PathVariable UUID idProduto);
	
}
