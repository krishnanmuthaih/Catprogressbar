package org.ciicsrgateway.mycat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button button;
    ProgressCatDialogLoadingView mView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button)findViewById(R.id.button);
        mView = new ProgressCatDialogLoadingView();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mView.show(getSupportFragmentManager(), "");
            }
        });
    }
}
