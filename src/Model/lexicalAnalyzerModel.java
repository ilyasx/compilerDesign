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
    public String buffer1;
    public String buffer2;
    public String temp ="";
    
    //this function read source code from inputfile
    
    public void sourceCodeReader(String filename) throws FileNotFoundException{
        String lines;
        BufferedReader br = new BufferedReader(new FileReader( new File(filename)));
        try (Scanner linReader = new Scanner(new File(filename))) {
            while (linReader.hasNext())
            {   // this readone line and call bufferCreatuib Function.
               buffersCreation(linReader.nextLine());
//               this.temp +=linReader.nextLine();     
            }
        }
    }
    // function that convert into buffers
    public void buffersCreation(String line){
       //this.buffer1 = new char[this.bufferSize];
        //this.buffer2 = new char[this.bufferSize];
        // size of line 
        if(line.length() <= this.bufferSize){
            buffer1=line;
//            System.out.println(buffer1);
            //System.out.println(buffer1);
        }
        else{
            
        }
        this.temp +=tokenizer(buffer1);
    }
    public String tokenizer(String buffer1){
        //System.out.println("Tokenization called");
        String temp = "";
        if(buffer1.length() != 0){ 
            for (int i=0;i<buffer1.length();i++){
                if(buffer1.charAt(i)!='\n' && buffer1.charAt(i)!=' ' &&buffer1.charAt(i)!='\t' ){
                    temp+=buffer1.charAt(i);
                }
            }
          //System.out.println(temp);
        }
        return temp;
    }
    public String print(){
            char [] b = new char[100];
            char [] a=new char[100];
            a=this.temp.toCharArray();
            String test=null;
            System.out.println(this.temp);
            /*
            //here is bugg
            for(int i=0;i<66;i++){
                System.out.println(a[i]+""+a[i+1]+""+a[i+2]);
                
                if(a[i]=='i'&& a[i+1]=='n' && a[i+2]=='t'){
                            
                            System.out.println("match");
                            test+=" int ";
                            i=i+3;
                            
                }
                if(a[i]=='f'&& a[i+1]=='l' && a[i+2]=='o' && a[i+4]=='a'&& a[i+5]=='t'){
                            
                            System.out.println("match");
                            test+=" float ";
                            i=i+3;
                            
                }
                
                test+=a[i];

            }
            //for(int i=0;i<b.length;i++){
              //  System.out.print(b[i]);
            //}
            
            System.out.println(test);*/
            return this.temp;
        }
}
