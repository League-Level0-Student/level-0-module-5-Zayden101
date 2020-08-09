import javax.swing.JOptionPane;

public class pg {
public static void main(String[] args) {
	String e=JOptionPane.showInputDialog("choose a number");
	
	int num = Integer.parseInt(e);

	if(num==1) {
		
JOptionPane.showMessageDialog(null, "prime");
	}
	
	
for (int i = 2; i < 5; i++) {
	if(5%num==0) {
		
		JOptionPane.showMessageDialog(null, "not prime");
			}
}
	
	
	
	
	
}
}
