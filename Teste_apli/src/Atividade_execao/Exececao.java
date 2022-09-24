/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade_execao;

/**
 *
 * @author adils
 */


import javax.swing.JOptionPane;
        
public class Exececao {
   public static void main(){
      int numero; 
      try{
          numero = integer.parseInt(JOptionPane.showInputDialog("Informe o numero"));
         JOptionPane.showMessageDialog(null, numero);
        } 
     catch(Exception e){
        JOptionPane.showMessageDialog(null, "Você tentou Digital uma letra aonde deveria ser somente um número inteiro\n" + e.getMessage());
         
     }
        
   }//fecha main
}//fecha classe 
