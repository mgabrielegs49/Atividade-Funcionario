public abstract class funcionario {
    protected String nome;
    protected String cpf;
    protected String data_nascimento;
    protected double salario;

    public void setNome(String nome){
        this.nome=nome;
    }
    public String getNome(){
        return this.nome;
    }
    
    public void setCPF(String cpf){
        this.cpf=cpf;
    }
    public String getCPF(){
        return this.cpf;
    }

    public void setData_Nascimento(String data_nascimento){
        this.data_nascimento=data_nascimento;
    }
    public String getData_Nascimento(){
        return this.data_nascimento;
    }

    public void setSalario(double salario){
        this.salario=salario;
    }
    public double getSalario(){
        return this.salario;
    }

    public abstract void Bonificacao();
}
