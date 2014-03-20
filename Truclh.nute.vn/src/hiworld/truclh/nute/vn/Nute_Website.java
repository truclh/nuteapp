package hiworld.truclh.nute.vn;

import com.example.truclh.nute.vn.R;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.Button;

public class Nute_Website extends Activity {
	WebView mWEB;
	Button mBTN_SIGNIN_EXIT;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_nute_website);
		
		String url = "http://nute.edu.vn/Home/";
		mWEB = (WebView) findViewById(R.id.SIGNIN_WEBVIEW);
		mWEB.loadUrl(url);
		mBTN_SIGNIN_EXIT= (Button)findViewById(R.id.SIGNIN_BTN_EXIT);
		mBTN_SIGNIN_EXIT.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				finish();
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.nute_website, menu);
		return true;
	}

}
