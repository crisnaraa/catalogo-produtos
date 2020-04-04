package catalogo.produtos.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import catalogo.produtos.model.Produto;
import catalogo.produtos.repository.IProdutoRepository;
import catalogo.produtos.service.IProdutoService;

public class ProdutoServiceImplements implements IProdutoService{
	
	@Autowired
	private IProdutoRepository produtoRepository;

	@Override
	public Produto adicionar(Produto produto) {
		
		produtoRepository.saveAndFlush(produto);
		return null;
	}

	@Override
	public List<Produto> adicionarEmLote(List<Produto> produtos) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Produto consultar(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
