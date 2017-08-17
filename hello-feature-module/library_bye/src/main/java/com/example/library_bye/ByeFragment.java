package com.example.library_bye;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/**
 * Created by gillis on 27/07/2017.
 */

public class ByeFragment extends android.support.v4.app.Fragment {

    public String TAG ="fragmenttest";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view =  inflater.inflate(com.google.android.instantapps.samples.feature.base.R.layout.base_layout, container,
                false);

        ViewGroup target = view.findViewById(com.google.android.instantapps.samples.feature.base.R.id.content_target);

        inflater.inflate(R.layout.fragment_a, target);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }
}
