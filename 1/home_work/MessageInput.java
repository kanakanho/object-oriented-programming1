import java.util.Scanner;

public class StandardInput {
    public static void main(String[] args) {
        // 入力の宣言
        System.out.println("こんにちは、メッセージをどうぞ");

        // 標準入力をScannerで取得する
        Scanner in = new Scanner(System.in);

        // nextLine()メソッドは、キーボードからReturnキーの入力があるまで待ち、入力された1行を返す
        String inputLine = in.nextLine();
        // ↑inputLineという変数には、入力された文字列データが設定されています

        // 出力
        System.out.println("----");
        System.out.println(inputLine);
        System.out.println("----");

        // Scannerを閉じる
        in.close();
    }
}
