package com.example.ken.googleio2016.BottomSheetDialog;

import android.app.Dialog;
import android.support.design.widget.BottomSheetDialogFragment;
import android.view.View;

import com.example.ken.googleio2016.R;


/**
 * sample fragment of {@link BottomSheetDialogFragment}.
 **/
public class SampleBottomSheetDialogFragment extends BottomSheetDialogFragment {

    public static SampleBottomSheetDialogFragment newInstance() {
        return new SampleBottomSheetDialogFragment();
    }

    @Override
    public void setupDialog(Dialog dialog, int style) {
        super.setupDialog(dialog, style);
        View view = View.inflate(getContext(), R.layout.view_bottom_sheet_dialog, null);
        dialog.setContentView(view);
    }
}
