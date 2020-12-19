package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    Button mTop;
    Button mBottom;
    TextView mStoryText;
    int counter=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mBottom=(Button)findViewById(R.id.buttonBottom);
        mTop=(Button)findViewById(R.id.buttonTop);
        mStoryText=(TextView)findViewById(R.id.storyTextView);



        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mTop.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
               if (counter==1) {
                   mStoryText.setText(R.string.T3_Story);
                   mTop.setText(R.string.T3_Ans1);
                   mBottom.setText(R.string.T3_Ans2);
               }
               else if(counter==2&&mStoryText.getText().equals(getString((R.string.T3_Story)))){
                    mStoryText.setText(R.string.T6_End);
                    mTop.setVisibility(View.GONE);
                    mBottom.setVisibility(View.GONE);
               }
               else if(counter==2&&mStoryText.getText().equals(getString(R.string.T2_Story))){
                    mStoryText.setText(R.string.T3_Story);
                    mTop.setText(R.string.T3_Ans1);
                    mBottom.setText(R.string.T3_Ans2);
               }
               else if(counter==3&&mStoryText.getText().equals(getString(R.string.T3_Story))){
                   mStoryText.setText(R.string.T6_End);
                   mTop.setVisibility(View.GONE);
                   mBottom.setVisibility(View.GONE);
            }
                counter++;
        }
            });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mBottom.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(counter==1) {

                    mStoryText.setText(R.string.T2_Story);
                    mTop.setText(R.string.T2_Ans1);
                    mBottom.setText(R.string.T2_Ans2);
                }
                else if(counter==2&&mStoryText.getText().equals(getString(R.string.T3_Story))){
                    mStoryText.setText(R.string.T5_End);
                    mTop.setVisibility(View.GONE);
                    mBottom.setVisibility(View.GONE);
                }
                else if(counter==2&&mStoryText.equals(getString(R.string.T2_Story))){
                    mStoryText.setText(R.string.T4_End);
                    mTop.setVisibility(View.GONE);
                    mBottom.setVisibility(View.GONE);
                }
                else if(counter==3&&mStoryText.equals(getString(R.string.T3_Story))){
                        mStoryText.setText(R.string.T5_End);
                        mTop.setVisibility(View.GONE);
                        mBottom.setVisibility(View.GONE);
                }
                    counter++;

            }
        });

    }
}
