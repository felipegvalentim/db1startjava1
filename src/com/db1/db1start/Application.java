package com.db1.db1start;

public class Application {
    public Integer somar(Integer n1,Integer n2){
        return n1 + n2;
    }
    public Integer subtrair(Integer n1, Integer n2){
        return n1-n2;
    }
    public Integer multiplicar(Integer n1, Integer n2){
        return n1 * n2;
    }
    public Integer dividir(Integer n1, Integer n2){
        return n1 / n2;
    }
    public Boolean par(Integer valor){
        if(valor % 2 == 0){
            return true;
        }
        return false;
    }
    public Integer maior(Integer valor1, Integer valor2){
        if(valor1 > valor2){
            return valor1;
        }
        return valor2;
    }

    public Integer impares(Integer num){
        Integer valor = 0;
        for (Integer i = 0; i < num; i++){
            if(i % 2 != 0) {
                valor++;
            }
        }
        return valor;
    }

    public String maiuscula(String textoMai){
        return textoMai.toUpperCase();
    }
    public String minuscula(String textoMin){
        return textoMin.toLowerCase();
    }
    public Integer contagem(String contLetras){
        return contLetras.length();
    }
    public Integer espaco(String texto){
        String textoSemEspaco = texto.replace(" ", "");
        Integer qtddLetras = textoSemEspaco.length();
        return qtddLetras;
    }
    public String nomeQuatroLetras(String nome){
        return nome.substring(0,4);
    }
    public String nomeTerceiraLetra(String nome){
        return nome.substring(3,6);
    }

}
