class Example {
   static void main(String[] args) {
        int a = 10
        if (a<100) {
            println(" \"a\" value is less than 100 and its value is "+a)
        }
        int c = 500
        if (c<100) {
            println(" \"c\" value is less than 100 and its value is "+c)
        } else {
            println(" \"c\" value is greater than 100 and its value is "+c)
        }
    
        int b = 500
        if (b<100) {
            println(" \"b\" value is less than 100 and its value is "+b)
        } else if (b <600) {
            println(" \"b\" value is greater than 100 and less than 600 and its value is "+b)
        } else {
            println(" \"b\" value is greater than 600 and its value is "+b)
        }
    
        a = 2
        switch(a) {            
            case 1: 
                println("The value of a is One"); 
                break; 
            case 2: 
                println("The value of a is Two"); 
                break; 
            case 3: 
                println("The value of a is Three"); 
                break; 
            case 4: 
                println("The value of a is Four"); 
                break; 
            default: 
                println("The value is unknown"); 
                break; 
        } 

        // Nested switch
        int i = 0
        int j = 1
        switch(i) { 
            case 0: 
                // Next evaluating the value of variable j 
                switch(j) { 
                    case 0: 
                        println("i is 0, j is 0"); 
                        break; 
                    case 1: 
                        println("i is 0, j is 1"); 
                        break; 

                    // The default condition for the inner switch statement 
                    default: 
                    println("nested default case!!"); 
                } 
            break; 

            // The default condition for the outer switch statement 
            default: 
               println("No matching case found!!"); 
        }
   }
}