/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.lexicalAnalyzerModel;

import View.lexicalAnalyzerView;
import java.io.FileNotFoundException;
import Model.*;



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
        
        
        
        Tokenizer tokenizer = new Tokenizer();
        //keywords
        tokenizer.add("int|float|for|do|while|if|else|return|main|#include<iostream>", 1);
    tokenizer.add("\\(", 2);
    tokenizer.add("\\)", 3);
    tokenizer.add("\\+|-|=", 4);
    tokenizer.add("\\*|/", 5);
    tokenizer.add("[0-9]+",6);
    tokenizer.add("[a-zA-Z][a-zA-Z0-9_]*", 7);
    tokenizer.add(";",8);
    tokenizer.add("\\}",9);
    tokenizer.add("\\{",10);
    tokenizer.add("\\//|/*|\\*/",11);
        //semi
        //tokenizer.add(";",8);
        //brekets close
        //tokenizer.add("\\}",9);
        //breakets open
        //tokenizer.add("\\{",10);
        //comments
        //tokenizer.add("\\//|/*|\\*/",11);
        //count << sign
        //tokenizer.add("\\<<", 12);
        //tokenizer.add("==|!|",13);
        



        try
        {
          tokenizer.tokenize(laModel.print());

          for (Tokenizer.Token tok : tokenizer.getTokens())
          {
            System.out.println("" + tok.token + " " + tok.sequence);
          }
        }
        catch (Model.ParserException e)
        {
          System.out.println(e.getMessage());
        }

      }
}

        