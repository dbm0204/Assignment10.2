package com.example.dbm0204.assignment102;

import android.annotation.SuppressLint;
import android.app.ListFragment;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import static android.content.Context.MODE_PRIVATE;

/**
 *
 * My implementation of the List Fragment Class. It implements OnItemClickLsitener
 *
 */
public class MyListFragment extends ListFragment implements OnItemClickListener {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.list_fragment, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(getActivity(), R.array.Planets, android.R.layout.simple_list_item_1);
        setListAdapter(adapter);
        getListView().setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position,long id) {

        String data = (String) parent.getItemAtPosition(position);

        Toast.makeText(getActivity(), "data: " + data, Toast.LENGTH_SHORT).show();




        Intent intent = new Intent(getActivity(), FragClicked.class);
        intent.putExtra("DATAPASSED",data);
        startActivity(intent);
    }
}