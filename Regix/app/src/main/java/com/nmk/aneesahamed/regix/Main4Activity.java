package com.nmk.aneesahamed.regix;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {
    private ViewPager viewPager;
    private MyViewPagerAdapter myViewPagerAdapter;
    private LinearLayout dotsLayout;
    private TextView[] dots;
    private int[] ids;
    public Button next;
    public Button skip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        viewPager = (ViewPager) findViewById(R.id.view_pager);
        next = (Button) findViewById(R.id.next);
        skip = (Button) findViewById(R.id.skip);

        dotsLayout = (LinearLayout) findViewById(R.id.layoutDots);
        ids = new int[]{R.layout.activity_app_start, R.layout.startnext};
        slidedots(0);
        myViewPagerAdapter = new MyViewPagerAdapter();
        viewPager.setAdapter(myViewPagerAdapter);
        viewPager.addOnPageChangeListener(viewPagerPageChangeListener);

    }

    public void main_act(View view) {

    }

    public void next(View view) {
        int current = getItem(+1);
        if (current < ids.length) {

            viewPager.setCurrentItem(current);
        } else {
//go to login r sign up
        }
    }

    public int getItem(int i) {
        return viewPager.getCurrentItem() + i;
    }

    ViewPager.OnPageChangeListener viewPagerPageChangeListener = new ViewPager.OnPageChangeListener() {

        @Override
        public void onPageSelected(int position) {
            slidedots(position);

            // changing the next button text 'NEXT' / 'GOT IT'
            if (position == dots.length - 1) {
                // last page. make button text to GOT IT
                next.setText("Start");
                skip.setVisibility(View.GONE);
            } else {
                // still pages are left
                next.setText("Next");
                skip.setVisibility(View.VISIBLE);
            }

        }

        @Override
        public void onPageScrolled(int arg0, float arg1, int arg2) {

        }

        @Override
        public void onPageScrollStateChanged(int arg0) {

        }
    };

    private void slidedots(int currentPage) {
        dots = new TextView[ids.length];

        int[] colorsActive = getResources().getIntArray(R.array.array_dot_active);
        int[] colorsInactive = getResources().getIntArray(R.array.array_dot_inactive);

        dotsLayout.removeAllViews();
        for (int i = 0; i < dots.length; i++) {
            dots[i] = new TextView(this);
            dots[i].setText(Html.fromHtml("&#8226;"));
            dots[i].setTextSize(35);
            dots[i].setTextColor(colorsInactive[currentPage]);
            dotsLayout.addView(dots[i]);
        }
        if (dots.length > 0)
        {
            dots[currentPage].setTextColor(colorsActive[currentPage]);
    }
    }
    public  class MyViewPagerAdapter extends PagerAdapter
    {
        private LayoutInflater layoutInflater;

        public MyViewPagerAdapter() {
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            layoutInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            View view = layoutInflater.inflate(ids[position], container, false);
            container.addView(view);

            return view;
        }

        @Override
        public int getCount() {
            return dots.length;
        }

        @Override
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }


        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            View view = (View) object;
            container.removeView(view);
        }
    }
    }


