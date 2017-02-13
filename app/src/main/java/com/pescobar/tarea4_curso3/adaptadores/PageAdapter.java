package com.pescobar.tarea4_curso3.adaptadores;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by PabloCesar on 10/02/2017.
 */

public class PageAdapter extends FragmentPagerAdapter {
    //incrustando un fragment en cada tab

    private ArrayList<Fragment> fragments;


    public PageAdapter(FragmentManager fm, ArrayList<Fragment> fragments) {
        super(fm);
        this.fragments= fragments;
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }



}
