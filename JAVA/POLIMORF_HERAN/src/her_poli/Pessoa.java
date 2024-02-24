package her_poli;
//superclasse
public class Pessoa {
   private String Nome;
   private int Idade;
   private String Documento;

//retorna nome  @return
public String getNome() {
    return Nome;
}

//recebe nome @param Nome
public void setNome(String Nome) {
    this.Nome = Nome;
}

//retorna idade @return int
public int getIdade() {
    return Idade;
}
public void setIdade(int idade) {
    Idade = idade;
}
public String getDocument() {
    return Documento;
}
public void setDocument(String documento) {
    Documento = documento;
}

}
