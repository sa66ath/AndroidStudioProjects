package jp.techinstitute.tabfragment;

import android.app.ActionBar;
import android.app.Fragment;
import android.app.FragmentTransaction;

/**
 * Created by ikeda on 2015/11/16.
 */
public class MyTabListener implements ActionBar.TabListener {
    private Fragment mFragment;

    public MyTabListener(Fragment fragment) {
        mFragment = fragment;
    }


    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
        ft.add(R.id.fragment, mFragment, null);
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {
        ft.remove(mFragment);
    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }
}
