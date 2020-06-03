package files;

import java.io.File;

/**
 *
 * @author Roberto Garrido Trillo
 */
public class CreateFile04
{
   public static void main(String[] args)
   {

       File dir=new File("c:/");  
    File files[]=dir.listFiles();  
    for(File file:files){  
        System.out.println(file.getName()+" Can Write: "+file.canWrite()+
                " is Hidden: "+file.isHidden()+" Length: "+file.length()+" bytes");  
    }  
   }
}
