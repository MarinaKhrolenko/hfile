package heshfile;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author Марина
 */
public class MD5 {
  
    public String getHash(File newFile) throws NoSuchAlgorithmException, FileNotFoundException, IOException{    
    
    MessageDigest digest = MessageDigest.getInstance("MD5");
    InputStream fis = new FileInputStream(newFile);
    int n = 0;
    byte[] buffer = new byte[4096];
    
    while (n != -1) 
    {
        n = fis.read(buffer);
       
        if (n > 0) {
            digest.update(buffer, 0, n);
        }
    }
        byte[] mdbytes = digest.digest();
        
     StringBuffer hexString = new StringBuffer();
    	
            for (int i=0;i<mdbytes.length;i++) 
            
            {
    		
                String hex=Integer.toHexString(0xff & mdbytes[i]);
   	     	
                    if(hex.length()==1) hexString.append('0');
   	     	
                    hexString.append(hex);
    	}
       
       
    return hexString.toString();
}
}
 
 
