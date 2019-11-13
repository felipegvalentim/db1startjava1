package com.db1.db1start;


import org.junit.Assert;
import org.junit.Test;

public class AppTest {

    //Exercícios de Inteiro (Integer)
    @Test
    public void testeSomar(){
        Application application = new Application();
        Integer expected = 8;
        Integer response = application.somar(3,5);
        Assert.assertEquals(expected,response);
    }
    @Test
    public void testeSubtrair(){
        Application application = new Application();
        Integer expected = 2;
        Integer response = application.subtrair(5,3);
        Assert.assertEquals(expected,response);
    }
    @Test
    public void testeMultiplicar(){
        Application application = new Application();
        Integer expected = 4;
        Integer response = application.multiplicar(2,2);
        Assert.assertEquals(expected,response);
    }
    @Test
    public void testeDividir(){
        Application application = new Application();
        Integer expected = 2;
        Integer response = application.dividir(4,2);
        Assert.assertEquals(expected,response);
    }
    @Test
    public void testeNumber(){
        Application application = new Application();
        Boolean expected = true;
        Boolean response = application.par(10);
        Assert.assertEquals(expected,response);
    }
    @Test
    public void testeMaior(){
        Application application = new Application();
        Integer expected = 25;
        Integer response = application.maior(25,20);
        Assert.assertEquals(expected,response);
    }
    @Test
    public void testeImpares(){
        Application application = new Application();
        Integer expected = 5;
        Integer response = application.impares(10);
        Assert.assertEquals(expected,response);
    }
    //Exercícios de Texto (String)
    @Test
    public void testeMaiuscula(){
        Application application = new Application();
        String expected = "FELIPE";
        String response = application.maiuscula("felipe");
        Assert.assertEquals(expected,response);
    }
    @Test
    public void testeMinuscula(){
        Application application = new Application();
        String expected = "felipe";
        String response = application.minuscula("FELIPE");
        Assert.assertEquals(expected,response);
    }
    @Test
    public void testeContagem(){
        Application application = new Application();
        Integer expected = 8;
        Integer response = application.contagem("DB1START");
        Assert.assertEquals(expected,response);
    }
    @Test
    public void testeEspacos(){
        Application application = new Application();
        Integer expected = 8;
        Integer response = application.espaco(" DB1START ");
        Assert.assertEquals(expected,response);
    }
    @Test
    public void testeNome(){
        Application application = new Application();
        String expected = "ipe";
        String response = application.nomeTerceiraLetra("Felipe");
        Assert.assertEquals(expected,response);
    }
}
