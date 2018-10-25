import javax.swing.JFrame;
import javax.swing.JPanel;

import MenuInicial.JPanellMenu;

public class MainGUI extends JFrame
{
	//· UID ·//
		private static final long serialVersionUID = 1L;

	//· SUBPANELLS ·//
		private JPanel m_panellPrincipal;
	
	//· CARACTERISTIQUES ·//
		private final int m_midaX = 1000;
		private final int m_midaY = 750;
	
	public MainGUI()
	{
		// CARACTERISTIQUES //
			setTitle("SGBD - Pedra Paper Tisores 0.1");
			setSize(m_midaX,m_midaY);
			setResizable(false);
			setLayout(null);
		
		// PANELL //
			m_panellPrincipal = new JPanellMenu(m_midaX,m_midaY);
			add(m_panellPrincipal);
		
		m_panellPrincipal.setVisible(true);
	}
	
}
