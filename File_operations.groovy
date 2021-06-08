import java.io.File 

// Creating a new file and writing into it
/*class Example { 
   static void main(String[] args) { 
      new File('.','Example.txt').withWriter('utf-8') { 
         writer -> writer.writeLine 'Hello World' 
      }  
   } 
}*/

// Reading the  contents of existing file and adding it
/* import java.io.File 
class Example { 
   static void main(String[] args) { 
      File file1 = new File('.',"Example.txt")
      String output = file1.text+'Dream'
      File file = new File('.','Example.txt').withWriter('utf-8') {
         writer -> writer.writeLine (output)
      }
   } 
} */