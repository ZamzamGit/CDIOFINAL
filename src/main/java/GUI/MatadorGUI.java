package GUI;

import gui_fields.*;
import gui_main.GUI;

import java.awt.*;

public class MatadorGUI {




    public static void GUIfelter() {

        GUI_Field[] field = new GUI_Field[4];

        GUI_Start start = new GUI_Start("Start", "200$", "", Color.WHITE, Color.BLACK);
        field[0] = start;

        GUI_Street choko = new GUI_Street("Chokolade", "200$", "", "200", Color.ORANGE, Color.BLACK);
        field[1] = choko;

        GUI_Chance chance = new GUI_Chance("?", "Chance", "", Color.WHITE, Color.BLACK);
        field[2] = chance;

        GUI_Tax tax = new GUI_Tax();
        field[3] = tax;






        GUI gui = new GUI(field);



        //GUI_Start start = new GUI_Start("START", "200$", "200", Color.WHITE, Color.BLACK);
       // GUI_Street street = new GUI_Street("Chokolade", "2$", "Køb ejendommen", "1", Color.RED, Color.BLACK);

       // GUI_Field[] gui_field = {};
        //GUI gui = new GUI(gui_field);










    }




}
