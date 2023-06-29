package OOPS;
// by default we can extends the object class to override methods equals
public class Student extends Object {
   private String name;
   
   private int age;
   
   public int hashCode() {
	 return this.age+this.name.hashCode();
   }
  
   // our task to override the equals method
   
   @Override
   public boolean equals(Object obj) {
      // first condition
	   if(obj == this) {
		   return true;
	   }
	   
	   // second condition
	   if(!(obj instanceof Student)) {
		   return false;
	   }
	   // third condition
	   Student student = (Student) obj;
	   if(this.name == student.name && this.age == student.age) {
		   return true;
	   }return false;
	   
   }
   
   public Student(String name, int age) {
	   this.name=name;
	   this.age=age;
   }
   
   public static void main(String[] args) {
	   Student s1 = new Student("John", 32);
	   Student s2 = new Student("John", 32);
	   Student s3 = new Student("Johnae", 22);

//	   System.out.println(s1.hashCode());
//	   System.out.println(s1.hashCode());
//
//     System.out.println(s2.equals(s1));
     System.out.println(s1.equals(s3));

   }
   
}

//hashcode
//equals

// by default
// hashcoded -> generated -> location
