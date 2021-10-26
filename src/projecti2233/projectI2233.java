package projecti2233;

import javafx.scene.paint.Color;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

public class projectI2233 {

    GraphicsContext gc;
    Canvas canvas;
    double tab[];

    public projectI2233(GraphicsContext gc, double []tab) {
        this.gc = gc;
        this.canvas = gc.getCanvas();
        this.tab = tab;
    }

    public Color newColor() {
        Color c;
        int r, g, b;
        r = (int) (Math.random() * 256);
        g = (int) (Math.random() * 256);
        b = (int) (Math.random() * 256);
        c = Color.rgb(r, g, b);
        return c;
    }

    public void draw() {
        double width = gc.getCanvas().getWidth(), height = gc.getCanvas().getHeight();
        int size = Math.min((int)canvas.getWidth(),(int)canvas.getHeight());
//        float step = (float)(size / 9);
//        gc.setFill(Color.DARKGRAY);
//        gc.fillRect(0, 0, width, height);
//        gc.setFill(Color.WHITE);
//        float step = (float) (height/10);
//        
//        for (int i = 0; i < 10; i++) {
//            if (i % 2 != 0) {
//                gc.fillRect(0, i*step, width, step);
//            }
//        }
//
//        gc.translate(0,height);
//        gc.scale(1,-1);
//        float x,y=0,w,h;
//        float step1 = (float) (width/tab.length);
//        for(int j = 0; j < tab.length;j++) {
//            x = j*step1;
//            w=step1;
//            h=(float) (tab[j]*step);
//            gc.setFill(newColor());
//            gc.fillRect(x, y, w, h);
//        }
float step1 = (float) (height/10);
        for(int i=0;i<10;i++){
            if(i%2==0){
                gc.setFill(Color.DARKGRAY);
            }else{
                gc.setFill(Color.WHITE);
            }
            gc.fillRect(0, i*step1, width, step1);
        }
        float step = (float) (width/tab.length);
        gc.translate(0, height);
        gc.scale(1,-1);
        for(int j=0;j<tab.length;j++){
            gc.setFill(newColor());
            gc.fillRect(j*step, 0, step, tab[j]*step1);
        }
    }
}