package getresult.example.asus.nottspark;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

public class ParkerFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_parker_fragment, null);
    }
}
