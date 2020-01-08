package GUI;

import gui_fields.GUI_Field;
import gui_fields.GUI_Start;
import gui_fields.GUI_Street;
import gui_main.GUI;

import java.awt.*;

public class MatadorGUI {




    public static void GUIfelter() {

        GUI_Field[] field = new GUI_Field[2];

        GUI_Start start = new GUI_Start("Start", "200$", "", Color.WHITE, Color.BLACK);
        field[0] = start;

        GUI_Street choko = new GUI_Street("Chokolade", "200$", "", "200", Color.RED, Color.BLACK);
        field[1] = choko;


        //GUI_Start start = new GUI_Start("START", "200$", "200", Color.WHITE, Color.BLACK);
       // GUI_Street street = new GUI_Street("Chokolade", "2$", "Køb ejendommen", "1", Color.RED, Color.BLACK);

       // GUI_Field[] gui_field = {};
        //GUI gui = new GUI(gui_field);










    }




}
