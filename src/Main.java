
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luis
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <Funcionario> listaFuncionarios = new ArrayList();
        int intEscolha = 0;
        while(intEscolha != 3){
            intEscolha = Integer.parseInt(JOptionPane.showInputDialog("Escolha entre as opções no menu: \n1- Criar funcionário (funcionário ou consultor) \n2-Mostrar funcionários\n3- Sair"));
            switch(intEscolha){
                case 1:
                    String nomeFuncionario;
                    String matriculaFuncionario;
                    float salarioFuncionario;
                    switch(Integer.parseInt(JOptionPane.showInputDialog("1- Funcionário\n2- Consultor"))){
                        case 1:
                            nomeFuncionario = JOptionPane.showInputDialog(null, "Digite o nome do funcionário");
                            matriculaFuncionario = JOptionPane.showInputDialog(null, "Digite a matrícula do funcionário");
                            salarioFuncionario = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o salário do funcionário"));
                            Funcionario Funcionario = new Funcionario(nomeFuncionario, matriculaFuncionario, salarioFuncionario);
                            listaFuncionarios.add(Funcionario);
                            break;
                        case 2:
                            nomeFuncionario = JOptionPane.showInputDialog(null, "Digite o nome do funcionário");
                            matriculaFuncionario = JOptionPane.showInputDialog(null, "Digite a matrícula do funcionário");
                            salarioFuncionario = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o salário do funcionário"));
                            
                            Consultor Consultor = new Consultor(nomeFuncionario, matriculaFuncionario, salarioFuncionario);
                            listaFuncionarios.add(Consultor);
                            break;
                            
                    }
                    break;
                case 2:
                    String MatriculaBusca;
                    MatriculaBusca = JOptionPane.showInputDialog(null, "Digite a matrícula do aluno que deseja exibir");
                    for(Funcionario funcionarioAtual : listaFuncionarios){
                        if(funcionarioAtual.getMatricula().equals(MatriculaBusca)){
                            JOptionPane.showMessageDialog(null, "Segue o aluno buscado: \n"+funcionarioAtual.toString());
                        }
                    }
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Finalizando");
                    break;
            }
        }
    }
}
    