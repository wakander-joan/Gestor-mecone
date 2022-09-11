package br.com.mecone.gestor.produto.api.service;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import br.com.mecone.gestor.empresa.api.application.EmpresaDetalhadaResponse;
import br.com.mecone.gestor.empresa.api.service.EmpresaApplicationService;
import br.com.mecone.gestor.produto.api.application.ProdutoDetalhadoResponse;
import br.com.mecone.gestor.produto.api.application.ProdutoListResponse;
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
	private final EmpresaApplicationService empresaApplicationService;

	@Override
	public ProdutoResponse postProduto(UUID idEmpresa, @Valid ProdutoRequest produtoRequest) {
		log.info("[start] ProdutoApplicationService -  postProduto");
		Produto produtoCriado = produtoRepository.salva(new Produto(idEmpresa, produtoRequest));
		log.info("[finish] ProdutoApplicationService -  postProduto");
		return ProdutoResponse.builder().idProduto(produtoCriado.getIdProduto()).descricao(produtoCriado.getDescricao())
				.codigo(produtoCriado.getCodigo()).idEmpresaPertencente(produtoCriado.getIdEmpresaPertencente()).build();
	}

	@Override
	public List<ProdutoListResponse> getTodosProdutos(UUID idEmpresa) {
		log.info("[inicia] ProdutoApplicationService - buscarTarefasPorIdUsuario");
		EmpresaDetalhadaResponse empresa = empresaApplicationService.getEmpresa(idEmpresa);
		List<Produto> produtos = produtoRepository.getTodosProdutos(empresa.getIdEmpresa());
		log.info("[finaliza] ProdutoApplicationService - buscarTarefasPorIdUsuario");
		return ProdutoListResponse.convert(produtos);
	}

	@Override
	public ProdutoDetalhadoResponse buscaProdutoPorCodigo(int codigo) {
		log.info("[start] ProdutoApplicationService -  buscaProdutoPorCodigo");
		Produto produto = produtoRepository.buscaProdutoPorCodigo(codigo);
		log.info("[finish] ProdutoApplicationService -  buscaProdutoPorCodigo");
		return new ProdutoDetalhadoResponse(produto);
	}

	@Override
	public void deletaProduto(UUID idProduto) {
		log.info("[start] ProdutoApplicationService -  deletaProduto");
		log.info("[finish] ProdutoApplicationService -  deletaProduto");
	}
}
