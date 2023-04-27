package com.example.tcss_450_team_5.ui.contacts;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tcss_450_team_5.R;
public class ContactFragment extends Fragment {


    public ContactFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_contact, container, false);
        if (view instanceof RecyclerView) {
            ((RecyclerView) view).setLayoutManager(new GridLayoutManager(getContext(), 2));

            ((RecyclerView) view).setAdapter(
                    new ContactRecyclerViewAdapter(ContactGenerator.getContactList())
            );
        }

        return view;
    }
}