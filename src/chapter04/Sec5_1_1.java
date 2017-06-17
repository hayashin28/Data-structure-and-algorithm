/**
 *Javaアプレットで学ぶ
  * データ構造とアルゴリズム
 * @author 荒井正之
 */

package chapter04;

import java.applet.Applet;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sec5_1_1 extends Applet implements ActionListener {
	private static final long serialVersionUID = 1L;

	//変更前後のデータを入力するテキストフィールド
	TextField fbefore, fafter;
	//配列の宣言と領域の確保
	int[] a = { 5, 4, 6, 7, -5, -4, 2 };

	//init メソッド
	public void init() {
		//更新するデータ入力用のテキストフィールドをアプレットに追加
		add(new Label("どのデータを更新しますか？"));
		fbefore = new TextField("", 4);
		add(fbefore);
		//更新後のデータを入力するテキストフィールドをアプレットに追加
		add(new Label("更新後の値は "));
		fafter = new TextField("", 4);
		add(fafter);
		fafter.addActionListener(this);
	}
	
	//更新後のデータを入力し、Enter押下で実行
	public void actionPerformed(ActionEvent e) {
		try {
			//更新するデータをテキストフィールドから入力して、整数型に変換
			int x = Integer.parseInt(fbefore.getText());
			//更新後のデータをテキストフィールドから入力して、整数型に変換
			int y = Integer.parseInt(fafter.getText());
			//データを探索し、データが見つかったら更新する
			for(int i = 0, count = a.length; i < count; i++) {
				if(a[i] == x) {
					a[i] = y;
					//更新処理が終わったのでループを抜ける
					break;
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
