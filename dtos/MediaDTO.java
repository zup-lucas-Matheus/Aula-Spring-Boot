package br.com.zup.PrimeiraAulaSpringBoot.dtos;

public class MediaDTO {

    //Atributos do aluno...
    private double nota1, nota2, nota3;


    //Metódo construtor vazio...
    public MediaDTO(){

    }
    //Metódo construtor...
    public MediaDTO( double nota1, double nota2, double nota3) {

        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    //Metódo seletores e modificadores...

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }



}
