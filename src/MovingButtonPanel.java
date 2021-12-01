import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MovingButtonPanel extends JPanel implements KeyListener, MouseMotionListener {
    private MovingButton movingButton;
    private JButton resetButton;
    private char option;
    private int x = 200;
    private int y = 200;
    private MainWindow mainWindow;

    public MovingButtonPanel(MainWindow mainWindow){
        this.mainWindow = mainWindow;
        setSize(600,600);
        setVisible(true);
        movingButton = new MovingButton();
        add(movingButton);
        resetButton=new JButton("Reset");
        resetButton.setSize(100,100);
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                option = 'r';
                revalidate();
            }
        });
        add(resetButton);
        addKeyListener(this);
        addMouseMotionListener(this);
        setFocusable(true);

    }
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        if(e.getKeyChar() == 'k'){
            option = 'k';
            repaint();
        } else if (e.getKeyChar() == 'o') {
            option = 'o';
            repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        requestFocusInWindow();
        x=e.getX();
        y=e.getY();
        repaint();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (option == 'k') {
            g.setColor(Color.blue);
            g.fillRect(x, y, 20, 20);
            g.drawRect(x, y, 20, 20);
        } else if(option == 'o'){
            g.setColor(Color.RED);
            g.fillOval(x, y, 20, 20);
            g.drawOval(x, y, 20, 20);
        }
        }

    }

