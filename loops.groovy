class Example {
   static void main(String[] args) {
        int count = 0;
    
        while(count<5) {
           println(count);
           count++;
        }
        println("\n")
        for (int i = 0; i <3;i++) {
            println(i)
        }
        println("\n")
        for (int i in 5..10) {
            println(i)
        }
   }
}
