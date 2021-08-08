package com.example.qinfenfeng_the_sixthwork;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.List;

public class ItemAdapter extends FragmentPagerAdapter {

    private List<Fragment> fragmentList;
    private String[] tabs={"嵌套1","嵌套2","嵌套3"};
    public ItemAdapter(@NonNull FragmentManager fm, int behavior,List<Fragment> fragmentList) {
        super(fm, behavior);
        this.fragmentList=fragmentList;
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabs[position];
    }
}
