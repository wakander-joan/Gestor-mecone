package br.com.mecone.gestor.produto.api.infra;

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

}
