package com.example.recycle_two;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class RecycleFragment extends Fragment {

    private ArrayList<String> nameList = new ArrayList<>();
    private RecyclerView nameRecycleView;
    private NameAdapter adapter = new NameAdapter(nameList);


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_recycle, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        nameRecycleView = view.findViewById(R.id.recycle_view);
        nameRecycleView.setAdapter(adapter);


    }

    private void loadData() {
        nameList.add("Manas");
        nameList.add("Tima");
        nameList.add("Alina");
        nameList.add("Marlis");
        nameList.add("Becbolsun");
        nameList.add("Kuba");
        nameList.add("Kuba");
        nameList.add("Kayra");
        nameList.add("Kayra");
        nameList.add("Kayra");
        nameList.add("Kayra");
        nameList.add("Aktilek");
        nameList.add("Islam");
        nameList.add("Asema");
        nameList.add("Alina");
        nameList.add("Asel");
        nameList.add("Aibek");
        nameList.add("Askar");

    }
}