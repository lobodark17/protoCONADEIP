package mx.itesm.cem.mmf.protoconadeip;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by sandWolf on 06/10/2016.
 */
public class Pant1 extends Fragment {
    View rootView;
    ListView lv;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.pag1, container, false);

        String[] keys = { "eq1", "eq2" };
        int[] ids = { android.R.id.text1, android.R.id.text2 };
        String eq2 = "";
        String eq1 = "";
        List<HashMap<String, String>> datos = new ArrayList<HashMap<String, String>>();


        lv = (ListView)rootView.findViewById(R.id.listView1);

        for (int i = 0; i < 5; i++) {



                eq1 = "a"+i;



                eq2 = "b"+(i+2);



            HashMap<String, String> hashDatos = new HashMap<String, String>();
            hashDatos = new HashMap<String, String>();
            hashDatos.put("eq2", eq2);
            hashDatos.put("eq1", eq1);

            datos.add(hashDatos);
        }



        SimpleAdapter adapter = new SimpleAdapter(getActivity(), datos, android.R.layout.simple_selectable_list_item, keys, ids);

        lv.setAdapter(adapter);


        // Assign adapter to ListView SimpleAdapter adapter = new SimpleAdapter(getActivity(), fetch2, android.R.layout.simple_list_item_2, keys, ids);

        //lv.setAdapter(titleAdapter);


        return rootView;

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }
}
