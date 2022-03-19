package wps.srohter.SP;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;

import javax.swing.border.Border;
/* 
    Source - https://stackhowto.com/how-to-create-rounded-jbutton-in-java/ 
 */
class RoundButtons implements Border {
	 private int r;
	    RoundButtons(int r) {
	        this.r = r;
	    }
	    public Insets getBorderInsets(Component c) {
	        return new Insets(this.r+1, this.r+1, this.r+2, this.r);
	    }
	    public boolean isBorderOpaque() {
	        return true;
	    }
	    public void paintBorder(Component c, Graphics g, int x, int y, 
	    int width, int height) {
	        g.drawRoundRect(x, y, width-1, height-1, r, r);
	    }
}
