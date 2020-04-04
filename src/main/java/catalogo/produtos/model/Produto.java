package catalogo.produtos.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotEmpty;

import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Produto {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private UUID chave;
	@NotEmpty(message = "O Nome do Produto não pode ser nulo")
	private String nome;
	@NotEmpty(message = "A Descrição Produto não pode ser nula")
	private String descricao;
	private Boolean status;
}
