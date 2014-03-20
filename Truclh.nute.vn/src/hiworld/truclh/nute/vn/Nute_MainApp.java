package hiworld.truclh.nute.vn;

import com.example.truclh.nute.vn.R;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Nute_MainApp extends Activity {
	Button mBtn_thongtintuyensinh, mBtnTracuudiachi, mBtnWeb, mBtnCallSP;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_nute_main_app);
		mBtn_thongtintuyensinh = (Button) findViewById(R.id.BTN_INFO_TS);
		mBtnTracuudiachi = (Button) findViewById(R.id.BTN_FIND_PLACE);
		mBtnWeb = (Button) findViewById(R.id.BTN_WEB_UNIVER);
		mBtnCallSP = (Button) findViewById(R.id.BTN_CALL_SUPPORT);
		
		mBtn_thongtintuyensinh.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i = new Intent(Nute_MainApp.this,Nute_WebView.class);
				startActivity(i);
				
			}
		});
		
		mBtnTracuudiachi.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i = new Intent(Nute_MainApp.this, Nute_Address.class);
				startActivity(i);
			}
		});
		
		mBtnWeb.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i = new Intent(Nute_MainApp.this, Nute_Website.class);
				startActivity(i);
			}
		});
		mBtnCallSP.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				String url = "tel: +843503637804";
				Intent i = new Intent(Intent.ACTION_CALL, Uri.parse(url));
				startActivity(i);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.nute_main_app, menu);
		return true;
	}

}
