/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.atividade_1;

/**
 *
 * @author adils
 */
public class Classe1 {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Double QtdHorasTrabalhadas;
        Double SalarioBruto;
        Double ValorHora;
        Double PercentDescontoInss; 
        Double DescontoInss;
        Double SalarioLiquido;
 
        System.out.println("Informe quantidade de horas trabalhadas do funcionario ");
        QtdHorasTrabalhadas = Double.parseDouble(JOptionPane.showInputDialog("Informe QtdHorasTrabalhadas"));
 
        System.out.println("Informe o valor por hora que o funcionario recebe ");
        ValorHora = Double.parseDouble(JOptionPane.showInputDialog("Informe ValorHora"));
 
        System.out.println("Informe o % de desconto do INSS ");
        PercentDescontoInss = Double.parseDouble(JOptionPane.showInputDialog("Informe o desconto do INSS"));
 
        SalarioBruto = (QtdHorasTrabalhadas * ValorHora);
 
        DescontoInss = ( SalarioBruto * PercentDescontoInss)/100;
 
        SalarioLiquido = (SalarioBruto -  DescontoInss);
 
        System.out.println("O salário bruto do funcionário é: " + SalarioBruto);
        System.out.println("O valor do desconto do inss é: " + DescontoInss);
        System.out.println("O salário líquido  é: " + SalarioLiquido);
    }
}
    

