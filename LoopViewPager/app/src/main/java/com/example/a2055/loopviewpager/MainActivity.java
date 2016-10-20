package com.example.a2055.loopviewpager;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ViewPagerAdapter pagerAdapter;
    private ViewPager viewPager;
    private int pagerPosition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager) findViewById(R.id.viewPager);

        pagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(pagerAdapter);
        viewPager.addOnPageChangeListener(pagerChangeListener);
    }

    private ViewPager.OnPageChangeListener pagerChangeListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        }

        @Override
        public void onPageSelected(int position) {
            pagerPosition = position;
        }

        @Override
        public void onPageScrollStateChanged(int state) {
            if (state == ViewPager.SCROLL_STATE_IDLE) {
                setViewPagerLoopPosition();
            }
        }
    };

    private void setViewPagerLoopPosition() {
        final int count = pagerAdapter.getCount();
        if (pagerPosition == 0) {
            viewPager.setCurrentItem(count / 2, false);
        } else if (pagerPosition == count - 1) {
            viewPager.setCurrentItem(count / 2 - 1, false);
        }

    }


}
