package com.example.tinhluongnhanvien;

import java.util.ArrayList;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends ActionBarActivity {
	
	EditText editMa, editTen;
	RadioGroup radGroup;
	RadioButton radChinhthuc, radThoivu;
	Button btnnhap;
	ListView lvnhanvien;
	ArrayList<Employee> listEmployee = new ArrayList<Employee>();
	MyArrayAdapter adapter;
	Employee employee = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		getControls();
		adapter = new MyArrayAdapter(this, R.layout.my_item_layout, listEmployee);
		lvnhanvien.setAdapter(adapter);
		btnnhap.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				processNhap();
			}
		});
	}
	
	public void processNhap()
	{
		int radID = radGroup.getCheckedRadioButtonId();
		if (radID == R.id.radChinhthuc)
		{
			employee = new FullTimeEmployee();
		}
		else if (radID == R.id.radThoivu)
		{
			employee = new PartTimeEmployee();
		}
		employee.setId(editMa.getText() + "");
		employee.setName(editTen.getText() + "");
		listEmployee.add(employee);
		adapter.notifyDataSetChanged();
	}
	
	private void getControls()
	{
		editMa = (EditText) findViewById(R.id.editMa);
		editTen = (EditText) findViewById(R.id.editTen);
		btnnhap = (Button) findViewById(R.id.btnnhap);
		lvnhanvien  = (ListView) findViewById(R.id.lvnhanvien);
		radGroup = (RadioGroup) findViewById(R.id.radiogroud1);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
