package listeners;


import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import Panels.EllipsePanel;
import figures.Ellipse;


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
