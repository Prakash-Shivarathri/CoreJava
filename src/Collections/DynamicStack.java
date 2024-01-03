package Collections;

public class DynamicStack extends CustomStack {

    public DynamicStack(){
        super(); // here super is used to call the parent class constructor which does not have the parameters;
    }
    // AND WE CAN PASS THE SIZE OF THE STACK...
    public DynamicStack(int size){
        super(size); // here it will call the parent class paramterized constructor...
    }

    // DynamicStack means in java when stack capacity is full then it will be double the size of the stack capacity as like arraylist...
    // so we need to override the parent class push method...
    @Override
    public boolean push(int item){
        if(this.isfull()){
            // just double the size of the stack
            // create temporary array
            int[] temp = new int[data.length * 2];

            // we need to copy  elements to temporary array
            for(int i = 0; i < data.length; i++){
                data[i] = temp[i];
            }
            data = temp;
        }
        // at this poin we know that array is not full
        // insert the item...
        return super.push(item);
    }


}
