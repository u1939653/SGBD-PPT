import GUI.MainGUI;

public class Main 
{
	public static MainGUI m_gui;

	public static void main(String[] args) 
	{		
		m_gui = MainGUI.getInstance();
		m_gui.setEnabled(true);
		m_gui.setVisible(true);
		m_gui.activarPanell(1);
	}

}
