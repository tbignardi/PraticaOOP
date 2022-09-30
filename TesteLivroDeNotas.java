package aula06;

import javax.swing.JOptionPane;

public class TesteLivroDeNotas {
    
    public static void main (String [] args) {
            
        String nomeDoCurso = JOptionPane.showInputDialog("Qual o nome do curso? ");
        String nomeProf = JOptionPane.showInputDialog("Qual o seu nome? \n");
         LivroDeNotas livroDeNotas = new LivroDeNotas(nomeDoCurso, nomeProf);
        
         double nota1 = Double.parseDouble(JOptionPane.showInputDialog ("Digite a primeira nota: "));
         double nota2 = Double.parseDouble(JOptionPane.showInputDialog ("Digite a segunda nota: "));
         double nota3 = Double.parseDouble(JOptionPane.showInputDialog ("Digite a terceira nota: "));
         
        livroDeNotas.exibirMensagem();
                
        livroDeNotas.setNota1(nota1);
        livroDeNotas.setNota2(nota2);
        livroDeNotas.setNota3(nota3);
        livroDeNotas.lancarNota();             
    }
    
}
