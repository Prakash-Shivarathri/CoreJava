package Basic;

//Object Oriented Programming...
//oop is the way to write a code
// Procedural programming having the multiple functions and these func call each other...
// for example if the software goes relatively bigger and if it has multiple entities, which are talking to each other
// the functional programming , may not be a good idea to it..
// consider the realtime example if i making the college software, there are entities like student,courses and teachers, i will read all data from a file or database
// storing a data i will creat array of student ,course and teachers, what i want to do on this data , i have to pass the array everywhere, which makes code really complex
// Object Oriented Programming is the way to divide and your requirements into multiple entities let know you more  i have student entity , i have the course entity,
// i have the teachers entity , i have made classes of this entities  and then i make objects of the entities , class is kind of data type, A student is a class for example,
// and the student have name prakash , prakash is called as object of this class, classes is unlike the primitive data types , we have the data and functions
public class ClassAndObject {
   int real , image;
   void PrintComplex(){
       System.out.println(real+"+i"+image);
   }
//This function is called as a Constructor , it is special function which is used to initialize objects of a class when create memeber or a variable of the class time you call that varible
 // as an object to initialize,, it has same name of the class is called constructor and it don't have the return type and they take the parameters which are used to initialize the members of the particular objects

   ClassAndObject(int r , int i){
       real = r;
       image = i;
   }
 // why we used ClassAndObject c is we are used add another complex number to this complex number..
   void add(ClassAndObject c){
       real = real+c.real;
       image = image+c.image;
   }

   public static void main(String[] args){
       // here we arer initializing the object using the class name..
       ClassAndObject a1 = new ClassAndObject(10,20);
       a1.PrintComplex();
       ClassAndObject a2 = new ClassAndObject(20,30);
       a1.add(a2);
       a1.PrintComplex();
   }
}
