package listeners;


import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import Panels.EllipsePanel;
import Panels.RectPanel;
import figures.Ellipse;
import figures.Rect;

public class ReleaseListener extends MouseAdapter{

    private RectPanel panel;

    public ReleaseListener(RectPanel panel){
        super();
        this.panel = panel;
        
    }    
    
    public void mouseReleased(MouseEvent e) {
        panel.addRect(new Rect(e.getX(), e.getY(), 24, 24));
    }

    

    
}

