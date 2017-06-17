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
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * 第２章　データ構造とアルゴリズムとは
 * 演習問題
 * 問１　階乗を求めるアルゴリズムを考察せよ
 * @author hayashin
 *
 */
public class Factorial extends Applet implements ActionListener {

	private static final long serialVersionUID = 1L;

	TextField input;
	TextField output;
	
	public void init() {
		input  = new TextField("", 2);
		output = new TextField("", 9);
		/**
		 * 入力エリアにアクションリスナーを登録
		 */
		input.addActionListener(this);
		/**
		 * キーイベントを拾う無名クラス
		 */
		input.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				try {
					char c = e.getKeyChar();
					String s = String.valueOf(c);
					Integer.parseInt(s);
				} catch (NumberFormatException ex) {
					ex.printStackTrace();
				}
			}
		});
		
		output.setEnabled(false);
		add(input);
		add(output);
	}
	/**
	 * Enter キー押下時のイベントリスナー
	 */
	public void actionPerformed(ActionEvent e) {
		long num = calculation(Integer.parseInt(input.getText())); 
		output.setText(String.valueOf(num));
	}
	/**
	 * 階乗演算メソッド
	 * @param n
	 * @return
	 */
	public long calculation(int n) {
		
		if (1 < n) {
			/**
			 * 下限値になるまで再帰処理を行う
			 */
			return n * calculation(n - 1);
		} else {
			return 1;		
		}
	}
}
