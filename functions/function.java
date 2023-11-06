package functions;

public class function {
    public static void main(String args[]){
        int a = 5;
        int b = 10;
        callByValue(a, b);
    }
// this is an example of callByValue [only a copy of value is passed to other function] 
    public static void callByValue(int a, int b){
        int temp = a;
        a=b;
        b=temp;
        System.out.println(a + " " + b);
    }


}

