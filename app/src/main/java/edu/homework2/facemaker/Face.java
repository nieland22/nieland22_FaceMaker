package edu.homework2.facemaker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.SurfaceView;

import java.util.Random;

/*
@author Sierra Nieland
 */

public class Face extends SurfaceView {

    protected int skinColor;
    protected int eyeColor;
    protected int hairColor;
    protected int hairStyle;
    protected Paint skin = new Paint();
    protected Paint eye = new Paint();
    protected Paint hair = new Paint();
    protected Paint color = new Paint();

    public Face(Context context, AttributeSet attrs)
    {
        super(context, attrs);
        setWillNotDraw(false);
        randomize();
    }

    public void setSkinColor(int red, int green, int blue)
    {
         skinColor = Color.rgb(red, green, blue);
    }

    public void setEyeColor(int red, int green, int blue)
    {
        eyeColor = Color.rgb(red, green, blue);
    }

    public void setHairColor(int red, int green, int blue)
    {
        hairColor = Color.rgb(red, green, blue);
    }

    public void randomize()
    {
        Random random = new Random();
        skinColor = Color.rgb(random.nextInt(256), random.nextInt(256), random.nextInt(256));
        eyeColor = Color.rgb(random.nextInt(256), random.nextInt(256), random.nextInt(256));
        hairColor = Color.rgb(random.nextInt(256), random.nextInt(256), random.nextInt(256));
        hairStyle = random.nextInt(3);

    }

    public void drawHair(Canvas canvas)
    {
        //hair
        color.setColor(hairColor);
        canvas.drawCircle(850, 400, 100, color);
    }

    public void drawFace(Canvas canvas)
    {
        //face
        color.setColor(skinColor);
        canvas.drawCircle(850, 600, 250, color);
    }

    public void drawEyes(Canvas canvas)
    {
        //left eye
        color.setColor(Color.WHITE);
        canvas.drawCircle(790, 525, 50, color);
        color.setColor(eyeColor);
        canvas.drawCircle(790, 525, 32, color);
        color.setColor(Color.BLACK);
        canvas.drawCircle(790, 525, 20, color);

        //right eye
        color.setColor(Color.WHITE);
        canvas.drawCircle(900, 525, 50, color);
        color.setColor(eyeColor);
        canvas.drawCircle(900, 525,32, color);
        color.setColor(Color.BLACK);
        canvas.drawCircle(900, 525, 20, color);
    }

    public void drawMouth(Canvas canvas)
    {
        //mouth
        color.setColor(Color.BLACK);
        canvas.drawCircle(850, 650, 30, color);
        color.setColor(skinColor);
        canvas.drawCircle(850, 625, 30, color);
    }

    public void onDraw(Canvas canvas)
    {
        //hair
        drawHair(canvas);

        //face
        drawFace(canvas);

        //eyes
        drawEyes(canvas);

        //mouth
        drawMouth(canvas);
    }
}
