package hiworld.truclh.nute.vn;

import com.example.truclh.nute.vn.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.Button;

public class Nute_WebView extends Activity {
	WebView mWEB;
	Button mBTN_SIGNIN_EXIT;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_nute_web_view);
		String url = "http://nute.edu.vn/News/Default.aspx?Mod=ViewNews&CateID=604&NewsID=1325";
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
		getMenuInflater().inflate(R.menu.nute_web_view, menu);
		return true;
	}

}
