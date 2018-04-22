package com.example.iremind.adapters;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.iremind.BlankFragment;

public class TabPagerFragment extends FragmentPagerAdapter {

    private String[] tabs;

    public TabPagerFragment(FragmentManager fm) {
        super(fm);
        tabs = new String[]{
                "Tab1", "Напоминания", "Tab2"
        };
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabs[position];
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return BlankFragment.getInstance();

            case 1:
                return BlankFragment.getInstance();
            case 2:
                return BlankFragment.getInstance();
        }
       return null;
    }

    @Override
    public int getCount() {
        return tabs.length;
    }
}
