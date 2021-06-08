class Example { 
   static void main(String[] args) {
        def text = """ 
                This text contains some numbers like 1024
                or 256. Some of them are odd (like 3) or
                even (like 2).
                """
        def result = (text =~ /\d+/).findAll()
        println(result)
   }
}