import javax.swing.SwingUtilities;
public class SmileTherapy {
	public static void main (String[] args) throws Exception{
		SwingUtilities.invokeLater(new Runnable(){
			@Override
			public void run() {
				new Gui();
				}
			});
		MyTimer myTimer = new MyTimer(10000,300000);
        myTimer.startTimer();
		//new Folder1(args[0]);
        new Gui();
		}
}