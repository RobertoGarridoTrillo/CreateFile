/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package files;

import java.io.*;

/**
 *
 * @author Roberto Garrido Trillo
 */
public class CreateFile
{

   public static void main(String[] args)
   {

      try
      {
         File file = new File("javaFile123.txt");
         if (file.createNewFile())
         {
            System.out.println("New File is created!");
         } else
         {
            System.out.println("File already exists.");
         }
      } catch (IOException e)
      {
         e.printStackTrace();
      }

   }
}

