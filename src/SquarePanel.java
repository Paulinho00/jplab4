import javax.swing.*;
import java.awt.*;

public class SquarePanel extends JPanel {

    @Override
    protected void printComponent(Graphics g){
        super.printComponent(g);
        g.setColor(Color.BLUE);
        g.fillOval(250,300,20,20);


    }
}
