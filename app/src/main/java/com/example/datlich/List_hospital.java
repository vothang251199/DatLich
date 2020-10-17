package com.example.datlich;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class List_hospital extends AppCompatActivity {
    private RecyclerView rcvUser;
    private UserAdapter userAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_hospital);

        rcvUser = findViewById(R.id.rcv_user);
        userAdapter = new UserAdapter(this);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        rcvUser.setLayoutManager(linearLayoutManager);

        userAdapter.setData(getListUser());
        rcvUser.setAdapter(userAdapter);
    }
    private List<User> getListUser(){
        List<User> list = new ArrayList<>();
        list.add(new User(R.drawable.vietnam, "Bệnh viện Gia đình"));
        list.add(new User(R.drawable.cho, "Bệnh viện Quốc Tế"));
        list.add(new User(R.drawable.calendar_logo, "Bệnh viện Đa Khoa Đà Nẵng"));
        list.add(new User(R.drawable.cinema, "Bệnh viện Ung Bứu"));
        list.add(new User(R.drawable.restaurant, "Bệnh viện Phụ Nữ"));
        list.add(new User(R.drawable.vietnam, "Bệnh viện Gia đình"));
        list.add(new User(R.drawable.cho, "Bệnh viện Quốc Tế"));
        list.add(new User(R.drawable.calendar_logo, "Bệnh viện Đa Khoa Đà Nẵng"));
        list.add(new User(R.drawable.cinema, "Bệnh viện Ung Bứu"));
        list.add(new User(R.drawable.restaurant, "Bệnh viện Phụ Nữ"));

        return list;
    }
}