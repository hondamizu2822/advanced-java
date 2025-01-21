package sample;

public class Main1 {
    public static void main(String[] args) {
        try {
            method1();
        } catch (SomeException e) {
            
            e.printStackTrace();
        }
    }
    public static void method1()throws SomeException{
        throw new SomeException("何かしらのエラーが発生しました");//コンパイルエラーになる理由
        
    }
        
    

}
       

