package GUI;

import gui_fields.*;
import gui_main.GUI;

import java.awt.*;

public class MatadorGUI {




    public static void GUIfelter() {

        GUI_Field[] field = new GUI_Field[6];

        GUI_Start start = new GUI_Start("Start", "200$", "", , Color.BLACK);
        field[0] = start;

        GUI_Street st1 = new GUI_Street("Chokolade", "200$", "", "200", Color.ORANGE, Color.BLACK);
        field[1] = st1;

        GUI_Chance ch1 = new GUI_Chance("?", "Chance", "", Color.WHITE, Color.BLACK);
        field[2] = ch1;

        GUI_Tax tax1 = new GUI_Tax();
        field[3] = tax1;

        GUI_Street st2 = new GUI_Street("Chokolade", "200$", "", "200", Color.BLUE, Color.GREEN);
        field[4] = st2;

       GUI_Shipping rail1 = new GUI_Shipping("default", "train", "asd", "String description", "200$", Color.BLUE, Color.RED);
        field[5] = rail1;


        GUI gui = new GUI(field);



        //GUI_Start start = new GUI_Start("START", "200$", "200", Color.WHITE, Color.BLACK);
       // GUI_Street street = new GUI_Street("Chokolade", "2$", "Køb ejendommen", "1", Color.RED, Color.BLACK);

       // GUI_Field[] gui_field = {};
        //GUI gui = new GUI(gui_field);










    }




}
