package Basic;

public class FinalKeyword {
    // Final keyword naming convention mostly UPPERCASE due to it's constant
//Final keyword.. after assigning a value we cannot assigned again new value
// once creating class using the final , we cannot create the subclasses or child classes which have the different behavior
//finalkeyword can be used with a variable(it can be loacl , Instance and class): but no reinitialization
//finalkwyword can be used with a method -> no overriding
// finalkeyword can be used with a class -> no inheritance..

        //Instance final...
        //one-way initializing
        //  final int x = 100;
        //another way initializing the final
//    final int x;
//    { x = 100}

        // another way of initializing of final the using  constructor
//    final int x;
//    FinalKeyword() {x = 100;}

        // static final int max = 100;
//    static final int max;
//    static {max=100;}

        public static void main(String[] args){
            //local finally varaible...
//      final int x;
//      x=100;
            // FinalKeyword f = new FinalKeyword();
            // System.out.println(f.x);
            //  System.out.println(max);

            final StringBuffer str = new StringBuffer("Prakash");
            str.append("is a good boy");
            str.append(" also he do's his work intime");
            System.out.println(str);
        }
    }


