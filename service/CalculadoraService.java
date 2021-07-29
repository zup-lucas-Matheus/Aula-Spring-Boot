package br.com.zup.PrimeiraAulaSpringBoot.service;

import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {


    public int soma(int numero1, int numero2){

        int resultado = numero1 + numero2;

        return resultado;

    }

}
