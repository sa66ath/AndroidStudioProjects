package techinstitute.jp.fragmenttablet;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class DetailFragment extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if(container == null) {
            return null;
        }

        TextView rootView = new TextView(getActivity());
        rootView.setTextSize(18);
        rootView.setText(getArguments().getString("item" + "が選択されました"));
        return rootView;
    }
}
