/**
 *Javaアプレットで学ぶ
  * データ構造とアルゴリズム
 * @author 荒井正之
 */

package chapter02;

import java.applet.Applet;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Q2_1_1 extends Applet implements ActionListener {
	private static final long serialVersionUID = 1L;

	//テキストフィールドの宣言
	TextField fin, fout;
	//配列の宣言と領域の確保
	int[] s = new int[100];
	int t = 0;
	final int N = 100;

	//init メソッド
	public void init() {
		//入力用のテキストフィールドの生成と登録
		fin = new TextField("", 6);
		//アプレットへの登録
		add(fin);
		//Enter が押されたらイベントが発生するようにアクションリスナーに登録
		fin.addActionListener(this);
		
		//出力用のテキストフィールドを６桁で登録
		fout = new TextField("", 6);
		//出力用のテキストフィールドへの入力を不可にする
		fout.setEnabled(false);
		//アプレットへの登録
		add(fout);
	}
	
	//テキストフィールドで Enter が押された場合の処理
	public void actionPerformed(ActionEvent e) {
		try {
			//データ入力
			int x = Integer.parseInt(fin.getText());
			//入力データが１〜Ｎでなければ終了
			if (x < 1 || N < x) { System.exit(0); }
			
			//ｍは過去何度入力されたかカウントする変数
			int m = 0;
			//入力したデータの数ｔだけ繰り返す
			for (int i = 0; i < t; i++) {
				//配列の値がｘと同じであればｍに一つ追加
				if (s[i] == x) { m++; }
			}
			//ｍの出力
			fout.setText(m + "個");
			//入力データｘをｓ[]に格納する
			s[t] = x;
			//ｔのインクリメント
			t++;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
