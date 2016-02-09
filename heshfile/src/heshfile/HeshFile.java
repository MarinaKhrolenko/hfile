
package heshfile;

import java.io.*;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author Марина
 */
public class HeshFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
                     
        String name;
               
        for(int i=0;i<1500;i++){
        name="D:/papka//"+i+".txt";
        File newFile=new File(name);
        if(newFile.createNewFile()){
         // System.out.println(i);
        }
        else{
           // System.out.println("error");
        }
        //System.out.println(/*"size: "+*/newFile.length());
        
      int timestamp1 = (int) System.currentTimeMillis();
      MD5 md5 = new MD5();                                        
      //System.out.println(/*"MD5: "+*/md5.getHash(newFile));
      int calculationTime1 = (int) System.currentTimeMillis() - timestamp1;
      //System.out.println(/*"timeMD5: "+*/calculationTime1);
       
      int timestamp2 = (int) System.currentTimeMillis();
      SHA1 sha1 = new SHA1();                                        
      //System.out.println(/*"SHA1: "+*/sha1.getHash(newFile));
      int calculationTime2 = (int) System.currentTimeMillis() - timestamp2;
      // System.out.println(/*"timeSHA1: "+*/calculationTime2);
                 
      String rez = "\n"+i+";"+newFile.length()+";"
              +md5.getHash(newFile)+";"+calculationTime1+";"
              +sha1.getHash(newFile)+";"+calculationTime2+";";
     // System.out.println(rez);
      
    File file = new File("D:/papka//REZ.csv");
          if(newFile.createNewFile()){
         System.out.println("done");
        }
        else{
            System.out.println("error");
        }

        FileWriter fw = new FileWriter(file,true);
        
        BufferedWriter bw = new BufferedWriter(fw);
    	bw.write(rez);
    	
    	bw.close();
             
            }
                 }
             
            }

