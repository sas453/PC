package com.sas.pc.swing;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JDesktopPane;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JToolBar;

/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class MainWindow extends JFrame {
	private JDesktopPane jDesktopPane1;
	private JScrollPane jScrollPane1;
	private JButton jButton1;
	private JPanel jPanel1;
	private JToolBar jToolBar1;
	private JSplitPane jSplitPane1;
	private JInternalFrame jInternalFrame2;
	private JInternalFrame jInternalFrame1;
	
	public MainWindow(final String s) {
		initGUI();
	}

	private void initGUI() {
		try {
			{
				jPanel1 = new JPanel();
				getContentPane().add(jPanel1, BorderLayout.CENTER);
				{
					jToolBar1 = new JToolBar();
					jPanel1.add(jToolBar1);
					jToolBar1.setPreferredSize(new java.awt.Dimension(569, 28));
					{
						jButton1 = new JButton();
						jToolBar1.add(jButton1);
						jButton1.setText("jButton1");
						
						
					}
				}
			}
			{
				this.setSize(591, 243);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
