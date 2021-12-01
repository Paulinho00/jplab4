import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.Random;

public class MovingButton extends JButton implements MouseMotionListener {

    public MovingButton(){
        setText("Przycisk");
        setSize(100,100);
        setVisible(true);
        addMouseMotionListener(this);
    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        Random random = new Random();
        if(e.getX() < 70) {
            int x = random.nextInt(201) + 100;
            int y = random.nextInt(101);
            setLocation(x,y);
        }

    }
}
