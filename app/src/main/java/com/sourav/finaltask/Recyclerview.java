package com.sourav.finaltask;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Recyclerview extends AppCompatActivity {

    int[] images;
    String[] names;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

        recyclerView = findViewById(R.id.recyclerView);
        images = new int[]{ R.drawable.google, R.drawable.apple, R.drawable.lion };
        names = new String[]{"google", "apple", "lion",  };

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager( Recyclerview.this);

        VersionAdapter adapter = new VersionAdapter(Recyclerview.this, getList(images, names) );
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);

    }

    private List<AndroidVersion> getList(int[] images,String[] names){
        List<AndroidVersion> list= new ArrayList<>();

        for(int i=0; i<images.length; i++){
            AndroidVersion version=new AndroidVersion();
            version.setImage(images[i]);
            version.setName(names[i]);
            list.add(version);
        }
        return list;
    }
}