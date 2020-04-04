package catalogo.produtos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import catalogo.produtos.model.Produto;
import catalogo.produtos.service.implement.ProdutoServiceImplements;

@ControllerAdvice
@RestController
@RequestMapping("/produtos")
public class ProdutoController {
	
	@Autowired
	private ProdutoServiceImplements produtoServiceImpl;

	@PostMapping("/adicionar")
	public ResponseEntity<Produto> adicionarProduto(Produto produto){
		
		Produto prodAdicionado = produtoServiceImpl.adicionar(produto);
		ResponseEntity<Produto> response = new ResponseEntity<Produto>(prodAdicionado, HttpStatus.CREATED);
		return response;
	}
	
	
}
