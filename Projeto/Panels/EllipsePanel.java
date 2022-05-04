package Panels;

import java.util.LinkedList;
import java.util.List;
import javax.swing.JPanel;
import java.awt.Graphics;

import figures.Ellipse;
import figures.Figure;

public class EllipsePanel extends JPanel {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Figure> ellipses = new LinkedList<Figure>();

    public void addEllipse(Ellipse ellipse){
        ellipses.add(ellipse);
        this.repaint();
    }

    @Override
    public void paint(Graphics g) {
        for (Figure e : ellipses) {
            e.paint(g);
        }
    }
}
