package AssignmentTurtleGraphicsProgram;
import uk.ac.leedsbeckett.oop.OOPGraphics;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.io.BufferedWriter;

public class TurtleGraphics extends OOPGraphics
{

    private ArrayList<String> savetxtfile = new ArrayList<>();

    public TurtleGraphics()
    {
        setPenColour(Color.red);
        penDown();

    }


    public static void main(String[] args)
    {
        new TurtleGraphics();

    }


    public void processCommand(String command)
    {
        String[] sut;
        int paramInt;

        sut = command.split(" ");
        command = sut[0];

        ArrayList<String> commandlst = new ArrayList<>();

        commandlst.add("about");
        commandlst.add("clear");
        commandlst.add("backward");
        commandlst.add("forward");
        commandlst.add("turnleft");
        commandlst.add("turnright");
        commandlst.add("green");
        commandlst.add("red");
        commandlst.add("white");
        commandlst.add("blue");
        commandlst.add("reset");
        commandlst.add("penup");
        commandlst.add("pendown");
        commandlst.add("savecmd");
        commandlst.add("saveimg");


        boolean ans = commandlst.contains(command.toLowerCase());

        if (ans)
        {

            if(sut.length == 1)
            {

                switch(command.toLowerCase())
                {

                    case "forward", "backward":
                        System.out.println("Missing parameter");
                        break;

                    case "about":
                        about();
                        savetxtfile.add("about");
                        System.out.println("about ");
                        break;

                    case "penup":
                        penUp();
                        savetxtfile.add("penup");
                        System.out.println("penup ");
                        break;

                    case "pendown":
                        penDown();
                        savetxtfile.add("pendown");
                        System.out.println("pendown ");
                        break;

                    case "turnleft":
                        turnLeft();
                        savetxtfile.add("turnleft");
                        System.out.println("turnleft ");
                        break;

                    case "turnright":
                        turnRight();
                        savetxtfile.add("turnright");
                        System.out.println("turnright ");
                        break;

                    case "green":
                        setPenColour(Color.green);
                        savetxtfile.add("green");
                        System.out.println("green ");
                        break;

                    case "red":
                        setPenColour(Color.red);
                        savetxtfile.add("red");
                        System.out.println("red ");
                        break;

                    case "white":
                        setPenColour(Color.white);
                        savetxtfile.add("white");
                        System.out.println("white ");
                        break;

                    case "blue":
                        setPenColour(Color.blue);
                        savetxtfile.add("blue");
                        System.out.println("blue ");
                        break;

                    case "reset":
                        reset();
                        penDown();
                        savetxtfile.add("reset");
                        System.out.println("reset ");
                        break;

                    case "clear":
                        savetxtfile.add("clear");
                        clear();
                        System.out.println("clear ");
                        penDown();
                        break;

                    case "savecmd":
                        System.out.println("savecmd");

                        try (BufferedWriter writer = new BufferedWriter(new FileWriter("AssignmentTurtleGraphicsProgram/Command List.txt")))
                        {

                            for (String str : savetxtfile)
                            {
                                writer.write(str);
                                writer.newLine();

                            }

                        }

                        catch (IOException e)
                        {
                            e.printStackTrace();
                        }
 
                        break;

                    case "saveimg":
                        try {
                            BufferedImage bi = getBufferedImage();
                            File outputfile = new File("C:\\Users\\zakbu\\IdeaProjects\\OOPportfolio\\" + "AssignmentTurtleGraphicsProgram/image.png");
                            ImageIO.write(bi, "png", outputfile);

                        }

                        catch (IOException e)
                        {

                        }


                }

            }

            if(sut.length == 2)
            {

                try
                {
                    paramInt = Integer.parseInt(sut[1]);

                    if (paramInt > 0)
                    {

                        switch(command.toLowerCase())
                        {

                            case "forward":
                                forward(paramInt);
                                savetxtfile.add("forward " + paramInt);
                                System.out.println("forward " + paramInt);
                                break;

                            case "backward":
                                forward(paramInt * -1);
                                savetxtfile.add("backward " + paramInt);
                                System.out.println("backward " + paramInt);
                                break;

                        }

                    }

                    else
                    {

                        System.out.println("Please enter positive integers only");

                    }

                }

                catch(NumberFormatException e)
                {
                    System.out.println("Non-numeric data for parameter");

                }

            }

        }


        else
        {

            System.out.println("Invalid command");

        }

    }
}
