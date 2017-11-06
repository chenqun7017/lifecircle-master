package com.lifecircle_master.base;

import android.annotation.SuppressLint;
import android.app.DialogFragment;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

@SuppressLint("NewApi")
public abstract class BaseDialog extends DialogFragment {
	public View view;
	public Context mContext;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		mContext = getActivity();
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		getDialog().requestWindowFeature(Window.FEATURE_NO_TITLE);
		getDialog().getWindow().setBackgroundDrawable(new
				ColorDrawable(Color.TRANSPARENT));
		view = initView(inflater);
		String  str="ss";
		return view;
	}

	/**初始化view*/
	public abstract View initView(LayoutInflater inflater);
}
