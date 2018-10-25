package MenuInicial;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class JPanellMenu extends JPanel
{
	//· UID ·//
		private static final long serialVersionUID = 1L;
	
	//· CARACTERISTIQUES ·//
		private int m_midaX;
		private int m_midaY;
	
	//· COMPONENTS ·//
		private JLabel m_jlTitol;
		
	//· COLORS ·//
		private final Color c_fons = new Color(250,250,250);
		private final Color c_barraSup = new Color(240,240,240); 
	
	public JPanellMenu(int p_midaX, int p_midaY)
	{
		// CARACTERISTIQUES //
		m_midaX = p_midaX;
		m_midaY = p_midaY;
		setSize(m_midaX,m_midaY);
		setBackground(c_fons);
		setLayout(null);
		
		// COMPONENTS //
		m_jlTitol = new JLabel("Pedra Paper Tisores", SwingConstants.CENTER);
		m_jlTitol.setBounds(0,0,m_midaX,30);
		m_jlTitol.setBackground(c_barraSup);
		m_jlTitol.setOpaque(true);
		m_jlTitol.setVisible(true);
		add(m_jlTitol);	
		
	}

}
