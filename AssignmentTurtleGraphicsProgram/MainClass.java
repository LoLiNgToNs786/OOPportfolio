package AssignmentTurtleGraphicsProgram;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

import uk.ac.leedsbeckett.oop.OOPGraphics;

public class MainClass extends OOPGraphics
{

    public static void main(String[] args)
    {
        new MainClass(); //create instance of class (object) that extends OOPGraphics (could be separate class without main), gets out of static context

    }


    public MainClass()
    {
        JFrame MainFrame = new JFrame("Turtle Graphics Assignment");
        TurtleGraphics func = new TurtleGraphics();

        Container toplevelContainer = MainFrame.getContentPane();
        toplevelContainer.add(func);

        MainFrame.setLayout(new FlowLayout());
        MainFrame.pack();
        MainFrame.setSize(800, 600);
        MainFrame.setVisible(true);

        setPenColour(Color.red);
        penDown();

    }


    public void processCommand(String command)
    {


    }
}