package com.gabdullin.rail.mvptest;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.gabdullin.rail.mvptest.users.list.User;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;

class UserListAdapter extends RecyclerView.Adapter<UserListAdapter.UserItemViewHolder> {

    ArrayList<User> users;

    UserListAdapter(ArrayList<User> users) {
        this.users = users;
    }

    @NonNull
    @Override
    public UserItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new UserItemViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull UserItemViewHolder holder, int position) {
        holder.bindData(position);
    }



    @Override
    public int getItemCount() {
        return users.size();
    }

    public class UserItemViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.avatar)
        ImageView avatar;
        @BindView(R.id.name)
        TextView name;
        @BindView(R.id.user_name)
        TextView userName;

        public UserItemViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        void bindData(int position){
            name.setText(users.get(position).getName());
            userName.setText(users.get(position).getUserName());
        }


    }
}
