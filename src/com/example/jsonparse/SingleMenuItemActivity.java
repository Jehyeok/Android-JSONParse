package com.example.jsonparse;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SingleMenuItemActivity extends Activity {

	// JSON node keys
	private static final String TAG_NAME = "name";
	private static final String TAG_EMAIL = "email";
	private static final String TAG_PHONE_MOBILE = "mobile";

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_single_menu_item);

		Intent intent = getIntent();

		String name = intent.getStringExtra(TAG_NAME);
		String cost = intent.getStringExtra(TAG_EMAIL);
		String description = intent.getStringExtra(TAG_PHONE_MOBILE);

		TextView lblName = (TextView) findViewById(R.id.name_label);
		TextView lblCost = (TextView) findViewById(R.id.email_label);
		TextView lblDesc = (TextView) findViewById(R.id.mobile_label);

		lblName.setText(name);
		lblCost.setText(cost);
		lblDesc.setText(description);
	}
}