package com.example.myitem;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatDialogFragment;

public class Write_nfc_dialog extends AppCompatDialogFragment {
    EditText message = null;
    Button ok2;
    String msg;
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.write_nfc_dialog_view, null);
        message = view.findViewById(R.id.message);
        this.ok2 = view.findViewById(R.id.ok2);
        builder.setView(view);
        final AlertDialog alertDialog = builder.create();
        alertDialog.setCanceledOnTouchOutside(false);
        final company_actions A = new company_actions();
        ok2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //msg = message.getText().toString();
                //A.setMessage(msg);
                getMsg();
                dismiss();
            }
        });

        return builder.create();
    }
    public String getMsg(){
        return message.getText().toString();
    }
}
