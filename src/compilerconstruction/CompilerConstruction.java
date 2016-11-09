/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilerconstruction;

import Controller.lexicalAnlyzerController;
import java.io.FileNotFoundException;

/**
 *
 * @author Admin
 */
public class CompilerConstruction {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        lexicalAnlyzerController lac = new lexicalAnlyzerController();
        lac.readSourceCode();
        
        
    }
    
}
