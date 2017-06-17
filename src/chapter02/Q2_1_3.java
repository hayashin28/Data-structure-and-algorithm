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

public class Q2_1_3 extends Applet implements ActionListener {
	private static final long serialVersionUID = 1L;

	//テキストフィールドの宣言
	TextField fin, fout;
	//配列ｃの宣言と領域の確保
	int[] c = new int[101];
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
		
		//配列ｃの初期化
		for (int i = 0; i < c.length; i++) { c[i] = 0; }
	}
	
	//テキストフィールドで Enter が押された場合の処理
	public void actionPerformed(ActionEvent e) {
		try {
			//データ入力
			int x = Integer.parseInt(fin.getText());
			//入力データが１〜Ｎでなければ終了
			if (x < 1 || N < x) { System.exit(0); }
			//配列ｃの値を出力
			fout.setText(c[x] + "個");
			//配列ｃの値に１を加算
			c[x]++;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
