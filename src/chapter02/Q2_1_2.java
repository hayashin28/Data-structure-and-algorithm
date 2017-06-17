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

public class Q2_1_2 extends Applet implements ActionListener {
	private static final long serialVersionUID = 1L;

	//テキストフィールドの宣言
	TextField fin, fout;
	//配列ｆとｓの宣言と領域の確保
	int[] f = new int[100];
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
			
			//配列ｓに入力データと同じ数が登録されているか探索
			int i;
			for (i = 0; i < t; i++) {
				//入力値ｘと同じ値が格納されている要素番号でループを抜ける
				if (s[i] == x) { break; }
			}
			
			
			//配列ｓに入力したデータと同じ数がある場合の処理
			if (i < t && s[i] == x) {
				//配列ｆのデータを出力する
				fout.setText(f[i] + "個");
				//配列ｆに１を加算する
				f[i]++;
			}
			//配列ｓに入力したデータと同じ数がない場合の処理
			else {
				fout.setText("0個");
				s[t] = x; f[t] = 1;
				//ｔのインクリメント
				t++;
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
