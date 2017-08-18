package com.example.android.miwok;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("one", "lutti", R.drawable.number_one, R.raw.number_one));
        words.add(new Word("two", "otiiko", R.drawable.number_two, R.raw.number_two));
        words.add(new Word("three", "tolookosu", R.drawable.number_three, R.raw.number_three));
        words.add(new Word("four", "oyyisa", R.drawable.number_four, R.raw.number_four));
        words.add(new Word("five", "massokka", R.drawable.number_five, R.raw.number_five));
        words.add(new Word("six", "temmokka", R.drawable.number_six, R.raw.number_six));
        words.add(new Word("seven", "kenekaku", R.drawable.number_seven, R.raw.number_seven));
        words.add(new Word("eight", "kawinta", R.drawable.number_eight, R.raw.number_eight));
        words.add(new Word("nine", "wo’e", R.drawable.number_nine, R.raw.number_nine));
        words.add(new Word("ten", "na’aacha", R.drawable.number_ten, R.raw.number_ten));

//        // Find the root view so we can add child views to it
//        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);

//        int index = 0;
//        while (index < words.size()) {
//            TextView wordView = new TextView(this);
//            wordView.setText(words.get(index));
//            rootView.addView(wordView);
//            index++;
//        }

//        // Keep looping until we've reached the end of the list (which means keep looping
//        // as long as the current index position is less than the length of the list).
//        // The index variable keeps track of our current position in the list and
//        // increments by 1 each time the code in the loop is executed.
//        for (int index = 0; index < words.size(); index++) {
//            // Create a new TextView
//            TextView wordView = new TextView(this);
//
//            // Set the text to be word at the current index
//            wordView.setText(words.get(index));
//
//            // Add this TextView as another child to the root view of this layout
//            rootView.addView(wordView);
//        }

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_numbers);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                //Retrieving current ListView's position that got selected by users.
                Word word = words.get(position);

                //Creating an MediaPlayer object and retrieving AudioResourceId based on ListView Position that got selected.
                mMediaPlayer = MediaPlayer.create(NumbersActivity.this, word.getAudioResourceId());

                //Call start method to play the audio files
                mMediaPlayer.start();
            }
        });

    }
}
