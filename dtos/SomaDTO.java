package br.com.zup.PrimeiraAulaSpringBoot.dtos;

public class SomaDTO {

    //Atributos
    private int numero1;
    private int numero2;

    //Metódo Construtor...
    public SomaDTO(){

    }

    public SomaDTO(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    //Metódo seletores e modificados...
    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }




}
