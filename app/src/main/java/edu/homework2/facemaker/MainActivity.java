package edu.homework2.facemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Spinner;

/*
@author Sierra Nieland
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialize FaceController with access to face
        Face faceMaker = (Face) findViewById(R.id.face);
        FaceController mainFaceController = new FaceController(faceMaker);

        //initialize seekbars
        SeekBar redBar = (SeekBar) findViewById(R.id.redBar);
        redBar.setOnSeekBarChangeListener(mainFaceController);

        SeekBar greenBar = (SeekBar) findViewById(R.id.greenBar);
        greenBar.setOnSeekBarChangeListener(mainFaceController);

        SeekBar blueBar = (SeekBar) findViewById(R.id.blueBar);
        blueBar.setOnSeekBarChangeListener(mainFaceController);

        //initialize spinner
        Spinner hairSpinner = (Spinner) findViewById(R.id.spinner);
        //I could not get the spinner to appear nor input options for the spinner.

        //initialize random face button
        Button randomFaceButton = (Button) findViewById(R.id.randomFaceButton);
        randomFaceButton.setOnClickListener(mainFaceController);

    }
}
