package com.example.project;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class PagerAdapter2 extends FragmentStatePagerAdapter {
    int myNumberOfTabs;
    public PagerAdapter2(@NonNull FragmentManager fm, int numOfTabs) {
        super(fm, numOfTabs);
        this.myNumberOfTabs=numOfTabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new BeginnerManFragment();
            case 1: return  new IntermediateManFragment();
            case 2: return new AdvancedManFragment();
            default: return null;
        }

    }

    @Override
    public int getCount() {
        return myNumberOfTabs;
    }

}
