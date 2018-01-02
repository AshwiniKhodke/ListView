package com.example.intel.listgrid;

import android.service.autofill.Dataset;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<String> dataset=new ArrayList<>();
        dataset.add("Android");
        dataset.add("ios");
        dataset.add("Symbian");
        dataset.add("Windows");
        dataset.add("Bata");
        dataset.add("Rim");
       ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,dataset);
        ((ListView)findViewById(R.id.listVw)).setAdapter(adapter);
        /*((ListView)findViewById(R.id.listVw)).setOnItemClickListener(this::onItemClick);
        findViewById(R.id.btnOkay).setOnClickListener(this::onOkayClicked);*/

    }
   /* private void onItemClick(AdapterView<?> adapterView, View view, int pos, long id){
        String osAtPos = adapter.getItem(pos);
        ((EditText)findViewById(R.id.edtOs)).setText(osAtpos));
    }
    private void onOkayClicked(View view)
    {
        String os=((EditText)findViewById(R.id.edtOs)).getText().toString();
        Dataset.add(os);
        adapter.notifyDataSetChanged();

    }*/

}
