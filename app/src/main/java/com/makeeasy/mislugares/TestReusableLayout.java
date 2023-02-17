package com.makeeasy.mislugares;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class TestReusableLayout extends Fragment {

    private TextView spinnerTextView;

    String spinnerText = "spinnerText";

    public TestReusableLayout(String spinnerTextView) {
        this.spinnerText = spinnerText;
    }

    public TestReusableLayout() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView =(ViewGroup)inflater.inflate(R.layout.test_resusable_widgets,container,false);
        spinnerTextView = rootView.findViewById(R.id.textDescription);
        spinnerTextView.setText(this.spinnerText);

        return rootView;
    }


    public void setText(String text){
        spinnerTextView.setText(text);
    }
}
