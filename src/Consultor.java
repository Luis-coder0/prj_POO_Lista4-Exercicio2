/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luis
 */
public class Consultor extends Funcionario {
    
    public Consultor(){}
    
    public Consultor(String nome, String matricula, float salario){
        super.setNome(nome);
        super.setMatricula(matricula);
        super.setSalario(salario);
        
    }
    
    @Override
    public float getSalario(){
        return super.getSalario()*0.1f;
    }
    
    public float getSalario(float porcentagem){
        return super.getSalario()*porcentagem;
    }
}