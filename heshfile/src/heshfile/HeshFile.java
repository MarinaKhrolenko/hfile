
package heshfile;

import java.io.*;
import java.security.NoSuchAlgorithmException;

public class HeshFile {

    
    public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
                     
        String name;
               
        for(int i=0;i<1500;i++)
        {
            name="D:/papka//"+i+".txt";
            
                 File newFile=new File(name);
                 
                     if(newFile.createNewFile())
                     {
         
                      System.out.println(i);
                    
                     }
                        else
                     {
                              
                         System.out.println("error");
                              
                     }
                
                    int timestamp1 = (int) System.currentTimeMillis();
      
                    MD5 md5 = new MD5();                                        
      
                    int calculationTime1 = (int) System.currentTimeMillis() - timestamp1;
             
      
                    int timestamp2 = (int) System.currentTimeMillis();
      
                    SHA1 sha1 = new SHA1();                                        
      
      
                    int calculationTime2 = (int) System.currentTimeMillis() - timestamp2;
      
                 
     
                            String rez = "\n"+i+";"+newFile.length()+";"
                                +md5.getHash(newFile)+";"+calculationTime1+";"
                                    +sha1.getHash(newFile)+";"+calculationTime2+";";
     
      
    
                            File file = new File("D:/papka//REZ.csv");
          
                                 if(newFile.createNewFile())
                                    {
                                         System.out.println("done");
                                    }
       
                                 else
                                 {
                                    System.out.println("error");
        
                                 }

        
                                 FileWriter fw = new FileWriter(file,true);
              
                                 BufferedWriter bw = new BufferedWriter(fw);
    	
                                 bw.write(rez);
    	 	
                                 bw.close();
                         }
                 }
             
            }

