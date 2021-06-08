// Getters and setters

/* class Student {
   private int StudentID;
   private String StudentName;
    
   void setStudentID(int pID) {
      StudentID = pID;
   }
    
   void setStudentName(String pName) {
      StudentName = pName;
   }
    
   int getStudentID() {
      return this.StudentID;
   }
    
   String getStudentName() {
      return this.StudentName;
   }
    
   static void main(String[] args) {
      Student st = new Student();
      st.setStudentID(1);
      st.setStudentName("Joe");
        
      println(st.getStudentID());
      println(st.getStudentName());
   } 
} */

// Using Instnace method

/* class Student {
   int StudentID;
   String StudentName;
    
   int Marks1;
   int Marks2;
   int Marks3;
    
   int Total() {
      return Marks1+Marks2+Marks3;
   }
    
   static void main(String[] args) {
      Student st = new Student();
      st.StudentID = 1;
      st.StudentName="Joe";
        
      st.Marks1 = 10;
      st.Marks2 = 20;
      st.Marks3 = 30;
        
      println(st.Total());
   }
} */

// Class inheritance

class Example {
   static void main(String[] args) {
      Student st = new Student();
      st.StudentID = 1;
        
      st.Marks1 = 10;
      st.name = "Joe";
        
      println(st.name);
   }
} 

class Person {
   public String name;
   public Person() {}  
} 

class Student extends Person {
   int StudentID
   int Marks1;
    
   public Student() {
      super();
   } 
}   