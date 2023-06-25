package Basic;
// Constructor are special fucntion whixh are called when an object is created..
//This function is called as a Constructor , it is special function which is used to initialize objects of a class when create memeber or a variable of the class time you call that varible
// as an object to initialize,, it has same name of the class is called constructor and it don't have the return type and they take the parameters which are used to initialize the members of the particular objects

// see when we are not create the constructor by default compile create the default Constructor which initialize the member , the memebers with some default values for if you have primitive type members like int , boolean
// t will be initialize the 0 and if you have non-primitive type data  like reference of the classes they are inilize with null
public class Constructor {
    int x, y;
        Constructor(int a , int b){
            x=a;
            y=b;
        }
    void print(){
        System.out.println(x+" "+y);
    }
    public static void main(String[] args){
      Constructor c = new Constructor(10,20);
      c.print();
//        Constructor c1 = new Constructor();
//        c1.print();
    }
}
