import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MovingButtonPanel extends JPanel implements KeyListener {
    private MovingButton movingButton;
    private JButton resetButton;

    public MovingButtonPanel(){
        addKeyListener(this);
        setSize(600,600);
        setVisible(true);
        movingButton = new MovingButton();
        add(movingButton);
        resetButton=new JButton("Reset");
        resetButton.setSize(100,100);
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                revalidate();
            }
        });
        add(resetButton);

    }

    @Override
    public void keyTyped(KeyEvent e) {
        requestFocus();
        if(e.getKeyChar() == 'K'){
            drawSquare();
        } else if(e.getKeyChar() == 'O'){

        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    public void drawSquare(){
        SquarePanel squarePanel = new SquarePanel();
    }
}
