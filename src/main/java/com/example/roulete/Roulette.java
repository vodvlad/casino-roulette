package com.example.roulete;

import javafx.animation.RotateTransition;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Paint;
import javafx.scene.text.Text;
import javafx.util.Duration;

public class Roulette {

    @FXML
    private Text number;

    @FXML
    private ImageView roulete;

    public void handlebtn1() throws Exception {

        int a = 0;
        int b = 360;
        int x = a + (int) (Math.random() * ((b - a) + 1));
        roulete.setRotate(0);
        String numb = rouletnum(x);
        RotateTransition rotateTransition = new RotateTransition();
        rotateTransition.setDuration(Duration.millis(1000));
        rotateTransition.setNode(roulete);
        rotateTransition.setByAngle(x);
        rotateTransition.setCycleCount(1);
        rotateTransition.setAutoReverse(false);
        rotateTransition.play();
        number.setText(numb);
        String[] data = numb.split(" ");
        if(data[1].equals("red")){
            number.setFill(Paint.valueOf("#E6154A"));
        } else if(data[1].equals("black")) {
            number.setFill(Paint.valueOf("#000000"));
        } else {
            number.setFill(Paint.valueOf("#00FF00"));
        }



    }

    private String rouletnum(int x) {

        if (x > 4 && x <= 12) {
            return "16 red";
        }
        if (x > 12 && x <= 23) {
            return "33 black";
        }
        if (x > 23 && x <= 32) {
            return "21 red";
        }
        if (x > 32 && x <= 42) {
            return "6 black";
        }
        if (x > 42 && x <= 51) {
            return "18 red";
        }
        if (x > 51 && x <= 62) {
            return "31 black";
        }
        if (x > 62 && x <= 70) {
            return "19 red";
        }
        if (x > 70 && x <= 80) {
            return "8 black";
        }
        if (x > 80 && x <= 89) {
            return "12 red";
        }
        if (x > 89 && x <= 99) {
            return "29 black";
        }
        if (x > 99 && x <= 108) {
            return "25 red";
        }
        if (x > 108 && x <= 118) {
            return "10 black";
        }
        if (x > 118 && x <= 128) {
            return "27 red";
        }
        if (x > 128 && x <= 137) {
            return "00 zero";
        }
        if (x > 137 && x <= 146) {
            return "1 red";
        }
        if (x > 146 && x <= 156) {
            return "13 black";
        }
        if (x > 156 && x <= 165) {
            return "36 red";
        }
        if (x > 165 && x <= 175) {
            return "24 black";
        }
        if (x > 175 && x <= 184) {
            return "3 red";
        }
        if (x > 184 && x <= 195) {
            return "15 black";
        }
        if (x > 195 && x <= 203) {
            return "34 red";
        }
        if (x > 203 && x <= 214) {
            return "22 black";
        }
        if (x > 214 && x <= 222) {
            return "5 red";
        }
        if (x > 222 && x <= 232) {
            return "17 black";
        }
        if (x > 232 && x <= 241) {
            return "32 red";
        }
        if (x > 241 && x <= 251) {
            return "20 black";
        }
        if (x > 251 && x <= 259) {
            return "7 red";
        }
        if (x > 259 && x <= 269) {
            return "11 black";
        }
        if (x > 269 && x <= 278) {
            return "30 red";
        }
        if (x > 278 && x <= 289) {
            return "26 black";
        }
        if (x > 289 && x <= 297) {
            return "9 red";
        }
        if (x > 297 && x <= 308) {
            return "28 black";
        }
        if (x > 308 && x <= 316) {
            return "0 zero";
        }
        if (x > 316 && x <= 326) {
            return "2 black";
        }
        if (x > 326 && x <= 335) {
            return "14 red";
        }
        if (x > 335 && x <= 345) {
            return "35 black";
        }
        if (x > 345 && x <= 354) {
            return "23 red";
        }
        if (x > 354 && x <= 360) {
            return "4 black";
        }
        if (x >= 0 && x <= 4) {
            return "4 black";
        }
        return null;
    }
}
