package Panels;

import java.util.LinkedList;
import java.util.List;
import javax.swing.JPanel;
import java.awt.Graphics;

import figures.Figure;
import figures.Rect;

public class RectPanel extends JPanel{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Figure> rects = new LinkedList<Figure>();

    public void addRect(Rect rect){
        rects.add(rect);
        this.repaint();
    }

    @Override
    public void paint(Graphics g) {
        for (Figure r : rects) {
            r.paint(g);
        }
    }
}
