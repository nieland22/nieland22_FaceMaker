package edu.homework2.facemaker;

/*
@author Sierra Nieland
 */

import android.view.View;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Spinner;

public class FaceController implements View.OnClickListener, SeekBar.OnSeekBarChangeListener, Spinner.OnItemSelectedListener, RadioGroup.OnCheckedChangeListener {

    private Face faceMaker;
    private int red;
    private int green;
    private int blue;
    private int eye;
    private int hair;
    private int skin;

    public FaceController(Face mainFace)
    {
        this.faceMaker=mainFace;
    }

    //OnClick methods
    @Override
    public void onClick(View view)
    {
        //draws random face when button is clicked
        faceMaker.randomize();
        faceMaker.invalidate();
    }

    //SeekBar methods
    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser)
    {
        int selectedBar = seekBar.getId();
        if(selectedBar == R.id.redBar)
        {
            red = seekBar.getProgress();
        }
        else if(selectedBar == R.id.greenBar)
        {
            green = seekBar.getProgress();
        }
        else if(selectedBar == R.id.blueBar)
        {
            blue = seekBar.getProgress();
        }

        //I could not figure out how to relate the changing of color to the radio buttons.
        //So skin, face, and hair all change at the same time rather than when each button is selected.
        faceMaker.setSkinColor(red, green, blue);
        faceMaker.setEyeColor(green, red, blue);
        faceMaker.setHairColor(blue, green, red);
        faceMaker.invalidate();
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar)
    {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar)
    {

    }

    //Spinner methods
    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l)
    {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView)
    {

    }

    //RadioGroup method
    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int checked)
    {

    }
}

/*
External Citation
Date: 30 September 2019
Problem: I could not link the seek bars separately.
Resource: android.developer (seek bars section) and stack overflow
 */
