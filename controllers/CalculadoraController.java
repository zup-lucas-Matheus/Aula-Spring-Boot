package br.com.zup.PrimeiraAulaSpringBoot.controllers;


import br.com.zup.PrimeiraAulaSpringBoot.dtos.RespostaDTO;
import br.com.zup.PrimeiraAulaSpringBoot.dtos.SomaDTO;
import br.com.zup.PrimeiraAulaSpringBoot.service.CalculadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculadoraController {

    @Autowired // INJETAR.
    private CalculadoraService calculadoraService; // injeção de dependencia.

    @PostMapping("/soma")
    public RespostaDTO retornarResultadoDaSoma(@RequestBody SomaDTO soma){ //@ResquestBody -> ele é o corpo que vai manda um objeto Json que representa a soma DTO.

        int resultado = calculadoraService.soma(soma.getNumero1(), soma.getNumero2());

        RespostaDTO respostaDTO = new RespostaDTO();
        respostaDTO.setResultado(resultado);

        return respostaDTO;
    }

/*
    usuando o só o @controller temos que usar o ResponseEntity para ele converter para JSON.
    @PostMapping("/soma")
    public ResponseEntity<?> retornarResultadoDaSoma(@RequestBody SomaDTO somaDTO){
        int resultado = calculadoraService.soma(somaDTO.getPrimeiroNumero(), somaDTO.getSegundoNumero());
        RespostaDTO respostaDTO = new RespostaDTO(resultado);
        return ResponseEntity.ok().body(respostaDTO);
    }*/

}
