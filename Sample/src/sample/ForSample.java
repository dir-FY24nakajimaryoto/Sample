package sample;


public class ForSample {

    public static void main(String[] args) {
//        for (var i = 1; i <= 10; i++) {
//            System.out.println(i);
//        }
        
//        for ( int i = 1; i <= 20; i++) {
//            if (i % 2 != 0) { // あまりが出た場合=奇数
//                // 現在の処理をスキップし、次の繰り返しに進む
//                continue;
//            }
//            System.out.println(i);
//        }
        
        // 拡張for文
        var numbers = new int[] {1,2,3,4,5};
        
        for(var number : numbers) {
            System.out.println(number);
        }
    }

}
