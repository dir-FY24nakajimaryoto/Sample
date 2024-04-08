package sample;

public class ExceptionExample2 {

    public static void main(String[] args) {

        System.out.println("処理開始");
        
        try {
            // ここに例外
            System.out.println("割り算開始");
            int a = divide(10,0);
            System.out.println(a);
        } catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println("ArithmeticException Exception caught: " + e.getMessage());
        } finally {
            // 例外の有無にかかわらず実行
            System.out.println("割り算終了");
        }
        
        System.out.println("処理終了");
    }
    
    public static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            // 0で除算を試みた場合、Arithmetic Exeptionを投げる
            throw new ArithmeticException("ゼロ除算");
        }
        return a / b;
    }

}
