package com.example; // パッケージの統一を確認

/**
 * `Main` クラスは、プログラムのエントリーポイント
 * `DrawingApp` を呼び出して、全ての図形を描画する
 */
public class Main {

	public static void main(String[] args) {

		try {

			DrawingApp.main(args); // `DrawingApp` の `main` メソッドを実行

		} catch (Exception e) {

			System.err.println("エラーが発生しました: " + e.getMessage());

			e.printStackTrace(); // 詳細なエラー情報を出力
		}
	}
}
