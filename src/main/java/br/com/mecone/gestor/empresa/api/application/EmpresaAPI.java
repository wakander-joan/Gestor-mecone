package br.com.mecone.gestor.empresa.api.application;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/v1/empresa")
public interface EmpresaAPI {
	
	@PostMapping
	@ResponseStatus (code = HttpStatus.CREATED)
	EmpresaResponse postEmpresa ( @RequestBody EmpresaRequest empresaRequest);
	
	@GetMapping("/find-by-empresa/{idEmpresa}")
    @ResponseStatus(code = HttpStatus.OK)
	EmpresaDetalhadaResponse getEmpresaPorId(@PathVariable UUID idEmpresa);

}
