package com.example.yobbopel.myapplication;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity implements AdapterView.OnItemClickListener {

    ListView listView;
    List<ItemTakePay> rowItems;
    public static final String[] titles = new String[] { "Strawberry",
            "Banana", "Orange", "Mixed" };

    public static final String[] descriptions = new String[] {
            "It is an aggregate accessory fruit",
            "It is the largest herbaceous flowering plant", "Citrus Fruit",
            "Mixed Fruits" };

    public static final Integer[] images = { R.drawable.report,
            R.drawable.report, R.drawable.report, R.drawable.report };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rowItems = new ArrayList<ItemTakePay>();
        for (int i = 0; i < titles.length; i++) {
            ItemTakePay item = new ItemTakePay(images[i], titles[i], descriptions[i], 123456);
            rowItems.add(item);
        }

        listView = (ListView) findViewById(R.id.list);
        AdapterItemTakePay adapter = new AdapterItemTakePay(this,
                R.layout.item_take_pay_layout, rowItems);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);



        //Toast.makeText(MainActivity.this, item.get(0).getTitle(), Toast.LENGTH_LONG).show();
    }
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position,
                            long id) {
        Toast toast = Toast.makeText(getApplicationContext(),
                "Item " + (position + 1) + ": " + rowItems.get(position),
                Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.BOTTOM|Gravity.CENTER_HORIZONTAL, 0, 0);
        toast.show();
    }
}
