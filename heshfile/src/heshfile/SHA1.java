
package heshfile;

import java.io.*;
import java.security.*;

/**
 *
 * @author Марина
 */
public class SHA1 {
  
    public byte[] getHash(File newFile) throws NoSuchAlgorithmException, FileNotFoundException, IOException{    
    
    MessageDigest digest = MessageDigest.getInstance("SHA-1");
    InputStream fis = new FileInputStream(newFile);
    int n = 0;
    byte[] buffer = new byte[4096];
    
        while (n != -1) {
            
            n = fis.read(buffer);
       
            if (n > 0) {
                
            digest.update(buffer, 0, n);
        }
    }
    
        return digest.digest();
}
}
