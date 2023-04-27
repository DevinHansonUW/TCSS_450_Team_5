package com.example.tcss_450_team_5.ui.contacts;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tcss_450_team_5.R;
import com.example.tcss_450_team_5.databinding.FragmentContactCardBinding;

import java.util.List;

public class ContactRecyclerViewAdapter extends RecyclerView.Adapter<ContactRecyclerViewAdapter.ContactViewHolder> {
    private final List<Contact> myContacts;

    public ContactRecyclerViewAdapter (List<Contact> items) {
        this.myContacts = items;
    }

    @NonNull
    @Override
    public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ContactViewHolder(LayoutInflater
                .from(parent.getContext()).inflate(R.layout.fragment_contact_card, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ContactViewHolder holder, int position) {
        holder.setContact(myContacts.get(position));
    }

    @Override
    public int getItemCount() {
        return myContacts.size();
    }

    public class ContactViewHolder extends RecyclerView.ViewHolder {
        public final View myView;
        public FragmentContactCardBinding binding;
        private Contact myContact;

        public ContactViewHolder (View view) {
            super(view);
            myView = view;
            binding = FragmentContactCardBinding.bind(view);
        }

        void setContact (final Contact contact) {
            myContact = contact;
            binding.textView2.setText(contact.getMyUsername());
            binding.textView2.setVisibility(View.VISIBLE);
        }
    }

}
