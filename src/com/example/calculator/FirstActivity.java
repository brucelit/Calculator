package com.example.calculator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class FirstActivity extends Activity {

	// private EditText ed1=null;
	// private EditText ed2=null;
	// private Button btn1=null;
	// private Button btn2=null;
	// private Button btn3=null;
	// private Button btn4=null;
	private EditText et1, et2;
	private Button btn1, btn2, btn3, btn4;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.first);
		et1 = (EditText) findViewById(R.id.ed1);
		et2 = (EditText) findViewById(R.id.ed2);
		btn1 = (Button) findViewById(R.id.btn1);
		btn2 = (Button) findViewById(R.id.btn2);
		btn3 = (Button) findViewById(R.id.btn3);
		btn4 = (Button) findViewById(R.id.btn4);
		btn1.setText("+");
		btn1.setText(R.string.btn1);
		btn2.setText(R.string.btn2);
		btn3.setText(R.string.btn3);
		btn4.setText(R.string.btn4);
		btn1.setOnClickListener(new btnListener());
		btn2.setOnClickListener(new btnListener());
		btn3.setOnClickListener(new btnListener());
		btn4.setOnClickListener(new btnListener());
	}

	class btn1Listener implements OnClickListener {

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			String ed1Str = et1.getText().toString();
			String ed2Str = et2.getText().toString();
			int ed1Int = Integer.parseInt(ed1Str);
			int ed2Int = Integer.parseInt(ed2Str);
			int a = ed1Int + ed2Int;
			String b = "" + a;
			Log.e("result", b);
			Intent intent = new Intent();
			intent.putExtra("one", b);
			intent.setClass(FirstActivity.this, SecondActivity.class);
			FirstActivity.this.startActivity(intent);
		}
	}

	class btnListener implements OnClickListener {

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			int a = Integer.parseInt(et1.getText().toString().trim());
			int b = Integer.parseInt(et2.getText().toString().trim());
			int result=0;
			if(v==btn1){
				result = a - b;
			}
			if(v==btn2){
				result = a + b;
			}
			if(v==btn3){
				result = a * b;
			}
			if(v==btn4){
				if(b!=0){
					result = a / b;
				}
				if(b==0){
					result=999999;
				}
			}
			Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
			intent.putExtra("one", ""+result);
			FirstActivity.this.startActivity(intent);
		}
	}

}
