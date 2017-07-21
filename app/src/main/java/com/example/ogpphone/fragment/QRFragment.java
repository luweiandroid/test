package com.example.ogpphone.fragment;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import com.example.ogpphone.R;
import com.example.ogpphone.zxing.android.BeepManager;
import com.example.ogpphone.zxing.android.CaptureActivity;
import com.example.ogpphone.zxing.android.CaptureActivityHandler;
import com.example.ogpphone.zxing.android.FinishListener;
import com.example.ogpphone.zxing.android.InactivityTimer;
import com.example.ogpphone.zxing.android.IntentSource;
import com.example.ogpphone.zxing.camera.CameraManager;
import com.example.ogpphone.zxing.view.ViewfinderView;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.Result;
import java.io.IOException;
import java.util.Collection;
import java.util.Map;

public class QRFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment



        return inflater.inflate(R.layout.fragment_qr, container, false);
    }



}
