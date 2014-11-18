package com.example.calculator;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends Activity {

	private TextView tv1=null;
	private Button btn6=null;
		
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.result);
		Intent intent=getIntent();
		tv1=(TextView)findViewById(R.id.tv1);
		btn6=(Button)findViewById(R.id.btn6);
		String c=intent.getStringExtra("one");
		tv1.setText(c);
		btn6.setText("·µ»Ø");
		btn6.setOnClickListener(new btn6Listener()); 
	}
	public class btn6Listener implements OnClickListener{

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent intent =new Intent();
			intent.setClass(SecondActivity.this,FirstActivity.class);
			SecondActivity.this.startActivity(intent);
		}
		
	}
	
	

}
