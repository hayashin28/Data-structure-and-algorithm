/**
 *Javaアプレットで学ぶ
  * データ構造とアルゴリズム
 * @author 荒井正之
 */

package chapter04;

import java.applet.Applet;
import java.awt.Graphics;

public class Example02 extends Applet {

	private static final long serialVersionUID = 1L;
	
	//フィールド
	//身長を格納する配列
	double[] height = { 175.2, 170.5, 167.9, 180.0, 172.7 };
	//体重を格納する配列の宣言
	double[] weight = {  75.2,  56.5,  67.2,  91.0,  78.3 };
	
	//printメソッド
	@Override
	public void paint(Graphics g) {
		//身長の最大値求める
		double maxValue = maxArray(height);
		//身長の最大値を表示
		
		
		
	}

	double maxArray(double[] data) {
		//
		//
		return 0;
	}
	
}
