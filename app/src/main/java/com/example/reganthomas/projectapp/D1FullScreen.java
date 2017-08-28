package com.example.reganthomas.projectapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class D1FullScreen extends AppCompatActivity {

    Button mOrder;
    TextView mItemSelected;
    String[] listItems;
    boolean[] checkedItems;
    ArrayList<Integer> mUserItems = new ArrayList<>();
    Button sendEmail;
    TextView msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d1_full_screen);

        mOrder = (Button) findViewById(R.id.orderButton);
        mItemSelected = (TextView) findViewById(R.id.orderText);
        listItems = getResources().getStringArray(R.array.list_28);
        checkedItems = new boolean[listItems.length];
        sendEmail = (Button) findViewById(R.id.sendButton);

        sendEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                msg = (TextView) findViewById(R.id.orderText);
                String message = msg.getText().toString();
                sendEmail(message);
            }
        });


        mOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(D1FullScreen.this);
                mBuilder.setTitle(R.string.dialog_title);
                mBuilder.setMultiChoiceItems(listItems, checkedItems, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int position, boolean isChecked) {
                        if(isChecked){
                            if(! mUserItems.contains(position)){
                                mUserItems.add(position);
                            }
                        } else if (mUserItems.contains(position)){
                            mUserItems.remove(mUserItems.indexOf(position));
                        }
                    }
                });

                mBuilder.setCancelable(false);
                mBuilder.setPositiveButton(R.string.ok_label, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String item = "";
                        for(int i = 0; i < mUserItems.size(); i++){
                            item = item + listItems[mUserItems.get(i)];
                            if(i != mUserItems.size() - 1){
                                item = item + ", ";
                            }
                        }

                        mItemSelected.setText(item);
                    }
                });

                mBuilder.setNegativeButton(R.string.dismiss_label, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });

                mBuilder.setNeutralButton(R.string.clear_all_label, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        for(int i = 0; i < checkedItems.length; i++){
                            checkedItems[i] = false;
                            mUserItems.clear();
                            mItemSelected.setText("");
                        }
                    }
                });

                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });

        String[] parts = {"Part 1", "Part 2", "Part 3", "Part 4", "Part 5", "Part 6", "Part 7", "Part 8", "Part 9", "Part 10", "Part 11", "Part 12", "Part 13"
                , "Part 14", "Part 15", "Part 16", "Part 17", "Part 18", "Part 19", "Part 20", "Part 21", "Part 22", "Part 23", "Part 24", "Part 25"
                , "Part 26", "Part 27", "Part 28", "Part 29", "Part 30", "Part 31", "Part 32", "Part 33", "Part 34", "Part 35", "Part 36", "Part 37",
                "Part 38", "Part 39", "Part 40", "Part 41", "Part 42", "Part 43", "Part 44", "Part 45", "Part 46", "Part 47", "Part 48", "Part 49",
                "Part 50", "Part 51", "Part 52", "Part 53", "Part 54", "Part 55", "Part 56", "Part 57", "Part 58", "Part 59", "Part 60", "Part 61",
                 "Part 62", "Part 63", "Part 64", "Part 65", "Part 66", "Part 67", "Part 68", "Part 69", "Part 70", "Part 71", "Part 72", "Part 73"
                , "Part 74", "Part 75", "Part 76", "Part 77", "Part 78", "Part 79", "Part 80", "Part 81", "Part 82", "Part 83", "Part 84", "Part 85"
                , "Part 86", "Part 87", "Part 88", "Part 89", "Part 90", "Part 91", "Part 92", "Part 93", "Part 94", "Part 95", "Part 96", "Part 97",
                "Part 98", "Part 99", "Part 100", "Part 101", "Part 102", "Part 103", "Part 104", "Part 105", "Part 106", "Part 107", "Part 108", "Part 109",
                "Part 110", "Part 111", "Part 112", "Part 113", "Part 114", "Part 115", "Part 116", "Part 117", "Part 118", "Part 119", "Part 120", "Part 121",
                "Part 122", "Part 123", "Part 124", "Part 125", "Part 126", "Part 127", "Part 128", "Part 129", "Part 130", "Part 131", "Part 132", "Part 133",
                "Part 134", "Part 135", "Part 136", "Part 137", "Part 138", "Part 139", "Part 140", "Part 141", "Part 142", "Part 143", "Part 144", "Part 145",
                "Part 146", "Part 147", "Part 148", "Part 149", "Part 150", "Part 151", "Part 152", "Part 153", "Part 154", "Part 155", "Part 156", "Part 157",
                "Part 158", "Part 159", "Part 160", "Part 161", "Part 162", "Part 163", "Part 164", "Part 165", "Part 166", "Part 167", "Part 168", "Part 169",
                "Part 170", "Part 171", "Part 172", "Part 173", "Part 174", "Part 175", "Part 176", "Part 177", "Part 178", "Part 179", "Part 180", "Part 181",
                "Part 182", "Part 183", "Part 184", "Part 185", "Part 186", "Part 187", "Part 188", "Part 189", "Part 190", "Part 191", "Part 192", "Part 193",
                "Part 194", "Part 195", "Part 196", "Part 197", "Part 198", "Part 199", "Part 200", "Part 201", "Part 202", "Part 203", "Part 204", "Part 205",
                "Part 206", "Part 207", "Part 208", "Part 209", "Part 210", "Part 211", "Part 212", "Part 213", "Part 214", "Part 215", "Part 216", "Part 217",
                "Part 218", "Part 219", "Part 220", "Part 221","Part 222", "Part 223", "Part 224", "Part 225", "Part 226", "Part 227", "Part 228", "Part 229",
                "Part 230", "Part 231", "Part 232", "Part 233", "Part 234", "Part 235", "Part 236", "Part 237", "Part 238", "Part 239", "Part 240", "Part 241",
                "Part 242", "Part 243", "Part 244", "Part 245", "Part 246", "Part 247", "Part 248", "Part 249", "Part 250", "Part 251", "Part 252", "Part 253",
                "Part 254", "Part 255", "Part 256", "Part 257", "Part 258", "Part 259", "Part 260", "Part 261", "Part 262", "Part 263", "Part 264", "Part 265",
                "Part 266", "Part 267", "Part 268", "Part 269", "Part 270"};
        ListAdapter myAdapter = new CustomAdapter(this, parts);
        ListView d1Full1List = (ListView) findViewById(R.id.d1FullList);
        d1Full1List.setAdapter(myAdapter);

        d1Full1List.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String part = String.valueOf(parent.getItemAtPosition(position));
                        Toast.makeText(D1FullScreen.this, part, Toast.LENGTH_LONG).show();
                    }
                }
        );
    }

    public void Back (View view){
        Intent a = new Intent(this, Drill1Screen.class);
        startActivity(a);
    }

    protected  void sendEmail(String message){
        String[] to = new String[]{"regtho02@student.wintec.ac.nz"};
        String subject = ("Order");
        Intent emailIntent = new Intent(Intent.ACTION_SEND);
        emailIntent.putExtra(Intent.EXTRA_EMAIL, to);
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, subject);
        emailIntent.putExtra(Intent.EXTRA_TEXT, message);
        emailIntent.setType("message/rfc822");
        startActivity(Intent.createChooser(emailIntent, "Email"));
    }
}
