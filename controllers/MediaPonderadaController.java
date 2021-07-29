package br.com.zup.PrimeiraAulaSpringBoot.controllers;


import br.com.zup.PrimeiraAulaSpringBoot.dtos.MediaDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MediaPonderadaController {

    @PostMapping("/media")
    public double mediaAritmetica(@RequestBody MediaDTO nota){

        double soma = (nota.getNota1() + nota.getNota2() + nota.getNota3()) / 3;

        return soma;

    }

}
