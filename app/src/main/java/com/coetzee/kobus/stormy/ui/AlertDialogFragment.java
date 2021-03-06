package com.coetzee.kobus.stormy.ui;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;

import com.coetzee.kobus.stormy.R;

/**
 * Created by Kobus on 10/22/2016.
 */

public class AlertDialogFragment extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        Context context = getActivity();
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(R.string.error_title).setMessage(R.string.error_message);
        builder.setPositiveButton(R.string.error_ok_button,null);

        AlertDialog dialog = builder.create();
        return dialog;
    }
}
