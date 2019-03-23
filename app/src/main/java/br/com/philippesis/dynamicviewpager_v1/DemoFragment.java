package br.com.philippesis.dynamicviewpager_v1;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DemoFragment extends Fragment {

    private TextView textView;

    public DemoFragment () {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_demo, container, false);

        textView = view.findViewById(R.id.id_txt_display);
        String msg = getArguments().getString("msg");
        textView.setText(msg);

        return view;

    }
}
