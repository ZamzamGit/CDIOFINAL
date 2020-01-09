package GUI;

import gui_fields.*;
import gui_main.GUI;

import java.awt.*;

public class MatadorGUI {



    public void GUIplade() {

        GUI_Field[] field = new GUI_Field[40];

        GUI_Start start = new GUI_Start("Start", "", "", Color.WHITE, Color.BLACK);
        field[0] = start;

        GUI_Street st1 = new GUI_Street("", "60$", "", "60", Color.ORANGE, Color.BLACK);
        field[1] = st1;

        GUI_Chance chance = new GUI_Chance("?", "Chance", "", Color.WHITE, Color.BLACK);
        field[2] = chance;

        GUI_Street st2 = new GUI_Street("Ishøj", "60$", "", "60", Color.ORANGE, Color.BLACK);
        field[3] = st2;

        GUI_Tax tax = new GUI_Tax("Betal skat", "Betal 200", "", Color.WHITE, Color.BLACK);
        field[4] = tax;

        GUI_Shipping sh1 = new GUI_Shipping("default", "Redderi", "200", "", "200", Color.WHITE, Color.BLACK);
        field[5] = sh1;

        GUI_Street st3 = new GUI_Street("Tåstrup", "100$", "", "100", Color.CYAN, Color.BLACK);
        field[6] = st3;

        GUI_Chance chance2 = new GUI_Chance("?", "Chance", "", Color.WHITE, Color.BLACK);
        field[7] = chance2;

        GUI_Street st4 = new GUI_Street("Lyngby", "100$", "", "100", Color.CYAN, Color.BLACK);
        field[8] = st4;

        GUI_Street st5 = new GUI_Street("Gentofte", "120$", "", "120", Color.CYAN, Color.BLACK);
        field[9] = st5;

        GUI_Jail jail = new GUI_Jail();
        field[10] = jail; jail.setSubText("Fængsel");

        GUI_Street st6 = new GUI_Street("Brøndby", "140$", "", "140", Color.PINK, Color.BLACK);
        field[11] = st6;

        GUI_Brewery tub = new GUI_Brewery();
        field[12] = tub;

        GUI_Street st7 = new GUI_Street("Skagen", "140$", "", "140", Color.PINK, Color.BLACK);
        field[13] = st7;

        GUI_Street st8 = new GUI_Street("Kastrup", "160$", "", "160", Color.PINK, Color.BLACK);
        field[14] = st8;

        GUI_Shipping sh2 = new GUI_Shipping("default", "Redderi", "200", "", "200", Color.WHITE, Color.BLACK);
        field[15] = sh2;

        GUI_Street st9 = new GUI_Street("Nørrebro", "180$", "", "160", Color.YELLOW, Color.BLACK);
        field[16] = st9;

        GUI_Chance chance3 = new GUI_Chance("?", "Chance", "", Color.WHITE, Color.BLACK);
        field[17] = chance3;

        GUI_Street st10 = new GUI_Street("Nørrebro", "180$", "", "160", Color.YELLOW, Color.BLACK);
        field[18] = st10;

        GUI_Street st11 = new GUI_Street("Nørrebro", "200$", "", "160", Color.YELLOW, Color.BLACK);
        field[19] = st11;

        GUI_Refuge helle = new GUI_Refuge();
        field[20] = helle;

        GUI_Street st12 = new GUI_Street("Nørrebro", "220$", "", "160", Color.RED, Color.BLACK);
        field[21] = st12;

        GUI_Chance chance4 = new GUI_Chance("?", "Chance", "", Color.WHITE, Color.BLACK);
        field[22] = chance4;

        GUI_Street st13 = new GUI_Street("Nørrebro", "220$", "", "160", Color.RED, Color.BLACK);
        field[23] = st13;

        GUI_Street st14 = new GUI_Street("Nørrebro", "240$", "", "160", Color.RED, Color.BLACK);
        field[24] = st14;

        GUI_Shipping sh3 = new GUI_Shipping("default", "Redderi", "200", "", "200", Color.WHITE, Color.BLACK);
        field[25] = sh3;

        GUI_Street st15 = new GUI_Street("Nørrebro", "260$", "", "160", Color.GRAY, Color.BLACK);
        field[26] = st15;

        GUI_Street st16 = new GUI_Street("Nørrebro", "260$", "", "160", Color.GRAY, Color.BLACK);
        field[27] = st16;

        GUI_Brewery carl = new GUI_Brewery();
        field[28] = carl;

        GUI_Street st17 = new GUI_Street("Nørrebro", "280$", "", "160", Color.GRAY, Color.BLACK);
        field[29] = st17;

        GUI_Jail jail2 = new GUI_Jail();
        field[30] = jail2; jail.setSubText("Gå i fængsel");

        GUI_Street st18 = new GUI_Street("Nørrebro", "300$", "", "160", Color.GREEN, Color.BLACK);
        field[31] = st18;

        GUI_Street st19 = new GUI_Street("Nørrebro", "300$", "", "160", Color.GREEN, Color.BLACK);
        field[32] = st19;

        GUI_Chance chance5 = new GUI_Chance("?", "Chance", "", Color.WHITE, Color.BLACK);
        field[33] = chance5;

        GUI_Street st20 = new GUI_Street("Nørrebro", "320$", "", "160", Color.GREEN, Color.BLACK);
        field[34] = st20;

        GUI_Shipping sh4 = new GUI_Shipping("default", "Redderi", "200", "", "200", Color.WHITE, Color.BLACK);
        field[35] = sh4;

        GUI_Chance chance6 = new GUI_Chance("?", "Chance", "", Color.WHITE, Color.BLACK);
        field[36] = chance6;

        GUI_Street st21 = new GUI_Street("Nørrebro", "350$", "", "160", Color.BLUE, Color.BLACK);
        field[37] = st21;

        GUI_Tax tax2 = new GUI_Tax("Betal skat", "Betal 200", "", Color.WHITE, Color.BLACK);
        field[38] = tax2;

        GUI_Street st22 = new GUI_Street("Nørrebro", "400$", "", "160", Color.BLUE, Color.BLACK);
        field[39] = st22;

        GUI gui = new GUI(field);

    }
}
