package com.example.myitem;

import androidx.appcompat.app.AppCompatActivity;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.nfc.FormatException;
import android.nfc.NdefMessage;
import android.nfc.NdefRecord;
import android.nfc.NfcAdapter;
import android.nfc.Tag;
import android.nfc.tech.Ndef;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.TimeUnit;

import static java.nio.charset.StandardCharsets.US_ASCII;

public class company_actions extends AppCompatActivity {
    Button w, r;
    TextView text_reading;
    boolean writeMode;
    NfcAdapter adapter;
    PendingIntent pendingIntent;
    IntentFilter writeTagFilters[];
    Tag tag;
    Context ctx;
    String msg = null;
    EditText txt;

    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.company_actions);
        this.text_reading = findViewById(R.id.reading_text);
        this.w = findViewById(R.id.write);
        this.r = findViewById(R.id.read);
        this.txt = findViewById(R.id.txt);
        ctx = this;

        /*w.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if(tag==null){
                        Toast.makeText(ctx, "No tag found", Toast.LENGTH_LONG ).show();
                    }
                    else{
                        msg = txt.getText().toString();
                        write(msg, tag);
                        Toast.makeText(ctx, "Done Successfully", Toast.LENGTH_LONG ).show();
                    }
                }
                catch (IOException e) {
                    Toast.makeText(ctx, "Error in Writing", Toast.LENGTH_LONG ).show();
                    e.printStackTrace();
                }
                catch (FormatException e) {
                    Toast.makeText(ctx, "Error in Writing FF" , Toast.LENGTH_LONG ).show();
                    e.printStackTrace();
                }
            }
        });*/

        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*if(tag==null){
                    Toast.makeText(ctx, "No tag found", Toast.LENGTH_LONG ).show();
                }*/
            }
        });

    }


    /*private NdefRecord createRecord(String text) throws UnsupportedEncodingException {
        //Code to create NDEF record and returns the record to write
        String lang       = "en";
        byte[] textBytes  = text.getBytes();
        byte[] langBytes  = lang.getBytes("US-ASCII");
        int    langLength = langBytes.length;
        int    textLength = textBytes.length;
        byte[] payload    = new byte[1 + langLength + textLength];

        // set status byte (see NDEF spec for actual bits)
        payload[0] = (byte) langLength;

        // copy langbytes and textbytes into payload
        System.arraycopy(langBytes, 0, payload, 1,              langLength);
        System.arraycopy(textBytes, 0, payload, 1 + langLength, textLength);

        NdefRecord recordNFC = new NdefRecord(NdefRecord.TNF_WELL_KNOWN,  NdefRecord.RTD_TEXT,  new byte[0], payload);

        return recordNFC;
    }

    private void write(String text, Tag tag) throws IOException, FormatException {
        //Code that calls createRecord method to create NDEFRecord and write NDEF message to NFC
        NdefRecord[] records = { createRecord(text) };
        NdefMessage message = new NdefMessage(records);
        // Get an instance of Ndef for the tag.
        Ndef ndef = Ndef.get(tag);
        // Enable I/O
        ndef.connect();
        // Write the message
        ndef.writeNdefMessage(message);
        // Close the connection
        ndef.close();
    }*/
}