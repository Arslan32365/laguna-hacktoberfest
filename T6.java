
public class T6{
    static int myMethod(int a, int b){
        return a+b;    
    }
    static int myMethod(int a, int b, int c){
        return a+b+c;    
    }
    static int myMethod(int a, int b, int c, int d){
        return a+b+c+d;    
    }
    
    public static void main(String[] args){
        System.out.println(myMethod(2,6));    
        System.out.println(myMethod(2,6,8));
        System.out.println(myMethod(2,6,8,1));
    }
}
