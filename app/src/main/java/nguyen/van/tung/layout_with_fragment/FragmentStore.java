package nguyen.van.tung.layout_with_fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Tung Nguyen Van on 1/19/2018.
 */

public class FragmentStore extends android.support.v4.app.Fragment {
    View view;
    public FragmentStore() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.store_fragment,container,false);
        return view;
    }
}
