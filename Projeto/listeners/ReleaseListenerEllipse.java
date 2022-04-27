package listeners;


import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import Panels.EllipsePanel;
import Panels.RectPanel;
import figures.Ellipse;
import figures.Rect;

public class ReleaseListenerEllipse extends MouseAdapter {
    private EllipsePanel ePanel;

    public ReleaseListenerEllipse(EllipsePanel ePanel){
        super();
        this.ePanel = ePanel;
    }

    public void mouseReleased(MouseEvent e) {
        ePanel.addEllipse(new Ellipse(e.getX(), e.getY(), 24, 24));
    }
}
