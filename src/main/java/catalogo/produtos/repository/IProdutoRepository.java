package catalogo.produtos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import catalogo.produtos.model.Produto;

public interface IProdutoRepository extends JpaRepository<Produto, Integer>{

}
