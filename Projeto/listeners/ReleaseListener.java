package listeners;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import Panels.EllipsePanel;
import Panels.RectPanel;
import figures.Ellipse;
import figures.Rect;

public class ReleaseListener extends MouseAdapter{

    private final RectPanel panel;
    private final EllipsePanel ePanel;

    public ReleaseListener(Builder builder){
        this.panel = builder.panel;
        this.ePanel = builder.ePanel;
    }
    
    public static class Builder {
    	private RectPanel panel;
    	private EllipsePanel ePanel;
    	
    	public Builder panel(RectPanel panel) {
    		this.panel = panel;
    		return this;
    	}
    	
    	public Builder ePanel(EllipsePanel ePanel) {
    		this.ePanel = ePanel;
    		return this;
    	}
    	
    	public ReleaseListener build() {
    		return new ReleaseListener(this);
    	}
    }
    
    public void mouseReleased(MouseEvent e) {
    	//if(e.equals(getPanel())) {
    	//	getPanel().addRect(new Rect(e.getX(), e.getY(), 24, 24));
    	//} else{
    	//	ePanel.addEllipse(new Ellipse(e.getX(), e.getY(), 24, 24));
    	//}
    	System.out.println(getPanel());
    	//getPanel().addRect(new Rect(e.getX(), e.getY(), 24, 24));
    	System.out.println(getePanel());
    	
        
    }

	public RectPanel getPanel() {
		return panel;
	}
	
	public EllipsePanel getePanel() {
		return ePanel;
	}

}