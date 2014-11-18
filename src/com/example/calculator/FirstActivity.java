package com.example.calculator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class FirstActivity extends Activity {

	private EditText ed1=null;
	private EditText ed2=null;
	private Button btn1=null;
	private Button btn2=null;
	private Button btn3=null;
	private Button btn4=null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first);
        ed1=(EditText)findViewById(R.id.ed1);
        ed1=(EditText)findViewById(R.id.ed2);
        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        btn3=(Button)findViewById(R.id.btn3);
        btn4=(Button)findViewById(R.id.btn4);
        btn1.setText(R.string.btn1);
        btn2.setText(R.string.btn2);
        btn3.setText(R.string.btn3);
        btn4.setText(R.string.btn4);
        btn1.setOnClickListener(new btn1Listener());
        btn2.setOnClickListener(new btn2Listener());
        btn3.setOnClickListener(new btn3Listener());
        btn4.setOnClickListener(new btn4Listener());
    }
    
    class btn1Listener implements OnClickListener{

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			String ed1Str=ed1.getText().toString();
	        String ed2Str=ed2.getText().toString();
	        int ed1Int=Integer.parseInt(ed1Str);
	        int ed2Int=Integer.parseInt(ed2Str);
			int a=ed1Int-ed2Int;
			String b=""+a;
			Intent intent =new Intent();
			intent.putExtra("one",b);
			intent.setClass(FirstActivity.this,SecondActivity.class);
			FirstActivity.this.startActivity(intent);
		}	
    }
    
    class btn2Listener implements OnClickListener{

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			String ed1Str=ed1.getText().toString();
	        String ed2Str=ed2.getText().toString();
	        int ed1Int=Integer.parseInt(ed1Str);
	        int ed2Int=Integer.parseInt(ed2Str);
			int a=ed1Int-ed2Int;
			String b=""+a;
			Intent intent =new Intent();
			intent.putExtra("one",b);
			intent.setClass(FirstActivity.this,SecondActivity.class);
			FirstActivity.this.startActivity(intent);
		}	
    }
    
    class btn3Listener implements OnClickListener{

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			String ed1Str=ed1.getText().toString();
	        String ed2Str=ed2.getText().toString();
	        int ed1Int=Integer.parseInt(ed1Str);
	        int ed2Int=Integer.parseInt(ed2Str);
			int a=ed1Int-ed2Int;
			String b=""+a;
			Intent intent =new Intent();
			intent.putExtra("one",b);
			intent.setClass(FirstActivity.this,SecondActivity.class);
			FirstActivity.this.startActivity(intent);
		}	
    }
    
    class btn4Listener implements OnClickListener{

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			String ed1Str=ed1.getText().toString();
	        String ed2Str=ed2.getText().toString();
	        int ed1Int=Integer.parseInt(ed1Str);
	        int ed2Int=Integer.parseInt(ed2Str);
			int a=ed1Int-ed2Int;
			String b=""+a;
			Intent intent =new Intent();
			intent.putExtra("one",b);
			intent.setClass(FirstActivity.this,SecondActivity.class);
			FirstActivity.this.startActivity(intent);
		}	
    }
    
    


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.first, menu);
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
