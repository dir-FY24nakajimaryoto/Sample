package sample;

public class IfSample {

    public static void main(String[] args) {
        var score = 100; // 成績

        if (score == 100) {
            System.out.println("満点です！");
        } else if (score >= 80) {
            System.out.println("よくできました！");
        } else if (score >= 60) {
            System.out.println("合格です！");
        } else {
            System.out.println("赤点です。。。");
        }
    }

}
