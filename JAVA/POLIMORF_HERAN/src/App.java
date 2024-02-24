import her_poli.Enfermeiro;
import her_poli.Paciente;
import her_poli.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
   
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Senshi");
        System.out.println("Nome da pessoa: "+ pessoa.getNome());

        Paciente paciente = new Paciente();
        paciente.setNome("Mira");
        System.out.println("Nome do paciente: "+ paciente.getNome());

        Enfermeiro enfermeiro = new Enfermeiro();
        enfermeiro.setNome("Farlyn");
        System.out.println("Nome do Enfermeiro: "+ enfermeiro.getNome());
    }
}
