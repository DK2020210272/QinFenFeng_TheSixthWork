package com.example.qinfenfeng_the_sixthwork;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ThirdFragment extends Fragment {
    private View view;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_third,container,false);
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        Toast.makeText(view.getContext(),"你切换到了第3个页面",Toast.LENGTH_SHORT).show();
    }

}
