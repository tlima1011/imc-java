package util;

public class CalculoImc {
    
    private float imc; 
    
    public CalculoImc(){
        this.imc = imc;
    }
    
    public float getImc() {
        return imc;
    }

    public void setImc(float imc) {
        this.imc = imc;
    }
       
    public static float calcularImc(float peso, float altura){

        return peso / (altura * altura);
    
    }
    
    public static String indice(float imc){
        String classificacao = "";
        if (imc <= 18.5){
            classificacao = "Magreza";
        }else if (imc <= 24.9){
            classificacao = "Peso Normal";
        }else if(imc <= 29.9){
            classificacao = "Acima do Peso";
        }else if(imc <= 34.9){
            classificacao = "Obesidade Grau I";
        }else{
            classificacao = "Obesidade Grau II";
        }
        return classificacao;
    }
}

