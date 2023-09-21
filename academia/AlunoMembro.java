public class AlunoMembro extends Aluno {
    public AlunoMembro(int id, String nome, int idade, boolean problemaSaude, String sexo, String tipoPagamento){
        super(id, nome, idade, sexo, problemaSaude, tipoPagamento, problemaSaude);
    }

    //método para remover o status de membro do aluno
    public void removerMembro(){
        setMembro(false);
    }

    @Override
    public String toString(){
        return super.toString();
    }
}
