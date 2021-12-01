import javax.swing.*;

public class MainWindow extends JFrame{
    protected MovingButtonPanel movingButtonPanel;

    public MainWindow(){
        setSize(600,600);
        setVisible(true);
        movingButtonPanel = new MovingButtonPanel(this);
        add(movingButtonPanel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainWindow window = new MainWindow();

            }
        });
    }
}
