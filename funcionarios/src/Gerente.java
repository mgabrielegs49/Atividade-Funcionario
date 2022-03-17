public class Gerente extends funcionario {
    private String login;
    private String senha;

    public void setLogin (String login){
        this.login = login;
    }
    public String getLogin (){
        return this.login;
    }

    public void setSenha (String senha){
        this.senha = senha;
    }
    public String getSenha (){
        return this.senha;
    }

    public void Bonificacao (){
        this.salario=this.salario*1.25;
    }
}
