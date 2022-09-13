package br.com.mecone.gestor.funcionario.api.application;

import java.util.UUID;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/v1/funcionario/{idEmpresa}")
public interface FuncionarioAPI {

	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	FuncionarioResponse criaFuncionario (@PathVariable UUID idEmpresa ,@Valid @RequestBody FuncionarioRequeste funcionarioRequeste);

}
