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

public class Sec5_1_2 extends Applet implements ActionListener {
	private static final long serialVersionUID = 1L;

	//テキストフィールドの宣言
	TextField tf;
	//配列の宣言と領域の確保
	int[] a = { 5, 4, 6, 7, -5, -4, 2 };

	//init メソッド
	public void init() {
		//テキストフィールドをアプレットに追加
		add(new Label("どのデータを削除しますか？"));
		tf = new TextField("", 4);
		add(tf);
		//Enterキー押下時にイベントが発生するよう、アクションリスナーに登録
		tf.addActionListener(this);
	}
	
	//更新後のデータを入力し、Enter押下で実行
	public void actionPerformed(ActionEvent e) {
		try {
			//テキストフィールドのデータを整数型に変換
			int x = Integer.parseInt(tf.getText());
			//データの探索
			for(int i = 0, count = a.length; i < count; i++) {
				if(a[i] == x) {
					//右の要素を一つずつ左にずらして埋める
					for(int j = i; count < j; j++) {
						a[j] = a[j + 1];
					}
					break;
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
