package com.example.android.miwok;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.view.menu.ListMenuItemView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {
    private static class ViewHolder {
        TextView defaultList;
        TextView miwokList;
        ImageView iconView;

    }

    /** Resource ID for the background color for this list of words */
    private int mColorResourceId;

    public WordAdapter(Context context, ArrayList<Word> words, int colorResourceId) {
        super(context, 0, words);

        mColorResourceId = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //Get the data item for this position
        Word word = getItem(position);
        //view lookup cache stored in tag
        ViewHolder viewHolder;

        //Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.list_item, parent, false);
            viewHolder.defaultList = (TextView) convertView.findViewById(R.id.eng_word);
            viewHolder.miwokList = (TextView) convertView.findViewById(R.id.miwok_word);
            viewHolder.iconView = (ImageView) convertView.findViewById(R.id.icon);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        assert word != null;
        viewHolder.defaultList.setText(word.getDefaultTranslation());
        viewHolder.miwokList.setText(word.getMiwokTranslation());
        //check if an image is provided for this word or not
        if (word.hasImage()) {
            //if an image is available, dispaly the image based on the resource ID
            viewHolder.iconView.setImageResource(word.getImageResourceId());
            //make sure the view is visible
            viewHolder.iconView.setVisibility(View.VISIBLE);
        } else {
            //otherwise hide the image view (set the visibility to Gone)
            viewHolder.iconView.setVisibility(View.GONE);
        }
        //set the theme color for the list item
        View textContainer = convertView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);

        textContainer.setBackgroundColor(color);
        return convertView;
    }


}
