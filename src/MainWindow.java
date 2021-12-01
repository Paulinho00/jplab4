import javax.swing.*;

public class MainWindow extends JFrame {
    private MovingButtonPanel movingButtonPanel;

    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainWindow window = new MainWindow();
                window.setSize(600,600);
                window.setVisible(true);
                window.add(new MovingButtonPanel() );
                window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });
    }
}
