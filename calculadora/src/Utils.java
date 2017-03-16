/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nilto
 */
public class Utils {
    private StringBuffer entrada;
    
    public Utils() {
        entrada=new StringBuffer();
    }

    public StringBuffer getEntrada() {
        return entrada;
    }

    public void setEntrada(StringBuffer entrada) {
        this.entrada = entrada;
    }
    
    
    
    public double sumar(double num1, double num2){
        return num1+num2;
    }

    public void addString(String text) {
        entrada.append(text);
    }
    
}
