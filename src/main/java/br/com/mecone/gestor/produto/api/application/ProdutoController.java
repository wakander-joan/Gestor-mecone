package br.com.mecone.gestor.produto.api.application;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RestController;

import br.com.mecone.gestor.produto.api.service.ProdutoService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@AllArgsConstructor
public class ProdutoController implements ProdutoAPI {
	private final ProdutoService produtoService;
	
	@Override
		public ProdutoDetalhadoResponse buscaProdutoPorCodigo(int codigo) {
			log.info("[start] ProdutoController -  buscaProdutoPorCodigo");
			ProdutoDetalhadoResponse produto = produtoService.buscaProdutoPorCodigo(codigo);
			log.info("[finish] ProdutoController -  buscaProdutoPorCodigo");
			return produto;
		}
	@Override
	public ProdutoResponse postProduto(UUID idEmpresa, @Valid ProdutoRequest produtoRequest) {
		log.info("[start] ProdutoController -  postProduto");
		ProdutoResponse produtoResponse = produtoService.postProduto(idEmpresa,produtoRequest);
		log.info("[finish] ProdutoController -  postProduto");
		return produtoResponse;
	}

	@Override
	public List<ProdutoListResponse> getProdutosEmpresa(UUID idEmpresa) {
		log.info("[start] ProdutoController -  getTodosProdutos");
		List<ProdutoListResponse> produtos = produtoService.getTodosProdutos(idEmpresa);
		log.info("[finish] ProdutoController -  getTodosProdutos");
		return produtos;
	}
}
