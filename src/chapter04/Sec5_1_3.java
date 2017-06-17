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

public class Sec5_1_3 extends Applet implements ActionListener {
	private static final long serialVersionUID = 1L;

	//２つのテキストフィールドの宣言
	TextField fbefore, fafter;
	//配列の宣言と領域の確保
	int[] a = { 5, 4, 6, 7, -5, -4, 2 };

	//init メソッド
	public void init() {
		//テキストフィールドをアプレットに追加
		add(new Label("どのデータの後ろに追加しますか？"));
		fbefore = new TextField("", 4);
		add(fbefore);
		//Enterキー押下時にイベントが発生するよう、アクションリスナーに登録
		add(new Label("挿入するデータの値は"));
		fafter = new TextField("", 4);
		
		fbefore.addActionListener(this);
		fafter.addActionListener(this);
	}
	
	//挿入するデータを入力し、Enter押下で実行
	public void actionPerformed(ActionEvent e) {
		try {
			//テキストフィールドのデータを整数型に変換
			int x = Integer.parseInt(fbefore.getText());
			int y = Integer.parseInt(fafter.getText());
	
			//データの探索
			for(int i = 0, count = a.length; i < count; i++) {
				if(a[i] == x) {
					//右の要素を一つずつ左にずらして埋める
					for(int j = i - 1; j > i + 1; j--) {
						a[j] = a[j - 1];
					}
					//挿入データを a[i + 1] に格納する。
					a[i + 1] = y;
					break;
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
