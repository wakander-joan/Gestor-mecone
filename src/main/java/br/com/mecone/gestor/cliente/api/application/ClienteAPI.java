package br.com.mecone.gestor.cliente.api.application;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.mecone.gestor.cliente.api.application.DTO.ClienteRequest;
import br.com.mecone.gestor.cliente.api.application.DTO.ClienteResponse;

@RestController
@RequestMapping ("/v1/cliente")
public interface ClienteAPI {
	
	@PostMapping (value = "post-cliente/{idEmpresa}")
	@ResponseStatus (code = HttpStatus.CREATED)
	ClienteResponse postCliente(@PathVariable UUID idEmpresa, @RequestBody ClienteRequest clienteRequest);

}
