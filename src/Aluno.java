import java.util.Arrays;
public class Aluno extends Person{
    private int IdAluno;
    private double mediaGeral;
    private double[] notas;
    private String disciplina;
    private String graduacao;
    private int anoIngresso;
    public Aluno(){
    }
    public Aluno(String firstName, String middleName, String lastName) {
        super(firstName, middleName, lastName);
        this.IdAluno = 0;
        this.notas = new double[2];
        this.disciplina = disciplina;
        this.graduacao = graduacao;
        this.anoIngresso = anoIngresso;
        this.mediaGeral = 0;
    }
    public void setIdAluno(int idAluno) {
        IdAluno = idAluno;
    }
    public void setNotas(double[] notas) {
        this.notas = notas;
        this.mediaGeral = (notas[0] + notas[1])/2;
    }
    public void setGraduacao(String graduacao) {
        this.graduacao = graduacao;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    public void setAnoIngresso(int anoIngresso) {
        this.anoIngresso = anoIngresso;
    }

    public int getAnoIngresso() {
        return anoIngresso;
    }
    public int getAnoEgresso(){
        return anoIngresso + 4;
    }
    public double[] getNotas() {
        return notas;
    }
    public String toString(){
        String aux = "";
        aux +="nome: "+getName()
        +"\nID: "+ this.IdAluno
        +"\nNotas: "+ java.util.Arrays.toString(getNotas())
        +"\nMédia Geral: "+ this.mediaGeral
        +"\nDisciplina: "+this.disciplina
        +"\nGraduação: "+this.graduacao
        +"\nAno de ingresso:"+ this.anoIngresso
        +"\nPrevisao de termino: "+getAnoEgresso();
        return aux;
    }
}
