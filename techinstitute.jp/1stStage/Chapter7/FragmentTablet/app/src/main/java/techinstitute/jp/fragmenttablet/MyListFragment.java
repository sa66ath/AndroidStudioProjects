package techinstitute.jp.fragmenttablet;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.app.ListFragment;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class MyListFragment extends ListFragment {

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        String[] Data = {
                "リンゴ",
                "みかん",
                "梨",
                "ドリアン"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1, Data);
        setListAdapter(adapter);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        MainActivity activity = (MainActivity)getActivity();

        String itemStr = l.getItemAtPosition(position).toString();

        boolean hasDetail;
        View detail = activity.findViewById(R.id.detail);
        hasDetail = null != detail;

        if(hasDetail) {
            FragmentManager fm = activity.getFragmentManager();
            FragmentTransaction t = fm.beginTransaction();

            DetailFragment fragment = new DetailFragment();
            Bundle bundle = new Bundle();
            bundle.putString("item", itemStr);
            fragment.setArguments(bundle);

            t.replace(R.id.detail, fragment);
            t.commit();
        } else {
            Toast.makeText(getActivity(), itemStr, Toast.LENGTH_SHORT).show();
        }
    }
}
