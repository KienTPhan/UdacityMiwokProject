package com.example.android.miwok;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.miwok.*;

import java.util.ArrayList;

/**
 * Created by kienphan on 1/24/18.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    private static final String LOG_TAG = WordAdapter.class.getSimpleName();

    private int mColorResourceID;

    public WordAdapter(Activity context, ArrayList<Word> words, int colorResourceID) {
        super(context, 0, words);
        this.mColorResourceID = colorResourceID;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);

        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView defaultTranslationTextView = (TextView) listItemView.findViewById(R.id.defaultTranslation);

        defaultTranslationTextView.setText(currentWord.getDefaultTranslate());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView miwokTranslationTextView = (TextView) listItemView.findViewById(R.id.miwokTranslation);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        miwokTranslationTextView.setText(currentWord.getMiwokTranslate());

        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.imageIcon);

        if(currentWord.hasImage()) {
            iconView.setVisibility(View.VISIBLE);
            // Get the image resource ID from the current AndroidFlavor object and
            // set the image to iconView
            iconView.setImageResource(currentWord.getmImageResourceID());
        } else {
            iconView.setVisibility(View.GONE);
        }

        //Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        //set the theme color for the textAndImage container
        View textAndImageContainer = listItemView.findViewById(R.id.textAndImageContainer);
        //Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceID);
        //set the background color of the textcontainer of each listitem
        textContainer.setBackgroundColor(color);
        //set the background color for textAndImageViewContainer
        textAndImageContainer.setBackgroundColor(color);


        // Return the whole list item layout (containing 2 TextViews)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
