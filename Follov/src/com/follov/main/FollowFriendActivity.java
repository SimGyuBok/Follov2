package com.follov.main;


import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;

import com.follov.R;

public class FollowFriendActivity extends Activity implements OnClickListener {
	
	FrameLayout m_oBtnSignin;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.follow_friend);
		setUi();
	}

	public void setUi()
	{
		
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId())
		{
			case R.id.btn_sign:
			{
				
				break;
			}
		}
	}

}
