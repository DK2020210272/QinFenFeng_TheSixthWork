package com.example.qinfenfeng_the_sixthwork;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class FirstFragment  extends Fragment {
    private View view;
    private FragmentItem_1 fragmentItem_1 = new FragmentItem_1();
    private FragmentItem_2 fragmentItem_2 = new FragmentItem_2();
    private FragmentItem_3 fragmentItem_3 = new FragmentItem_3();
    private List<Fragment> fragmentList = new ArrayList<>();
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_first,container,false);

        fragmentList.add(fragmentItem_1);
        fragmentList.add(fragmentItem_2);
        fragmentList.add(fragmentItem_3);

            TabLayout tabLayout = view.findViewById(R.id.tab_layout_2);
            ViewPager viewPager =view.findViewById(R.id.vp_layout_2);
            ItemAdapter itemAdapter = new ItemAdapter(getChildFragmentManager(),ItemAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT,fragmentList);
            viewPager.setAdapter(itemAdapter);
            tabLayout.setupWithViewPager(viewPager);
            
        return view;
    }
    @Override
    public void onResume() {
        super.onResume();
        Toast.makeText(view.getContext(),"你切换到了第1个页面",Toast.LENGTH_SHORT).show();
    }
}
