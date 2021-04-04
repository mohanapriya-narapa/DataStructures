package leetcode;

public class duplicate extends javax.swing.JPanel {
	 
	   public void paintComponent(java.awt.Graphics g)
	   {
	      super.paintComponents(g);
	 
	      java.awt.Graphics2D g2d = (java.awt.Graphics2D)g;
	      
	      g2d.setColor(java.awt.Color.blue);
	      int yo[] = new int[] {66,150,233};
	      int zo[]= new int[] {150,270,150};
	      g2d.fillPolygon(yo,zo, 3); 
	      g2d.fillOval(65, 100, 95, 80);
	      g2d.fillOval(140, 100, 93, 80);
	      //Fill the rest in
	      //...
	 
	      g2d.setColor(java.awt.Color.white);
	      g2d.drawString("I Love You ", 120, 165);
	      g2d.setColor(java.awt.Color.white);
	      int a1[] = new int[] {120,120,180,180};
	      int b1[] = new int[] {180,200,200,180};
	      g2d.fillPolygon(a1,b1,4);
	      g2d.setColor(java.awt.Color.blue);
	      g2d.drawString("Mohana", 125,195);
	   }
	 
	 
	   public static void main(String[] args)
	   {
	      javax.swing.JFrame frame = new javax.swing.JFrame();
	 
	      frame.setDefaultCloseOperation(frame.DISPOSE_ON_CLOSE);
	 
	      int w = 300;
	      int h = 300;
	 
	      frame.setBounds(200,200,w,h);
	      frame.setVisible(true);
	      frame.getContentPane().setLayout(null);
	 
	      duplicate x = new duplicate();
	      x.setBounds(0,0,w,h);
	 
	      frame.getContentPane().add(x);
	   }
	}
