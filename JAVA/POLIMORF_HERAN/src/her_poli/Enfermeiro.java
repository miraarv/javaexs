package her_poli;

public class Enfermeiro extends Pessoa {
    private String HorarioTrabalho;
    private String NomeCurso;
    private Double Salario;
    
    public String getHorarioTrabalho() {
        return HorarioTrabalho;
    }
    public void setHorarioTrabalho(String horarioTrabalho) {
        HorarioTrabalho = horarioTrabalho;
    }
    public String getNomeCurso() {
        return NomeCurso;
    }
    public void setNomeCurso(String nomeCurso) {
        NomeCurso = nomeCurso;
    }
    public Double getSalario() {
        return Salario;
    }
    public void setSalario(Double salario) {
        Salario = salario;
    }
}
