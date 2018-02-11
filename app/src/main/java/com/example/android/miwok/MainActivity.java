/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the numbers category
        TextView numbers = (TextView) findViewById(R.id.numbers);

        // Set a click listener on that View
        numbers.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(numbersIntent);
            }
        });

        // Find the View that shows the Family Members TextView
        TextView familyMembers = (TextView) findViewById(R.id.family);

        // Set a click listener on familyMembers
        familyMembers.setOnClickListener(new View.OnClickListener(){
            //The code in this method will be executed when the FamilyMemers View is clicked on
            @Override
            public void onClick(View view) {
                Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(familyIntent);
            }
        });

        // Find the View that shows Colors
        TextView colors = (TextView) findViewById(R.id.colors);

        //set a click listener on colors TextView
        colors.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent colorsIntent = new Intent(MainActivity.this, ColorActivity.class);
                startActivity(colorsIntent);
            }
        });

        //Find the View that shows Phrases
        TextView phrases = (TextView) findViewById(R.id.phrases);

        // set a click listener on Phrases TextView
        phrases.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent phrasesIntent = new Intent(MainActivity.this, PhraseActivity.class);
                startActivity(phrasesIntent);
            }
        });
    }

    public void openNumbersList(View view) {
        //TODO: write your code here!
        Intent myIntent = new Intent(this, NumbersActivity.class);
        startActivity(myIntent);
    }
}
