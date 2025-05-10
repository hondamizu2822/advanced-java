package sample;

public class ExceptionSample2 {
    public static void main(String[] args) {
        System.out.println("プログラム開始");

        try{
        Class.forName("java.lang.NotExistClass");//←ここでコンパイルエラー
        System.out.println("例外が発生しませんでした");
        } catch(ClassNotFoundException e) {
            e.printStackTrace();
         System.out.println("例外が発⽣しました");
        }
            
            
        
        System.out.println("プログラム終了");
    }

}

