package aula06;

public class LivroDeNotas {
    private String nomeDoCurso;
    private String nomeProf;
    private double nota1, nota2, nota3;
    
    public LivroDeNotas (String nomeDoCurso, String nomeProf){
        this.nomeDoCurso = nomeDoCurso;
        this.nomeProf = nomeProf;
    }
    
    public void exibirMensagem() {
        System.out.printf("Bem vindo ao livro de notas. \n" + nomeDoCurso + "\n" +  nomeProf  + "\n");

    }
    
    public void lancarNota(){
       System.out.printf("As notas são: " + "\n" + getNota1() + "\n" + getNota2() + "\n" + getNota3());
    }
    public String getNomeDoCurso(){
        return nomeDoCurso;
    }
    public void setNomeDoCurso(String nomeDoCurso){
       this.nomeDoCurso = nomeDoCurso; 
    }
    public String getNomeProf(){
        return nomeProf;
    }
    public void setNomeProf(String nomeProf){
        this.nomeProf = nomeProf;
    }

    /**
     * @return the nota1
     */
    public double getNota1() {
        return nota1;
    }

    /**
     * @param nota1 the nota1 to set
     */
    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    /**
     * @return the nota2
     */
    public double getNota2() {
        return nota2;
    }

    /**
     * @param nota2 the nota2 to set
     */
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    /**
     * @return the nota3
     */
    public double getNota3() {
        return nota3;
    }

    /**
     * @param nota3 the nota3 to set
     */
    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }
   

}
