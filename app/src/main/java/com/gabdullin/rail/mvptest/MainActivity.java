package com.gabdullin.rail.mvptest;

import android.os.Bundle;

import com.gabdullin.rail.mvptest.users.list.User;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportFragmentManager().beginTransaction().add(android.R.id.content, new MainFragment()).commit();
    }

    private List<User> getTempUsers(){
        List<User> users = new ArrayList<>();
        users.add(new User(1, "Вася", "@vasya", "vc.ru", "vc.ru", ))
        return users;
    }
}
