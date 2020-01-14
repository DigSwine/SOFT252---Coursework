/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soft252.cw.Patterns;

/**
 *
 * @author mwilson-slider
 */
public class Context {
    private Strategy strategy;

   public Context(Strategy strategy){
      this.strategy = strategy;
   }

    public Context() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   public double executeStrategy(double num1, double num2){
      return strategy.doOperation(num1, num2);
   }
}
