package GUI;
import javax.swing.JFrame;
import javax.swing.JPanel;

import MenuInicial.JPanellMenu;

public class MainGUI extends JFrame
{
	//· UID ·//
		private static final long serialVersionUID = 1L;
	
	//· ME ·//
		private static MainGUI m_me = null;
		
	//· SUBPANELLS ·//
		private JPanel m_panellPrincipal;
	
	//· ID SUBPANELLS·//
		private final int MENU=1;
		
	//· CARACTERISTIQUES ·//
		private int m_midaX;
		private int m_midaY;
		
	
	private MainGUI()
	{
		// CARACTERISTIQUES //
			setTitle("Pedra Paper Tisores - 0.1");
			establirMida(1000, 750);
			setResizable(false);
			setLayout(null);
		
		
	}
	
	public static MainGUI getInstance()
	{
		if (m_me==null)
		{
			m_me = new MainGUI();
		}
		return m_me;
	}
	
	public void establirMida(int p_ample, int p_alt)
	{
		m_midaX = p_ample;
		m_midaY = p_alt;
		setSize(m_midaX,m_midaY);
	}
	
	public void activarPanell(int p_opcio)
	{
		// PANELL //
			m_panellPrincipal = new JPanellMenu();
			add(m_panellPrincipal);
		
			m_panellPrincipal.setVisible(true);
	}
	
}
