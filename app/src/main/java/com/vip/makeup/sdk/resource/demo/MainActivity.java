package com.vip.makeup.sdk.resource.demo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.vip.sdk.makeup.android.vsface.VSFaceBaseController;
import com.vip.sdk.makeup.android.vsface.VSFaceResource;
import com.vip.sdk.makeup.android.vsface.VSFaceResourceCallback;
import com.vip.sdk.makeup.android.vsface.VSFaceResourceService;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        VSFaceResourceService service = null;
        service.getFaceResource(new VSFaceResourceCallback() {
            @Override
            public void onSuccess(@NonNull VSFaceResource resource) {

            }

            @Override
            public void onError(int code, String msg) {

            }

            @Override
            public void onCancel() {

            }
        });
    }

    class A extends VSFaceBaseController {

        @Override
        protected void onResourceLoaded(@NonNull Context context, @NonNull VSFaceResource makeupInfo, @NonNull InitModelCallback callback) {

        }
    }
}
