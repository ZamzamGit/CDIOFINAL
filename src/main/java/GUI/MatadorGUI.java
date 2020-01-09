package GUI;


import  feltklasser.*;
import gui_fields.*;
import gui_main.GUI;
import java.awt.*;

public class MatadorGUI {



    public void GUIplade() {

        GUI_Field[] gui_field = new GUI_Field[40];

        GUI_Start gui_start = new GUI_Start("Start", "", "", Color.WHITE, Color.BLACK);
        gui_field[0] = gui_start;

        GUI_Street gui_st1 = new GUI_Street("", "60$", "", "60", Color.ORANGE, Color.BLACK);
        gui_field[1] = gui_st1;

        GUI_Chance gui_chance = new GUI_Chance("?", "Chance", "", Color.WHITE, Color.BLACK);
        gui_field[2] = gui_chance;

        GUI_Street gui_st2 = new GUI_Street("Ishøj", "60$", "", "60", Color.ORANGE, Color.BLACK);
        gui_field[3] = gui_st2;

        GUI_Tax gui_tax = new GUI_Tax("Betal skat", "Betal 200", "", Color.WHITE, Color.BLACK);
        gui_field[4] = gui_tax;

        GUI_Shipping gui_sh1 = new GUI_Shipping("default", "Redderi", "200", "", "200", Color.WHITE, Color.BLACK);
        gui_field[5] = gui_sh1;

        GUI_Street gui_st3 = new GUI_Street("Tåstrup", "100$", "", "100", Color.CYAN, Color.BLACK);
        gui_field[6] = gui_st3;

        GUI_Chance gui_chance2 = new GUI_Chance("?", "Chance", "", Color.WHITE, Color.BLACK);
        gui_field[7] = gui_chance2;

        GUI_Street gui_st4 = new GUI_Street("Lyngby", "100$", "", "100", Color.CYAN, Color.BLACK);
        gui_field[8] = gui_st4;

        GUI_Street gui_st5 = new GUI_Street("Gentofte", "120$", "", "120", Color.CYAN, Color.BLACK);
        gui_field[9] = gui_st5;

        GUI_Jail gui_jail = new GUI_Jail();
        gui_field[10] = gui_jail; gui_jail.setSubText("Fængsel");

        GUI_Street gui_st6 = new GUI_Street("Brøndby", "140$", "", "140", Color.PINK, Color.BLACK);
        gui_field[11] = gui_st6;

        GUI_Brewery gui_tub = new GUI_Brewery();
        gui_field[12] = gui_tub;

        GUI_Street gui_st7 = new GUI_Street("Skagen", "140$", "", "140", Color.PINK, Color.BLACK);
        gui_field[13] = gui_st7;

        GUI_Street gui_st8 = new GUI_Street("Kastrup", "160$", "", "160", Color.PINK, Color.BLACK);
        gui_field[14] = gui_st8;

        GUI_Shipping gui_sh2 = new GUI_Shipping("default", "Redderi", "200", "", "200", Color.WHITE, Color.BLACK);
        gui_field[15] = gui_sh2;

        GUI_Street gui_st9 = new GUI_Street("Nørrebro", "180$", "", "160", Color.YELLOW, Color.BLACK);
        gui_field[16] = gui_st9;

        GUI_Chance gui_chance3 = new GUI_Chance("?", "Chance", "", Color.WHITE, Color.BLACK);
        gui_field[17] = gui_chance3;

        GUI_Street gui_st10 = new GUI_Street("Nørrebro", "180$", "", "160", Color.YELLOW, Color.BLACK);
        gui_field[18] = gui_st10;

        GUI_Street gui_st11 = new GUI_Street("Nørrebro", "200$", "", "160", Color.YELLOW, Color.BLACK);
        gui_field[19] = gui_st11;

        GUI_Refuge gui_helle = new GUI_Refuge();
        gui_field[20] = gui_helle; gui_helle.setSubText("Parkering");

        GUI_Street gui_st12 = new GUI_Street("Nørrebro", "220$", "", "160", Color.RED, Color.BLACK);
        gui_field[21] = gui_st12;

        GUI_Chance gui_chance4 = new GUI_Chance("?", "Chance", "", Color.WHITE, Color.BLACK);
        gui_field[22] = gui_chance4;

        GUI_Street gui_st13 = new GUI_Street("Nørrebro", "220$", "", "160", Color.RED, Color.BLACK);
        gui_field[23] = gui_st13;

        GUI_Street gui_st14 = new GUI_Street("Nørrebro", "240$", "", "160", Color.RED, Color.BLACK);
        gui_field[24] = gui_st14;

        GUI_Shipping gui_sh3 = new GUI_Shipping("default", "Redderi", "200", "", "200", Color.WHITE, Color.BLACK);
        gui_field[25] = gui_sh3;

        GUI_Street gui_st15 = new GUI_Street("Nørrebro", "260$", "", "160", Color.GRAY, Color.BLACK);
        gui_field[26] = gui_st15;

        GUI_Street gui_st16 = new GUI_Street("Nørrebro", "260$", "", "160", Color.GRAY, Color.BLACK);
        gui_field[27] = gui_st16;

        GUI_Brewery gui_carl = new GUI_Brewery();
        gui_field[28] = gui_carl;

        GUI_Street gui_st17 = new GUI_Street("Nørrebro", "280$", "", "160", Color.GRAY, Color.BLACK);
        gui_field[29] = gui_st17;

        GUI_Jail gui_jail2 = new GUI_Jail();
        gui_field[30] = gui_jail2; gui_jail2.setSubText("Gå i fængsel");

        GUI_Street gui_st18 = new GUI_Street("Nørrebro", "300$", "", "160", Color.GREEN, Color.BLACK);
        gui_field[31] = gui_st18;

        GUI_Street gui_st19 = new GUI_Street("Nørrebro", "300$", "", "160", Color.GREEN, Color.BLACK);
        gui_field[32] = gui_st19;

        GUI_Chance gui_chance5 = new GUI_Chance("?", "Chance", "", Color.WHITE, Color.BLACK);
        gui_field[33] = gui_chance5;

        GUI_Street gui_st20 = new GUI_Street("Nørrebro", "320$", "", "160", Color.GREEN, Color.BLACK);
        gui_field[34] = gui_st20;

        GUI_Shipping gui_sh4 = new GUI_Shipping("default", "Redderi", "200", "", "200", Color.WHITE, Color.BLACK);
        gui_field[35] = gui_sh4;

        GUI_Chance gui_chance6 = new GUI_Chance("?", "Chance", "", Color.WHITE, Color.BLACK);
        gui_field[36] = gui_chance6;

        GUI_Street gui_st21 = new GUI_Street("Nørrebro", "350$", "", "160", Color.BLUE, Color.BLACK);
        gui_field[37] = gui_st21;

        GUI_Tax gui_tax2 = new GUI_Tax("Betal skat", "Betal 200", "", Color.WHITE, Color.BLACK);
        gui_field[38] = gui_tax2;

        GUI_Street gui_st22 = new GUI_Street("Nørrebro", "400$", "", "160", Color.BLUE, Color.BLACK);
        gui_field[39] = gui_st22;

        GUI gui = new GUI(gui_field);






        Felt[] field = new Felt[40];

        Ejendom start = new Ejendom("Start", 0);
        field[0] = start;

        Ejendom st1 = new Ejendom("", 60);
        field[1] = st1;

        Chance chance = new Chance("Chance");
        field[2] = chance;

        Ejendom st2 = new Ejendom("Ishøj", 60);
        field[3] = st2;

        Skat tax = new Skat("Betal skat",200);
        field[4] = tax;

        Ejendom sh1 = new Ejendom("Øresund", 200);
        field[5] = sh1;

        Ejendom st3 = new Ejendom("Tåstrup", 100);
        field[6] = st3;

        Chance chance2 = new Chance("Chance");
        field[7] = chance2;

        Ejendom st4 = new Ejendom("Lyngby", 100);
        field[8] = st4;

        Ejendom st5 = new Ejendom("Gentofte", 120);
        field[9] = st5;

        Fængsel Fængsel = new Fængsel("Fængsel");
        field[10] = Fængsel;

        Ejendom st6 = new Ejendom("Brøndby", 140);
        field[11] = st6;

        Ejendom tub = new Ejendom("Tuborg",150);
        field[12] = tub;

        Ejendom st7 = new Ejendom("Skagen", 140);
        field[13] = st7;

        Ejendom st8 = new Ejendom("Kastrup", 160);
        field[14] = st8;

        Ejendom sh2 = new Ejendom("D.F.D.S", 200);
        field[15] = sh2;

        Ejendom st9 = new Ejendom("Nørrebro", 180);
        field[16] = st9;

        Chance chance3 = new Chance("Chance");
        field[17] = chance3;

        Ejendom st10 = new Ejendom("Nørrebro", 180);
        field[18] = st10;

        Ejendom st11 = new Ejendom("Nørrebro", 200);
        field[19] = st11;

        Fængsel helle = new Fængsel("Fængsel");
        field[20] = helle;

        Ejendom st12 = new Ejendom("Nørrebro", 220);
        field[21] = st12;

        Chance chance4 = new Chance("Chance");
        field[22] = chance4;

        Ejendom st13 = new Ejendom("Nørrebro", 220);
        field[23] = st13;

        Ejendom st14 = new Ejendom("Nørrebro", 240);
        field[24] = st14;

        Ejendom sh3 = new Ejendom("Ø.S", 200);
        field[25] = sh3;

        Ejendom st15 = new Ejendom("Nørrebro", 260);
        field[26] = st15;

        Ejendom st16 = new Ejendom("Nørrebro", 260);
        field[27] = st16;

        Ejendom carl = new Ejendom("Carlsberg",150);
        field[28] = carl;

        Ejendom st17 = new Ejendom("Nørrebro", 280);
        field[29] = st17;

        GåTilFængsel Fængsel2 = new GåTilFængsel("Fængsel");
        field[30] = Fængsel2;

        Ejendom st18 = new Ejendom("Nørrebro", 300);
        field[31] = st18;

        Ejendom st19 = new Ejendom("Nørrebro", 300);
        field[32] = st19;

        Chance chance5 = new Chance("Chance");
        field[33] = chance5;

        Ejendom st20 = new Ejendom("Nørrebro", 320);
        field[34] = st20;

        Ejendom sh4 = new Ejendom("default", 200);
        field[35] = sh4;

        Chance chance6 = new Chance("Chance");
        field[36] = chance6;

        Ejendom st21 = new Ejendom("Nørrebro", 350);
        field[37] = st21;

        Skat tax2 = new Skat("Betal skat", 200);
        field[38] = tax2;

        Ejendom st22 = new Ejendom("Nørrebro", 400);
        field[39] = st22;










    }
}
