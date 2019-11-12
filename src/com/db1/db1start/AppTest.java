package com.db1.db1start;


import org.junit.Assert;
import org.junit.Test;

public class AppTest {

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


}
