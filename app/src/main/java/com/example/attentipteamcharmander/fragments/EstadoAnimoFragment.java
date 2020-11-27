package com.example.attentipteamcharmander.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.attentipteamcharmander.R;
import com.example.attentipteamcharmander.data.UserConfig;
import com.example.attentipteamcharmander.model.UserModel;

import java.security.InvalidParameterException;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link EstadoAnimoFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class EstadoAnimoFragment extends Fragment {

    public EstadoAnimoFragment() {
        // Required empty public constructor
    }

    public static EstadoAnimoFragment newInstance(String name) {
        EstadoAnimoFragment fragment = new EstadoAnimoFragment();

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
        return inflater.inflate(R.layout.fragment_estado_animo, container, false);
    }
}