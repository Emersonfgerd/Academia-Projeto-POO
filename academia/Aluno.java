public class Aluno {
    private int id;
    private String nome;
    private int idade;
    private String sexo;
    private boolean problemaSaude;
    private String tipoPagamento;
    private boolean membro;

    
    public Aluno(int id, String nome, int idade, String sexo, boolean problemaSaude, String tipoPagamento, boolean membro) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.problemaSaude = problemaSaude;
        this.tipoPagamento = tipoPagamento;
        this.membro = false; //Por padrão o aluno não é membro.
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isProblemaSaude() {
        return problemaSaude;
    }

    public void setProblemaSaude(boolean problemaSaude) {
        this.problemaSaude = problemaSaude;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public boolean isMembro() {
        return membro;
    } 

    public void setMembro(boolean membro) {
        this.membro = membro;
    }

    public void tornarMembro(){
        this.membro = false;
    }

    public void removerMembro(){
        this.membro = false;
    }
    public void editarAluno(String nome, int idade, boolean problemaSaude, String tipoPagamento){
        this.nome = nome;
        this.idade = idade;
        this.problemaSaude = problemaSaude;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                "\nNome: " + nome +
                "\nIdade: " + idade +
                "\nSexo: " + sexo +
                "\nProblema de Saúde: " + (problemaSaude ? "Sim" : "Não") +
                "\nTipo de Pagamento: " + tipoPagamento +
                "\nMembro: " + (membro ? "Sim" : "Não");
    }
}
