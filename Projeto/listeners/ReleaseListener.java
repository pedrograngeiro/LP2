package listeners;


import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import Panels.RectPanel;


import figures.Rect;

public class ReleaseListener extends MouseAdapter{
    private RectPanel panel;

    public ReleaseListener(RectPanel panel){
        super();
        this.panel = panel;
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        panel.addRect(new Rect(e.getX(), e.getY(), 24, 24));
    }

    // new KeyAdapter() {
    //     public void keyPressed (KeyEvent evt){
    //         panel.addRect(new Rect(evt.getX(), evt.getY() , 24, 24));
    //     }
    // }
}

