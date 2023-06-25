package Basic;

// this key is used for the referrence the objects current code executed..

import LambdaExamples.Points;

public class ThisReferrence {
    int x , y;
    // one more advantage of using the this keyword is
    // when we are initializing the same name variable in in constructor
    // local variables having the  same name of instance var it will be overriden by using the this key
    // if not used local var removes the instance vars from the class and if we want acces the instance var we need to use this keyword..

    ThisReferrence(int x, int y){
       this.x=x;
       this.y=y;
    }
    void print(){
        System.out.println(x+" "+y);
    }
// And also this keyword is used to set values
    ThisReferrence setX(int X){
        this.x=X;
        return this;
    }
    ThisReferrence setY(int Y){
        this.y=Y;
        return this;
    }
    public static void main(String[] args){
        ThisReferrence T =  new ThisReferrence(10,20);
        T.print();
        ThisReferrence T1= new ThisReferrence(20, 30);
        T.setX(100).setY(200);
        T.print();
    }
}
