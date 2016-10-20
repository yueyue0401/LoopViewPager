package com.example.a2055.loopviewpager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by 2055 on 2016/10/20.
 */

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    public static final String NUMBER_OBJECT = "numberObject";
    private int[] datas = new int[]{0, 1, 2, 3, 4};
    private int lenData = datas.length;

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = new FragmentObject();
        Bundle args = new Bundle();
        args.putInt(NUMBER_OBJECT, datas[position % lenData]);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public int getCount() {
        return lenData * 2;
    }
}
