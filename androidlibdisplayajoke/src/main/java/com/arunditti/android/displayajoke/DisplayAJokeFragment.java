package com.arunditti.android.displayajoke;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class DisplayAJokeFragment extends Fragment {

    public DisplayAJokeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_display_ajoke, container, false);

        Intent intent = getActivity().getIntent();
        String joke = intent.getStringExtra(DisplayAJokeActivity.JOKE_KEY);
        TextView jokeTextView = (TextView) rootView.findViewById(R.id.tv_joke);
        jokeTextView.setText(joke);

        return rootView;
    }
}
