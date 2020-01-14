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
public class Adding implements Strategy {
    @Override
    public double doOperation(double num1, double num2) {
        return num1 + num2;
    }
}
