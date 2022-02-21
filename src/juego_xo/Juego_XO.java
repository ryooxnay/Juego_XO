/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_xo;

import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class Juego_XO {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      try {
         app_XO xo = new app_XO();
         xo.setVisible(true);
      } catch (Exception e) {
         JOptionPane.showMessageDialog(null, e);
      }
   }
   
}
