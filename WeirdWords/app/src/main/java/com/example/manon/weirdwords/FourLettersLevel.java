package com.example.manon.weirdwords;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.ImageView;

public class FourLettersLevel extends AppCompatActivity implements View.OnClickListener{


    // initialisation saisie

    // initialisation clavier
    private android.widget.Button button1 = null;
    private android.widget.Button button2 = null;
    private android.widget.Button button3 = null;
    private android.widget.Button button4 = null;
    private android.widget.Button button5 = null;
    private android.widget.Button button6 = null;
    private android.widget.Button button7 = null;
    private android.widget.Button button8 = null;
    private android.widget.Button button9 = null;
    private android.widget.Button button10 = null;
    private android.widget.Button button11 = null;
    private android.widget.Button button12 = null;
    private android.widget.Button button13 = null;
    private android.widget.Button button14 = null;
    private android.widget.Button button15 = null;
    private android.widget.Button button16 = null;
    private android.widget.Button button17 = null;
    private android.widget.Button button18 = null;

    //toolbar
    private ImageButton undo_button = null;
    private ImageButton clue_button = null;
    private ImageButton param_button = null;

    // variables isButtonPressed (clavier)
    private boolean isButton1Pressed = false;
    private boolean isButton2Pressed = false;
    private boolean isButton3Pressed = false;
    private boolean isButton4Pressed = false;
    private boolean isButton5Pressed = false;
    private boolean isButton6Pressed = false;
    private boolean isButton7Pressed = false;
    private boolean isButton8Pressed = false;
    private boolean isButton9Pressed = false;
    private boolean isButton10Pressed = false;
    private boolean isButton11Pressed = false;
    private boolean isButton12Pressed = false;
    private boolean isButton13Pressed = false;
    private boolean isButton14Pressed = false;
    private boolean isButton15Pressed = false;
    private boolean isButton16Pressed = false;
    private boolean isButton17Pressed = false;
    private boolean isButton18Pressed = false;

    // initialisation zone de saisie
    private android.widget.Button saisie1;
    private android.widget.Button saisie2;
    private android.widget.Button saisie3;
    private android.widget.Button saisie4;

    // Parametrage zone de saisie
    private int focusSaisie = 0;
    private char[] saisie = {' ', ' ', ' ', ' '};
    private String answer;
    private int level;
    private ImageView image = null;
    private double randomD;
    private int randomI;


    //Clavier
    private String clavier1;
    private String clavier2;
    private String clavier3;
    private String clavier4;
    private String clavier5;
    private String clavier6;
    private String clavier7;
    private String clavier8;
    private String clavier9;
    private String clavier10;
    private String clavier11;
    private String clavier12;
    private String clavier13;
    private String clavier14;
    private String clavier15;
    private String clavier16;
    private String clavier17;
    private String clavier18;

    private String levelS =" "  ;

    static FourLettersLevel FourLettersLevel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_four_letters_level);
        FourLettersLevel = this;


        image = (ImageView)findViewById(R.id.level_image);

        Bundle objetbunble  = this.getIntent().getExtras();
        // récupération de la valeur
        levelS = objetbunble .getString("passInfo");

        // Init boutons toolbar
        undo_button = (ImageButton)findViewById(R.id.undo_button);
        clue_button = (ImageButton)findViewById(R.id.indice_button);
        param_button = (ImageButton)findViewById(R.id.param_button);

        if(levelS.charAt(9) == 'w'){
            WinActivity.getInstance().finish();
        }else{

        }


        // Personnalisation image
        if(levelS.equals("level 2.1n") || levelS.equals("level 2.1w") || levelS.equals(null)){

            answer = "FOOT";
            image.setBackgroundResource(R.mipmap.level_2_1);

            clavier1 = "Q";
            clavier2 = "O";
            clavier3 = "P";
            clavier4 = "T";
            clavier5 = "E";
            clavier6 = "O";
            clavier7 = "A";
            clavier8 = "U";
            clavier9 = "M";
            clavier10 = "Z";
            clavier11 = "I";
            clavier12 = "W";
            clavier13 = "B";
            clavier14 = "F";
            clavier15 = "R";
            clavier16 = "X";
            clavier17 = "M";
            clavier18 = "T";


        }else if(levelS.equals("level 2.2n") || levelS.equals("level 2.2w")) {
            image.setBackgroundResource(R.mipmap.level_2_2);
            answer = "YOGA";
            clavier1 = "P";
            clavier2 = "S";
            clavier3 = "Y";
            clavier4 = "E";
            clavier5 = "Z";
            clavier6 = "M";
            clavier7 = "A";
            clavier8 = "O";
            clavier9 = "T";
            clavier10 = "A";
            clavier11 = "I";
            clavier12 = "F";
            clavier13 = "K";
            clavier14 = "L";
            clavier15 = "R";
            clavier16 = "A";
            clavier17 = "V";
            clavier18 = "G";

        }else if(levelS.equals("level 2.3n") || levelS.equals("level 2.3w")){

            image.setBackgroundResource(R.mipmap.level_2_3);

            answer = "JAVA";
            clavier1 = "H";
            clavier2 = "O";
            clavier3 = "Q";
            clavier4 = "E";
            clavier5 = "T";
            clavier6 = "J";
            clavier7 = "A";
            clavier8 = "K";
            clavier9 = "W";
            clavier10 = "A";
            clavier11 = "I";
            clavier12 = "S";
            clavier13 = "B";
            clavier14 = "G";
            clavier15 = "R";
            clavier16 = "E";
            clavier17 = "V";
            clavier18 = "E";

        }else if(levelS.equals("level 2.4n") || levelS.equals("level 2.4w")){

            image.setBackgroundResource(R.mipmap.level_2_4);

            answer = "MISS";
            clavier1 = "M";
            clavier2 = "T";
            clavier3 = "S";
            clavier4 = "U";
            clavier5 = "R";
            clavier6 = "J";
            clavier7 = "A";
            clavier8 = "E";
            clavier9 = "B";
            clavier10 = "S";
            clavier11 = "N";
            clavier12 = "F";
            clavier13 = "S";
            clavier14 = "E";
            clavier15 = "R";
            clavier16 = "Q";
            clavier17 = "M";
            clavier18 = "I";
        }else if(levelS.equals("level 2.5n") || levelS.equals("level 2.5w")){
            image.setBackgroundResource(R.mipmap.level_2_5);
            answer = "VELO";
            clavier1 = "L";
            clavier2 = "T";
            clavier3 = "K";
            clavier4 = "U";
            clavier5 = "E";
            clavier6 = "O";
            clavier7 = "E";
            clavier8 = "P";
            clavier9 = "S";
            clavier10 = "A";
            clavier11 = "W";
            clavier12 = "V";
            clavier13 = "E";
            clavier14 = "L";
            clavier15 = "H";
            clavier16 = "E";
            clavier17 = "D";
            clavier18 = "O";
        }else if(levelS.equals("level 2.6n") || levelS.equals("level 2.6w")){
            image.setBackgroundResource(R.mipmap.level_2_6);

            answer = "KIWI";
            clavier1 = "M";
            clavier2 = "W";
            clavier3 = "I";
            clavier4 = "K";
            clavier5 = "E";
            clavier6 = "H";
            clavier7 = "K";
            clavier8 = "S";
            clavier9 = "M";
            clavier10 = "A";
            clavier11 = "H";
            clavier12 = "F";
            clavier13 = "B";
            clavier14 = "I";
            clavier15 = "R";
            clavier16 = "U";
            clavier17 = "I";
            clavier18 = "P";
        }else if(levelS.equals("level 2.7n") || levelS.equals("level 2.7w")){
            image.setBackgroundResource(R.mipmap.level_2_7);
            answer = "BLOC";
            clavier1 = "M";
            clavier2 = "T";
            clavier3 = "D";
            clavier4 = "B";
            clavier5 = "E";
            clavier6 = "J";
            clavier7 = "A";
            clavier8 = "K";
            clavier9 = "O";
            clavier10 = "A";
            clavier11 = "I";
            clavier12 = "A";
            clavier13 = "P";
            clavier14 = "L";
            clavier15 = "C";
            clavier16 = "E";
            clavier17 = "N";
            clavier18 = "R";
        }else if(levelS.equals("level 2.8n") || levelS.equals("level 2.8w")){
            image.setBackgroundResource(R.mipmap.level_2_8);

            answer = "RHUM";
            clavier1 = "T";
            clavier2 = "T";
            clavier3 = "M";
            clavier4 = "U";
            clavier5 = "P";
            clavier6 = "J";
            clavier7 = "A";
            clavier8 = "O";
            clavier9 = "M";
            clavier10 = "A";
            clavier11 = "I";
            clavier12 = "R";
            clavier13 = "B";
            clavier14 = "L";
            clavier15 = "U";
            clavier16 = "E";
            clavier17 = "H";
            clavier18 = "L";

        }else if(levelS.equals("level 3.1n") || levelS.equals("level 3.1w")){
            image.setBackgroundResource(R.mipmap.level_3_1);

            answer = "KAKI";
            clavier1 = "O";
            clavier2 = "Q";
            clavier3 = "K";
            clavier4 = "U";
            clavier5 = "P";
            clavier6 = "A";
            clavier7 = "M";
            clavier8 = "O";
            clavier9 = "R";
            clavier10 = "A";
            clavier11 = "I";
            clavier12 = "R";
            clavier13 = "X";
            clavier14 = "K";
            clavier15 = "U";
            clavier16 = "S";
            clavier17 = "H";
            clavier18 = "U";

        }else if(levelS.equals("level 3.2n") || levelS.equals("level 3.2w")){
            image.setBackgroundResource(R.mipmap.level_3_2);

            answer = "FILS";
            clavier1 = "T";
            clavier2 = "K";
            clavier3 = "M";
            clavier4 = "U";
            clavier5 = "F";
            clavier6 = "J";
            clavier7 = "I";
            clavier8 = "Y";
            clavier9 = "M";
            clavier10 = "A";
            clavier11 = "I";
            clavier12 = "S";
            clavier13 = "B";
            clavier14 = "L";
            clavier15 = "D";
            clavier16 = "E";
            clavier17 = "H";
            clavier18 = "L";

        }else if(levelS.equals("level 3.3n") || levelS.equals("level 3.3w")){
            image.setBackgroundResource(R.mipmap.level_3_3);

            answer = "QUOI";
            clavier1 = "Q";
            clavier2 = "T";
            clavier3 = "P";
            clavier4 = "U";
            clavier5 = "P";
            clavier6 = "O";
            clavier7 = "A";
            clavier8 = "U";
            clavier9 = "M";
            clavier10 = "A";
            clavier11 = "I";
            clavier12 = "R";
            clavier13 = "M";
            clavier14 = "L";
            clavier15 = "U";
            clavier16 = "E";
            clavier17 = "B";
            clavier18 = "L";

        }else if(levelS.equals("level 3.4n") || levelS.equals("level 3.4w")){
            image.setBackgroundResource(R.mipmap.level_3_4);

            answer = "JAZZ";
            clavier1 = "Z";
            clavier2 = "T";
            clavier3 = "P";
            clavier4 = "U";
            clavier5 = "P";
            clavier6 = "J";
            clavier7 = "A";
            clavier8 = "J";
            clavier9 = "M";
            clavier10 = "A";
            clavier11 = "I";
            clavier12 = "Z";
            clavier13 = "Y";
            clavier14 = "L";
            clavier15 = "T";
            clavier16 = "E";
            clavier17 = "B";
            clavier18 = "L";

        }else if(levelS.equals("level 3.5n") || levelS.equals("level 3.5w")){
            image.setBackgroundResource(R.mipmap.level_3_5);

            answer = "SODA";
            clavier1 = "T";
            clavier2 = "F";
            clavier3 = "M";
            clavier4 = "S";
            clavier5 = "D";
            clavier6 = "G";
            clavier7 = "A";
            clavier8 = "O";
            clavier9 = "M";
            clavier10 = "A";
            clavier11 = "I";
            clavier12 = "R";
            clavier13 = "S";
            clavier14 = "L";
            clavier15 = "U";
            clavier16 = "E";
            clavier17 = "K";
            clavier18 = "L";

        }else if(levelS.equals("level 3.6n") || levelS.equals("level 3.6w")){
            image.setBackgroundResource(R.mipmap.level_3_6);

            answer = "PUNK";
            clavier1 = "T";
            clavier2 = "M";
            clavier3 = "Q";
            clavier4 = "U";
            clavier5 = "P";
            clavier6 = "J";
            clavier7 = "A";
            clavier8 = "O";
            clavier9 = "M";
            clavier10 = "A";
            clavier11 = "K";
            clavier12 = "R";
            clavier13 = "B";
            clavier14 = "N";
            clavier15 = "U";
            clavier16 = "O";
            clavier17 = "E";
            clavier18 = "L";

        }else if(levelS.equals("level 3.7n") || levelS.equals("level 3.7w")){
            image.setBackgroundResource(R.mipmap.level_3_7);

            answer = "IDEE";
            clavier1 = "P";
            clavier2 = "E";
            clavier3 = "M";
            clavier4 = "U";
            clavier5 = "P";
            clavier6 = "F";
            clavier7 = "A";
            clavier8 = "D";
            clavier9 = "M";
            clavier10 = "A";
            clavier11 = "I";
            clavier12 = "R";
            clavier13 = "E";
            clavier14 = "J";
            clavier15 = "K";
            clavier16 = "E";
            clavier17 = "H";
            clavier18 = "L";

        }else if(levelS.equals("level 3.8n") || levelS.equals("level 3.8w")){
            image.setBackgroundResource(R.mipmap.level_3_8);

            answer = "JUPE";
            clavier1 = "T";
            clavier2 = "M";
            clavier3 = "R";
            clavier4 = "U";
            clavier5 = "P";
            clavier6 = "J";
            clavier7 = "A";
            clavier8 = "O";
            clavier9 = "M";
            clavier10 = "P";
            clavier11 = "I";
            clavier12 = "R";
            clavier13 = "B";
            clavier14 = "L";
            clavier15 = "U";
            clavier16 = "E";
            clavier17 = "H";
            clavier18 = "L";
        }else{

        }



        // Init boutons clavier
        button1 = (android.widget.Button) findViewById(R.id.button1);
        button2 = (android.widget.Button) findViewById(R.id.button2);
        button3 = (android.widget.Button) findViewById(R.id.button3);
        button4 = (android.widget.Button) findViewById(R.id.button4);
        button5 = (android.widget.Button) findViewById(R.id.button5);
        button6 = (android.widget.Button) findViewById(R.id.button6);
        button7 = (android.widget.Button) findViewById(R.id.button7);
        button8 = (android.widget.Button) findViewById(R.id.button8);
        button9 = (android.widget.Button) findViewById(R.id.button9);
        button10 = (android.widget.Button) findViewById(R.id.button10);
        button11 = (android.widget.Button) findViewById(R.id.button11);
        button12 = (android.widget.Button) findViewById(R.id.button12);
        button13 = (android.widget.Button) findViewById(R.id.button13);
        button14 = (android.widget.Button) findViewById(R.id.button14);
        button15 = (android.widget.Button) findViewById(R.id.button15);
        button16 = (android.widget.Button) findViewById(R.id.button16);
        button17 = (android.widget.Button) findViewById(R.id.button17);
        button18 = (android.widget.Button) findViewById(R.id.button18);

        // Personnalisation boutons clavier
        button1.setText(clavier1);
        button2.setText(clavier2);
        button3.setText(clavier3);
        button4.setText(clavier4);
        button5.setText(clavier5);
        button6.setText(clavier6);
        button7.setText(clavier7);
        button8.setText(clavier8);
        button9.setText(clavier9);
        button10.setText(clavier10);
        button11.setText(clavier11);
        button12.setText(clavier12);
        button13.setText(clavier13);
        button14.setText(clavier14);
        button15.setText(clavier15);
        button16.setText(clavier16);
        button17.setText(clavier17);
        button18.setText(clavier18);

        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                char carac;
                if(isButton1Pressed == false){
                    if(focusSaisie < 4){
                        button1.setBackgroundResource(R.mipmap.small_button_pressed);
                        isButton1Pressed = true;
                        carac = button1.getText().charAt(0);
                        saisie[focusSaisie] = carac;
                        updateSaisie();
                        determineFocusSaisie();
                        isWon();
                    }else{
                        // Rien ne se passe : zone de saisie pleine
                    }

                }else{
                    button1.setBackgroundResource(R.mipmap.small_button);
                    isButton1Pressed = false;
                    removeCharacter(button1);
                    updateSaisie();
                    determineFocusSaisie();
                }

            }
        });


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                char carac;
                if(isButton2Pressed == false){
                    if(focusSaisie < 4){
                        button2.setBackgroundResource(R.mipmap.small_button_pressed);
                        isButton2Pressed = true;
                        carac = button2.getText().charAt(0);
                        saisie[focusSaisie] = carac;
                        updateSaisie();
                        determineFocusSaisie();
                        isWon();

                    }else{
                        // Rien ne se passe : zone de saisie pleine
                    }

                }else{
                    button2.setBackgroundResource(R.mipmap.small_button);
                    isButton2Pressed = false;
                    removeCharacter(button2);
                    updateSaisie();
                    determineFocusSaisie();
                }
            }
        });


        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                char carac;
                if(isButton3Pressed == false){
                    if(focusSaisie < 4){
                        button3.setBackgroundResource(R.mipmap.small_button_pressed);
                        isButton3Pressed = true;
                        carac = button3.getText().charAt(0);
                        saisie[focusSaisie] = carac;
                        updateSaisie();
                        determineFocusSaisie();
                        isWon();

                    }else{
                        // Rien ne se passe : zone de saisie pleine
                    }

                }else{
                    button3.setBackgroundResource(R.mipmap.small_button);
                    isButton3Pressed = false;
                    removeCharacter(button3);
                    updateSaisie();
                    determineFocusSaisie();
                }
            }
        });


        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                char carac;
                if(isButton4Pressed == false){
                    if(focusSaisie < 4){
                        button4.setBackgroundResource(R.mipmap.small_button_pressed);
                        isButton4Pressed = true;
                        carac = button4.getText().charAt(0);
                        saisie[focusSaisie] = carac;
                        updateSaisie();
                        determineFocusSaisie();
                        isWon();

                    }else{
                        // Rien ne se passe : zone de saisie pleine
                    }

                }else{
                    button4.setBackgroundResource(R.mipmap.small_button);
                    isButton4Pressed = false;
                    removeCharacter(button4);
                    updateSaisie();
                    determineFocusSaisie();
                }
            }
        });



        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                char carac;
                if(isButton5Pressed == false){
                    if(focusSaisie < 4){
                        button5.setBackgroundResource(R.mipmap.small_button_pressed);
                        isButton5Pressed = true;
                        carac = button5.getText().charAt(0);
                        saisie[focusSaisie] = carac;
                        updateSaisie();
                        determineFocusSaisie();
                        isWon();

                    }else{
                        // Rien ne se passe : zone de saisie pleine
                    }

                }else{
                    button5.setBackgroundResource(R.mipmap.small_button);
                    isButton5Pressed = false;
                    removeCharacter(button5);
                    updateSaisie();
                    determineFocusSaisie();
                }
            }
        });


        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                char carac;
                if(isButton6Pressed == false){
                    if(focusSaisie < 4){
                        button6.setBackgroundResource(R.mipmap.small_button_pressed);
                        isButton6Pressed = true;
                        carac = button6.getText().charAt(0);
                        saisie[focusSaisie] = carac;
                        updateSaisie();
                        determineFocusSaisie();
                        isWon();

                    }else{
                        // Rien ne se passe : zone de saisie pleine
                    }

                }else{
                    button6.setBackgroundResource(R.mipmap.small_button);
                    isButton6Pressed = false;
                    removeCharacter(button6);
                    updateSaisie();
                    determineFocusSaisie();
                }
            }
        });


        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                char carac;
                if(isButton7Pressed == false){
                    if(focusSaisie < 4){
                        button7.setBackgroundResource(R.mipmap.small_button_pressed);
                        isButton7Pressed = true;
                        carac = button7.getText().charAt(0);
                        saisie[focusSaisie] = carac;
                        updateSaisie();
                        determineFocusSaisie();
                        isWon();

                    }else{
                        // Rien ne se passe : zone de saisie pleine
                    }

                }else{
                    button7.setBackgroundResource(R.mipmap.small_button);
                    isButton7Pressed = false;
                    removeCharacter(button7);
                    updateSaisie();
                    determineFocusSaisie();
                }
            }
        });


        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                char carac;
                if(isButton8Pressed == false){
                    if(focusSaisie < 4){
                        button8.setBackgroundResource(R.mipmap.small_button_pressed);
                        isButton8Pressed = true;
                        carac = button8.getText().charAt(0);
                        saisie[focusSaisie] = carac;
                        updateSaisie();
                        determineFocusSaisie();
                        isWon();

                    }else{
                        // Rien ne se passe : zone de saisie pleine
                    }

                }else{
                    button8.setBackgroundResource(R.mipmap.small_button);
                    isButton8Pressed = false;
                    removeCharacter(button8);
                    updateSaisie();
                    determineFocusSaisie();
                }
            }
        });


        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                char carac;
                if(isButton9Pressed == false){
                    if(focusSaisie < 4){
                        button9.setBackgroundResource(R.mipmap.small_button_pressed);
                        isButton9Pressed = true;
                        carac = button9.getText().charAt(0);
                        saisie[focusSaisie] = carac;
                        updateSaisie();
                        determineFocusSaisie();
                        isWon();

                    }else{
                        // Rien ne se passe : zone de saisie pleine
                    }

                }else{
                    button9.setBackgroundResource(R.mipmap.small_button);
                    isButton9Pressed = false;
                    removeCharacter(button9);
                    updateSaisie();
                    determineFocusSaisie();
                }
            }
        });


        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                char carac;
                if(isButton10Pressed == false){
                    if(focusSaisie < 4){
                        button10.setBackgroundResource(R.mipmap.small_button_pressed);
                        isButton10Pressed = true;
                        carac = button10.getText().charAt(0);
                        saisie[focusSaisie] = carac;
                        updateSaisie();
                        determineFocusSaisie();
                        isWon();

                    }else{
                        // Rien ne se passe : zone de saisie pleine
                    }

                }else{
                    button10.setBackgroundResource(R.mipmap.small_button);
                    isButton10Pressed = false;
                    removeCharacter(button10);
                    updateSaisie();
                    determineFocusSaisie();
                }
            }
        });


        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                char carac;
                if(isButton11Pressed == false){
                    if(focusSaisie < 4){
                        button11.setBackgroundResource(R.mipmap.small_button_pressed);
                        isButton11Pressed = true;
                        carac = button11.getText().charAt(0);
                        saisie[focusSaisie] = carac;
                        updateSaisie();
                        determineFocusSaisie();
                        isWon();

                    }else{
                        // Rien ne se passe : zone de saisie pleine
                    }

                }else{
                    button11.setBackgroundResource(R.mipmap.small_button);
                    isButton11Pressed = false;
                    removeCharacter(button11);
                    updateSaisie();
                    determineFocusSaisie();
                }
            }
        });


        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                char carac;
                if(isButton12Pressed == false){
                    if(focusSaisie < 4){
                        button12.setBackgroundResource(R.mipmap.small_button_pressed);
                        isButton12Pressed = true;
                        carac = button12.getText().charAt(0);
                        saisie[focusSaisie] = carac;
                        updateSaisie();
                        determineFocusSaisie();
                        isWon();

                    }else{
                        // Rien ne se passe : zone de saisie pleine
                    }

                }else{
                    button12.setBackgroundResource(R.mipmap.small_button);
                    isButton12Pressed = false;
                    removeCharacter(button12);
                    updateSaisie();
                    determineFocusSaisie();
                }
            }
        });


        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                char carac;
                if(isButton13Pressed == false){
                    if(focusSaisie < 4){
                        button13.setBackgroundResource(R.mipmap.small_button_pressed);
                        isButton13Pressed = true;
                        carac = button13.getText().charAt(0);
                        saisie[focusSaisie] = carac;
                        updateSaisie();
                        determineFocusSaisie();
                        isWon();

                    }else{
                        // Rien ne se passe : zone de saisie pleine
                    }

                }else{
                    button13.setBackgroundResource(R.mipmap.small_button);
                    isButton13Pressed = false;
                    removeCharacter(button13);
                    updateSaisie();
                    determineFocusSaisie();
                }
            }
        });


        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                char carac;
                if(isButton14Pressed == false){
                    if(focusSaisie < 4){
                        button14.setBackgroundResource(R.mipmap.small_button_pressed);
                        isButton14Pressed = true;
                        carac = button14.getText().charAt(0);
                        saisie[focusSaisie] = carac;
                        updateSaisie();
                        determineFocusSaisie();
                        isWon();

                    }else{
                        // Rien ne se passe : zone de saisie pleine
                    }

                }else{
                    button14.setBackgroundResource(R.mipmap.small_button);
                    isButton14Pressed = false;
                    removeCharacter(button14);
                    updateSaisie();
                    determineFocusSaisie();
                }
            }
        });


        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                char carac;
                if(isButton15Pressed == false){
                    if(focusSaisie < 4){
                        button15.setBackgroundResource(R.mipmap.small_button_pressed);
                        isButton15Pressed = true;
                        carac = button15.getText().charAt(0);
                        saisie[focusSaisie] = carac;
                        updateSaisie();
                        determineFocusSaisie();
                        isWon();

                    }else{
                        // Rien ne se passe : zone de saisie pleine
                    }

                }else{
                    button15.setBackgroundResource(R.mipmap.small_button);
                    isButton15Pressed = false;
                    removeCharacter(button15);
                    updateSaisie();
                    determineFocusSaisie();
                }
            }
        });


        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                char carac;
                if(isButton16Pressed == false){
                    if(focusSaisie < 4){
                        button16.setBackgroundResource(R.mipmap.small_button_pressed);
                        isButton16Pressed = true;
                        carac = button16.getText().charAt(0);
                        saisie[focusSaisie] = carac;
                        updateSaisie();
                        determineFocusSaisie();
                        isWon();

                    }else{
                        // Rien ne se passe : zone de saisie pleine
                    }

                }else{
                    button16.setBackgroundResource(R.mipmap.small_button);
                    isButton16Pressed = false;
                    removeCharacter(button16);
                    updateSaisie();
                    determineFocusSaisie();
                }
            }
        });


        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                char carac;
                if(isButton17Pressed == false){
                    if(focusSaisie < 4){
                        button17.setBackgroundResource(R.mipmap.small_button_pressed);
                        isButton17Pressed = true;
                        carac = button17.getText().charAt(0);
                        saisie[focusSaisie] = carac;
                        updateSaisie();
                        determineFocusSaisie();
                        isWon();

                    }else{
                        // Rien ne se passe : zone de saisie pleine
                    }

                }else{
                    button17.setBackgroundResource(R.mipmap.small_button);
                    isButton17Pressed = false;
                    removeCharacter(button17);
                    updateSaisie();
                    determineFocusSaisie();
                }
            }
        });


        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                char carac;
                if(isButton18Pressed == false){
                    if(focusSaisie < 4){
                        button18.setBackgroundResource(R.mipmap.small_button_pressed);
                        isButton18Pressed = true;
                        carac = button18.getText().charAt(0);
                        saisie[focusSaisie] = carac;
                        updateSaisie();
                        determineFocusSaisie();
                        isWon();

                    }else{
                        // Rien ne se passe : zone de saisie pleine
                    }

                }else{
                    button18.setBackgroundResource(R.mipmap.small_button);
                    isButton18Pressed = false;
                    removeCharacter(button18);
                    updateSaisie();
                    determineFocusSaisie();
                }
            }
        });

        // FIN - Activation des boutons

        // Activation zone de saisie

        saisie1 = (android.widget.Button) findViewById(R.id.blue_button1);
        saisie2 = (android.widget.Button) findViewById(R.id.blue_button2);
        saisie3 = (android.widget.Button) findViewById(R.id.blue_button3);
        saisie4 = (android.widget.Button) findViewById(R.id.blue_button4);

        focusSaisie = 0;

        undo_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });





        saisie1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char carac;
                if (saisie1.getText().charAt(0) != ' ') {
                    carac = saisie1.getText().charAt(0);
                    saisie[0] = ' ';
                    releaseButton(carac);
                    updateSaisie();
                    determineFocusSaisie();
                } else {

                }
            }
        });

        saisie2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char carac;
                if(saisie2.getText().charAt(0) != ' '){
                    carac = saisie2.getText().charAt(0);
                    saisie[1] = ' ';
                    releaseButton(carac);
                    updateSaisie();
                    determineFocusSaisie();
                }else{

                }


            }
        });

        saisie3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char carac;
                if (saisie3.getText().charAt(0) != ' ') {
                    carac = saisie3.getText().charAt(0);
                    saisie[2] = ' ';
                    releaseButton(carac);
                    updateSaisie();
                    determineFocusSaisie();
                } else {

                }
            }
        });

        saisie4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char carac;
                if (saisie4.getText().charAt(0) != ' ') {
                    carac = saisie4.getText().charAt(0);
                    saisie[3] = ' ';
                    releaseButton(carac);
                    updateSaisie();
                    determineFocusSaisie();
                } else {

                }
            }
        });












    }
    @Override
    public void onClick(android.view.View v){
    }


    public void releaseButton(char carac){
        if(button1.getText().charAt(0) == carac && isButton1Pressed == true){
            button1.setBackgroundResource(R.mipmap.small_button);
            isButton1Pressed = false;
        }else if(button2.getText().charAt(0) == carac && isButton2Pressed == true){
            button2.setBackgroundResource(R.mipmap.small_button);
            isButton2Pressed = false;
        }else if(button3.getText().charAt(0) == carac && isButton3Pressed == true){
            button3.setBackgroundResource(R.mipmap.small_button);
            isButton3Pressed = false;
        }else if(button4.getText().charAt(0) == carac && isButton4Pressed == true){
            button4.setBackgroundResource(R.mipmap.small_button);
            isButton4Pressed = false;
        }else if(button5.getText().charAt(0) == carac && isButton5Pressed == true){
            button5.setBackgroundResource(R.mipmap.small_button);
            isButton5Pressed = false;
        }else if(button6.getText().charAt(0) == carac && isButton6Pressed == true){
            button6.setBackgroundResource(R.mipmap.small_button);
            isButton6Pressed = false;
        }else if(button7.getText().charAt(0) == carac && isButton7Pressed == true){
            button7.setBackgroundResource(R.mipmap.small_button);
            isButton7Pressed = false;
        }else if(button8.getText().charAt(0) == carac && isButton8Pressed == true){
            button8.setBackgroundResource(R.mipmap.small_button);
            isButton8Pressed = false;
        }else if(button9.getText().charAt(0) == carac && isButton9Pressed == true){
            button9.setBackgroundResource(R.mipmap.small_button);
            isButton9Pressed = false;
        }else if(button10.getText().charAt(0) == carac && isButton10Pressed == true){
            button10.setBackgroundResource(R.mipmap.small_button);
            isButton10Pressed = false;
        }else if(button11.getText().charAt(0) == carac && isButton11Pressed == true){
            button11.setBackgroundResource(R.mipmap.small_button);
            isButton11Pressed = false;
        }else if(button12.getText().charAt(0) == carac && isButton12Pressed == true){
            button12.setBackgroundResource(R.mipmap.small_button);
            isButton12Pressed = false;
        }else if(button13.getText().charAt(0) == carac && isButton13Pressed == true){
            button13.setBackgroundResource(R.mipmap.small_button);
            isButton13Pressed = false;
        }else if(button14.getText().charAt(0) == carac && isButton14Pressed == true){
            button14.setBackgroundResource(R.mipmap.small_button);
            isButton14Pressed = false;
        }else if(button15.getText().charAt(0) == carac && isButton15Pressed == true){
            button15.setBackgroundResource(R.mipmap.small_button);
            isButton15Pressed = false;
        }else if(button16.getText().charAt(0) == carac && isButton16Pressed == true){
            button16.setBackgroundResource(R.mipmap.small_button);
            isButton16Pressed = false;
        }else if(button17.getText().charAt(0) == carac && isButton17Pressed == true){
            button17.setBackgroundResource(R.mipmap.small_button);
            isButton17Pressed = false;
        }else{
            button18.setBackgroundResource(R.mipmap.small_button);
            isButton18Pressed = false;
        }
    }


    public void determineFocusSaisie(){
        int focus = 0;
        if(saisie[0] == ' '){
            focus = 0;
        }else if(saisie[1] == ' '){
            focus = 1;
        }else if(saisie[2] == ' '){
            focus = 2;
        }else if(saisie[3] == ' '){
            focus = 3;
        }else{
            focus = 4;
        }
        focusSaisie = focus;
    }


    public void updateSaisie(){
        String string0 = Character.toString(saisie[0]);
        saisie1.setText(string0);

        String string1 = Character.toString(saisie[1]);
        saisie2.setText(string1);

        String string2 = Character.toString(saisie[2]);
        saisie3.setText(string2);

        String string3 = Character.toString(saisie[3]);
        saisie4.setText(string3);





    }


    public void removeCharacter(android.widget.Button button){

        // Chercher le caractere a supprimer
        int index;
        if(saisie[0] == button.getText().charAt(0)){
            index = 0;
        }else if(saisie[1] == button.getText().charAt(0)){
            index = 1;
        }else if(saisie[2] == button.getText().charAt(0)){
            index = 2;
        }else{
            index = 3;
        }
        // Supprmier le caractère
        saisie[index] = ' ';

    }


    public void win(){

        //création de notre item
        Intent defineIntent = new Intent(FourLettersLevel.this, WinActivity.class);
        // objet qui vas nous permettre de passe des variables ici la variable passInfo
        Bundle objetbunble = new Bundle();
        objetbunble.putString("passInfo", levelS);
        // on passe notre objet a notre activities
        defineIntent.putExtras(objetbunble );
        // on appelle notre activité
        startActivity(defineIntent);
        finish();





    }

    public void isWon(){
        boolean isWon;
        if(saisie[0] == answer.charAt(0) && saisie[1] == answer.charAt(1) && saisie[2] == answer.charAt(2) && saisie[3] == answer.charAt(3)){
            win();
        }else{

        }
    }

    public static FourLettersLevel getInstance(){
        return FourLettersLevel;
    }







}
