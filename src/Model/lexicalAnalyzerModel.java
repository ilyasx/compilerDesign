/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.*;
import java.util.*;


/**
 *
 * @author Admin
 */
public class lexicalAnalyzerModel {
    //this function read source code from inputfile
    public void sourceCodeReader(String filename) throws FileNotFoundException{
        
        try (Scanner linReader = new Scanner(new File(filename))) {
            while (linReader.hasNext())
            {
                String line = linReader.nextLine();
                System.out.println(line);
            }
        }
    }
}
