package com.example.jenny.mvcstructure.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.jenny.mvcstructure.R;

import org.w3c.dom.Text;

public class MainFragment extends Fragment {

    int someVar;
    TextView tvHello;
    int x,y,z;

    public static MainFragment newInstance(int someVar){
        MainFragment fragment = new MainFragment();
        Bundle args = new Bundle();
        args.putInt("someVar",someVar);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        someVar = getArguments().getInt("someVar");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        initInstances(rootView);
        return rootView;
    }

    private void initInstances(View rootView) {
        tvHello = rootView.findViewById(R.id.tvHello);
    }

    public void setHelloText(String text){
        tvHello.setText(text);
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        //save State
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if(savedInstanceState != null){
            // restore State
        }
    }
}
