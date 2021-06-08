/* class Example {
   static int sum(int a,int b = 5) {
      int c = a+b;
      return c;
   } 
    
   static void main(String[] args) {
      println(sum(6));
   } 
} */

// Instant method

/*class Example { 
   int x; 
    
   public int getX() { 
      return x; 
   } 
    
   public void setX(int pX) { 
      x = pX; 
   } 
    
   static void main(String[] args) { 
      Example ex = new Example(); 
      ex.setX(100); 
      println(ex.getX()); 
   } 
}*/

// "this" keyword in groovy it refers the variable in current method or constructor

class Example { 
   int x = 100; 
    
   public int getX() { 
      this.x = 200; 
      return x; 
   } 
    
   static void main(String[] args) {
      Example ex = new Example(); 
      println(ex.getX());
   }
}