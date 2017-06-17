/**
 *Javaアプレットで学ぶ
  * データ構造とアルゴリズム
 * @author 荒井正之
 */

package chapter01;

import java.applet.Applet;
import java.awt.Graphics;

public class MyFirstApplet extends Applet {
	private static final long serialVersionUID = 1L;

	public void paint (Graphics g) {
		g.drawRect(60, 30, 70, 90);
	}
}
