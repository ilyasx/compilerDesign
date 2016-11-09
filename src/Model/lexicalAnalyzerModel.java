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
    public int bufferSize = 1024;
    public char [] buffer1;
    public char [] buffer2;
    public String temp;
    
    //this function read source code from inputfile
    
    public void sourceCodeReader(String filename) throws FileNotFoundException{
        String lines;
        BufferedReader br = new BufferedReader(new FileReader( new File(filename)));
        try (Scanner linReader = new Scanner(new File(filename))) {
            while (linReader.hasNext())
            {   // this readone line and call bufferCreatuib Function.
               buffersCreation(linReader.nextLine());
               this.temp +=linReader.nextLine();
        
            }
        }
    }
    // function that convert into buffers
    public void buffersCreation(String line){
        this.buffer1 = new char[this.bufferSize];
        //this.buffer2 = new char[this.bufferSize];
        // size of line 
        if(line.length() <= this.bufferSize){
            buffer1=line.toCharArray();
            System.out.println(buffer1);
            //System.out.println(buffer1);
        }
        else{
            
        }
        this.temp +=tokenizer(buffer1);
    }
    public String tokenizer(char [] buffer1){
        //System.out.println("Tokenization called");
        String temp = null;
        if(buffer1.length != 0){ 
            for (int i=0;i<buffer1.length;i++){
                if(buffer1[i]!='\n' && buffer1[i]!=' ' && buffer1[i]!='\t' ){
                    temp+=buffer1[i];
                }
            }
            System.out.println(temp);
        }
        return temp;
    }
    public void print(){
//        System.out.println(this.temp);
    }
}
