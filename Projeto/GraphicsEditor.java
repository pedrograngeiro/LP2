import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import Panels.EllipsePanel;
import Panels.RectPanel;

import java.util.ArrayList;
import java.util.Random;

import figures.*;
import listeners.ClickListener;
import listeners.ReleaseListener;
import listeners.ReleaseListenerEllipse;


class GraphicsEditor {
    public static void main (String[] args) {
        ListFrame frame = new ListFrame();
        frame.setVisible(true);
    }
}

class ListFrame extends JFrame {
    ArrayList<Figure> figs = new ArrayList<Figure>();
    Random rand = new Random();
    String figuraSelecionada;
    ListFrame () {
        this.addWindowListener (
            new WindowAdapter() {
                public void windowClosing (WindowEvent e) {
                    System.exit(0);
                }
            }
        );

        this.addKeyListener (
            new KeyAdapter() {
                public void keyPressed (KeyEvent evt) {
                    
                    if (evt.getKeyChar() == 'r') {
                        figuraSelecionada = "rect";
                    }

                    if (evt.getKeyChar() == 'e') {
                        figuraSelecionada = "ellipse";
                    }

                    if (figuraSelecionada == "rect") {
                        RectPanel panel = new RectPanel();
                        setContentPane(panel);
                        panel.setSize(350, 350);
                        panel.addMouseListener(new ReleaseListener(panel));
                    }

                    if (figuraSelecionada == "ellipse") {
                        EllipsePanel ePanel = new EllipsePanel();
                        setContentPane(ePanel);
                        ePanel.setSize(350, 350);
                        ePanel.addMouseListener(new ReleaseListenerEllipse(ePanel));
                    }
                }
            }
        );
        
        this.setTitle("Graphics");
        this.setSize(350, 350);

    }

    public void paint (Graphics g) {
        super.paint(g);
        for (Figure fig: this.figs) {
            fig.paint(g);
        }
    }
}