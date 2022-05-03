package Panels;

import java.util.LinkedList;
import java.util.List;
import javax.swing.JPanel;
import java.awt.Graphics;

import figures.Ellipse;

public class EllipsePanel extends JPanel {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Ellipse> ellipses = new LinkedList<Ellipse>();

    public void addEllipse(Ellipse ellipse){
        ellipses.add(ellipse);
        this.repaint();
    }

    @Override
    public void paint(Graphics g) {
        for (Ellipse e : ellipses) {
            e.paint(g);
        }
    }
}
