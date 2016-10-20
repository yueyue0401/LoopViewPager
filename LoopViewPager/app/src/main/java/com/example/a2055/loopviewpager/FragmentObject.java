package com.example.a2055.loopviewpager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by 2055 on 2016/10/20.
 */

public class FragmentObject extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.viewpager_item, container, false);
        Bundle args = getArguments();
        int position = args.getInt(ViewPagerAdapter.NUMBER_OBJECT);
        TextView text = (TextView) view.findViewById(R.id.textView1);
        text.setText(position + "");
        return view;
    }
}
