public class App {
    public static void main (String[]args){
        Gerente g = new Gerente();
        g.setNome ("João");
        g.setCPF ("057.369.842-00");
        g.setData_Nascimento ("10/10/1994");
        g.setSalario (5000);
        g.setLogin("Joao94");
        g.setSenha("@LittleJhonny");
        g.Bonificacao();

        System.out.println(g.getSalario());

        Secretaria s = new Secretaria();
        s.setNome ("Secretária");
        s.setCPF ("350.860.846-90");
        s.setData_Nascimento ("04/08/1986");
        s.setSalario (2000);
        s.getRamal();
        s.Bonificacao();
        
        System.out.println(s.getSalario());
    }
}
