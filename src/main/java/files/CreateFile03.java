/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package files;

import java.io.File;

/**
 *
 * @author Roberto Garrido Trillo
 */
public class CreateFile03
{

   public static void main(String[] args)
   {

      File f = new File("c:/");
      /* The method returns array of files and directories in 
      the directory denoted by this abstract pathname. */
      String[] filenames = f.list();
      for (String filename : filenames)
      {
         System.out.println(filename);
      }
   }
}
