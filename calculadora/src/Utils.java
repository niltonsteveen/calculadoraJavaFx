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
    private double resultado=0;
    private boolean isZero=false;
    
    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public boolean isIsZero() {
        return isZero;
    }

    public void setIsZero(boolean isZero) {
        this.isZero = isZero;
    }
    
    
    
    public Utils() {
        entrada=new StringBuffer();
    }

    public StringBuffer getEntrada() {
        return entrada;
    }

    public void setEntrada(StringBuffer entrada) {
        this.entrada = entrada;
    }

    public void addString(String text) {
        entrada.append(text);
    }

    public double sumar(double num1,double num2){
        return num1+num2;
    }
    
    public int numOperandos(){
        int contador=0;
        for(int i=0;i<entrada.length();i++){
            if(entrada.charAt(i)=='+'||entrada.charAt(i)=='-'||entrada.charAt(i)=='*'
                    ||entrada.charAt(i)=='/'){
                contador++;
            }
        }
        return contador;
    }
    
    public double operar(String num, String operador) {
        if(!"".equals(num)){
            if(operador.equals("+")){
                resultado=resultado+Double.parseDouble(num);
            }else if(operador.equals("-")){
                if(numOperandos()==1){
                    resultado=Double.parseDouble(num)-resultado;
                }else{
                    resultado=resultado-Double.parseDouble(num);
                }
            }else if(operador.equals("/")){
                if(Double.parseDouble(num)==0){
                    isZero=true;
                }else if(numOperandos()==1&&entrada.charAt(entrada.length()-1)=='/'){
                    resultado=Double.parseDouble(num);
                }else{
                    resultado=resultado/Double.parseDouble(num);
                }
            }
        }
        
        return resultado;
    }
    
}
