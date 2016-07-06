package com.example.ken.googleio2016;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.ken.googleio2016.BottomSheetDialog.SampleBottomSheetDialogFragment;

import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @OnClick(R.id.button_bottom_sheet_dialog)
    void onBottomSheetDialogButtonClicked() {
        SampleBottomSheetDialogFragment bottomSheetDialog = SampleBottomSheetDialogFragment.newInstance();
        bottomSheetDialog.show(getSupportFragmentManager(), bottomSheetDialog.getTag());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
