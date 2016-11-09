/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.lexicalAnalyzerModel;
import View.lexicalAnalyzerView;
import java.io.FileNotFoundException;


/**
 *
 * @author Admin
 */
public class lexicalAnlyzerController {
    public void readSourceCode() throws FileNotFoundException{
        //lexicalAnalyzer View create and call here
        lexicalAnalyzerView  laView = new lexicalAnalyzerView();
        lexicalAnalyzerModel laModel = new lexicalAnalyzerModel();
        laModel.sourceCodeReader(laView.readSourceCodeFil());
        laModel.print();
        
    }
}
