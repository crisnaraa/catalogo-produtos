package catalogo.produtos.service;

import java.util.List;

import catalogo.produtos.model.Produto;

public interface IProdutoService {

	public Produto adicionar(Produto produto);
	public List<Produto> adicionarEmLote(List<Produto> produtos);
	public Produto consultar(Integer id);
}
