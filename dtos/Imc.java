package br.com.zup.PrimeiraAulaSpringBoot.dtos;

public class Imc {

    private double altura;
    private double peso;


    public Imc(){

    }

    public Imc(double altura, double peso) {
        this.altura = altura;
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }


}
