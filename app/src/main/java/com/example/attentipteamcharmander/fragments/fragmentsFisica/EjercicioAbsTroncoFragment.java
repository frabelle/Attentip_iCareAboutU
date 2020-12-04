package com.example.attentipteamcharmander.fragments.fragmentsFisica;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.attentipteamcharmander.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link EjercicioAbsTroncoFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class EjercicioAbsTroncoFragment extends Fragment {

    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

    public EjercicioAbsTroncoFragment() {
        // Required empty public constructor
    }

    public static EjercicioAbsTroncoFragment newInstance() {
        EjercicioAbsTroncoFragment fragment = new EjercicioAbsTroncoFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ejercicio_abs_tronco, container, false);
    }

    private void setup(@NonNull View view) {
        setupGif(view);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setup(view);
    }

    private void setupGif(View view) {
        ImageView imageView = view.findViewById(R.id.pruebaid);
        Glide.with(this).load(R.drawable.brazos_hombros).into(imageView);
    }
}