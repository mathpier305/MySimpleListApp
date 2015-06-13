package com.example.mylistapp;


import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	String [] myList ={"Andy Jack", "Anthony Boxue", "Avoni Dwight", "Beatrice Rice", "Bethony John", "Bundy Lonux", "Conjoun hun", "love me another day", "jessie is good", "what is that ", "no we are good", "believe in yourself", "nope another day", "deja vue not happening", "this is the end", "nope, this is the end", "Bye Bye not love"};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//ListView l = getListView();
		ListView l = (ListView) findViewById(R.id.listView1);
		//ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,myList );
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.activity_main, R.id.textView1, myList);
		
		l.setAdapter(adapter);
		l.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
				TextView textView = (TextView)arg1.findViewById(R.id.textView1);
				String message = textView.getText().toString();
				Toast.makeText(MainActivity.this, "YOu click on text :   "+message+" belongs to Row # :  "+arg2, Toast.LENGTH_SHORT).show();
				
			}
			
		});
	}
}
