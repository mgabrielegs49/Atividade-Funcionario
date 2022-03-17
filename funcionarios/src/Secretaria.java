public class Secretaria extends funcionario {
    private String ramal;

    public void setRamal (String ramal){
        this.ramal = ramal;
    }
    public String getRamal (){
        return this.ramal;
    }

    public void Bonificacao (){
        this.salario=this.salario*1.15;
    }
}
