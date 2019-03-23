package br.com.philippesis.dynamicviewpager_v1;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class DemoFragmentCollectionAdaoter extends FragmentStatePagerAdapter {

    private int itensCount = 0;

    public DemoFragmentCollectionAdaoter(FragmentManager fm, int i) {
        super(fm);
        itensCount = i;
    }

    @Override
    public Fragment getItem(int i) {

        DemoFragment demoFragment = new DemoFragment();

        Bundle bundle = new Bundle();

        i = i + 1;
        bundle.putString("msg", "Helo from page: "+i);
        demoFragment.setArguments(bundle);

        return demoFragment;
    }

    @Override
    public int getCount() {
        return itensCount;
    }

}
