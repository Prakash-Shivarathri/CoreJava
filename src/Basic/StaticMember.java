package Basic;

import java.security.PrivateKey;

// static variables which are shared among all the objects of class

//Static member can be accessed without creating an object..
//Static methods cannot access non- static members..
//Non-static methods can access static members...
//Static methods do not have access to this reference..
public class StaticMember {
   String name;
   int id;
    private static int playerCount = 0;
    StaticMember(String name){
        this.name = name;
        id = ++playerCount;
    }
//    void printDetails(){
//        System.out.println(id+" "+name);
//    }
    static int getPlayerCount(){
        return playerCount;
    }
    public static void main(String [] agrs){
//        StaticMember s= new StaticMember("abc");
//        StaticMember s1 = new StaticMember("abcd");
//        s.printDetails();
//        s1.printDetails();
//        System.out.println(StaticMember.playerCount);

        System.out.println(StaticMember.getPlayerCount()); //  it will be print the 0 because the we have not initialize the object...
       StaticMember s3 = new StaticMember("abdjf");
       System.out.println(StaticMember.getPlayerCount()); // it will print the 1
    }
}
