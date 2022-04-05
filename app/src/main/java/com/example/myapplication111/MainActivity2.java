package com.example.myapplication111;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class MainActivity2 extends Fragment {
    ImageView imageView;
    int position;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View aboveView = inflater.inflate(R.layout.activity_main2, container, false);

        imageView = (ImageView) aboveView.findViewById(R.id.imageView2);
            if (position == 0) {
                Bundle bundle = getArguments();
                imageView.setImageResource(bundle.getInt("key"));

            }

            if (position == 1) {
                Bundle bundle = getArguments();
                imageView.setImageResource(bundle.getInt("key"));

            }

            if (position == 2) {
                Bundle bundle = getArguments();
                imageView.setImageResource(bundle.getInt("key"));

            }
            if (position == 3) {
                Bundle bundle = getArguments();
                imageView.setImageResource(bundle.getInt("key"));

            }
            if (position == 4) {
                Bundle bundle = getArguments();
                imageView.setImageResource(bundle.getInt("key"));

            }
            if (position == 5) {
                Bundle bundle = getArguments();
                imageView.setImageResource(bundle.getInt("key"));

            }
            if (position == 6) {
                Bundle bundle = getArguments();
                imageView.setImageResource(bundle.getInt("key"));

            }
            return aboveView;

        }



}
