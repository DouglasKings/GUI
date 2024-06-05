import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        String Name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello " + Name);

        int Age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "You are "+ Age +" years old");

        double Height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
        JOptionPane.showMessageDialog(null, "You are "+ Height +" cm");

        String Hobby = JOptionPane.showInputDialog("Enter your favourite hobby");
        JOptionPane.showMessageDialog(null, "Your favourite hobby is " + Hobby);

    }
}