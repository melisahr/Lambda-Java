public class Main {
    public static void main(String[] args) {

       //Lambda expression = a shorter way to write anonymous classes with only one method
            //Can be used any place where a functional interface is required

        //Pass in arguments
            String name = "Joe";//x value
            char symbol = '!';//y value

        //Instance of Interface and lambda expression
        MyInterface myInterface = (x,y) -> {
            //System.out.println("Hello World");
            System.out.println("It is a long day " +x+y);
        };

        //Created another Interface
        MyInterface myInterface2 =(x,y) ->{
            System.out.println("Hello " +x+y);
        };

                //Call the function
        myInterface.message(name, symbol);
        myInterface2.message(name,symbol);

        //Instance Frame
        MyFrame myFrame = new MyFrame();

        }
    }
