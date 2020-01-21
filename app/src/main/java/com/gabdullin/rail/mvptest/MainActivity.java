package com.gabdullin.rail.mvptest;

import android.os.Bundle;

import com.gabdullin.rail.mvptest.users.list.User;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportFragmentManager().beginTransaction().add(android.R.id.content, new MainFragment(getTempUsers())).commit();
    }

    private ArrayList<User> getTempUsers(){
        ArrayList<User> users = new ArrayList<>();
        users.add(new User(1, "Вася", "@vasya", "vc.ru", "vc.ru"));
        users.add(new User(2, "Петя", "@petya", "vc.ru", "vc.ru"));
        users.add(new User(3, "Саша", "@sasha", "vc.ru", "vc.ru"));
        users.add(new User(4, "Настя", "@nastya", "vc.ru", "vc.ru"));
        users.add(new User(5, "Катя", "@katya", "vc.ru", "vc.ru"));
        users.add(new User(6, "Dasha", "@dasha", "vc.ru", "vc.ru"));
        return users;
    }
}
