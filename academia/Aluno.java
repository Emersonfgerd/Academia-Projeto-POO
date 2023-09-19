public class Aluno {
    private String nome;
    private int idade;
    private boolean possuiProblemaSaude;
    private boolean membroAnual;
    public Aluno(String nome, int idade, boolean possuiProblemaSaude, boolean membroAnual) {
        this.nome = nome;
        this.idade = idade;
        this.possuiProblemaSaude = possuiProblemaSaude;
        this.membroAnual = membroAnual;
    }
    public String getNome() {
        return nome;
    }
     
    public int getIdade() {
        return idade;
    }
   
    public boolean isPossuiProblemaSaude() {
        return possuiProblemaSaude;
    }
    public void setPossuiProblemaSaude(boolean possuiProblemaSaude) {
        this.possuiProblemaSaude = possuiProblemaSaude;
    }
    public boolean isMembroAnual() {
        return membroAnual;
    }
    public void setMembroAnual(boolean membroAnual) {
        this.membroAnual = membroAnual;
    }

}
