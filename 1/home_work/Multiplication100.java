import java.util.Scanner;

public class StandardInput {
    public static void main(String[] args) {
        // 入力の宣言
        System.out.println("整数値を入力してください");

        // 標準入力をScannerで取得する
        Scanner in = new Scanner(System.in);

        // nextLine()メソッドは、キーボードからReturnキーの入力があるまで待ち、入力された1行を返す
        String inputLine = in.nextLine();
        // ↑inputLineという変数には、入力された文字列データが設定されています

        // 変数numに文字列データを整数値に変換して格納
        int num = Integer.parseInt(inputLine);
        // 100倍する
        num *= 100;

        // 出力
        System.out.printf("計算結果：%d\n",num);

        // Scannerを閉じる
        in.close();
    }
}
