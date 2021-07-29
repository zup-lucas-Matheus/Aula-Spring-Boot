package br.com.zup.PrimeiraAulaSpringBoot.controllers;


import br.com.zup.PrimeiraAulaSpringBoot.dtos.Imc;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImcController {

    @PostMapping("/imc")
    public double imc(@RequestBody Imc imc){


        double valorImc = (imc.getPeso() / (imc.getAltura() * imc.getAltura())) ;

        if (valorImc <= 18.5) {
            System.out.println("MAGREZA");

        }

        else if (valorImc > 18.5 && valorImc <= 25) {
            System.out.println("NORMAL");

        }
        else if (valorImc > 26 && valorImc <= 30) {
            System.out.println("SOBREPESO");

        }
        else if (valorImc > 30 && valorImc <= 40) {
            System.out.println("OBESIDADE");

        }
        else {
            System.out.println("BORA MALHAR NÉ...");

        }

        return valorImc;
    }

}
