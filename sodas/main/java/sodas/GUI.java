package sodas;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class GUI {
	public static void zaproponuj(JFrame frame ,  String text){
		String message = "Proponujemy \n" + text;
		
		JOptionPane.showMessageDialog(frame, message);
	}
	
	public static String zapytaj(JFrame frame, String pytanie , String[] options ) {
        //String[] options = pytanie.getOdpowiedzi();

       int n = JOptionPane.showOptionDialog(frame,
                                            pytanie,
                                            "",
                                            JOptionPane.YES_NO_OPTION,
                                            JOptionPane.QUESTION_MESSAGE,
                                            null,
                                            options,
                                            options[0]);

      return  options[n];
}

}
