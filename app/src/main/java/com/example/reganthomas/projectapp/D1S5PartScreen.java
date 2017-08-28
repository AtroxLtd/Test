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
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class D1S5PartScreen extends AppCompatActivity {

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
        setContentView(R.layout.activity_d1_s5_part_screen);

        mOrder = (Button) findViewById(R.id.orderButton);
        mItemSelected = (TextView) findViewById(R.id.orderText);
        listItems = getResources().getStringArray(R.array.list_5);
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
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(D1S5PartScreen.this);
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
                , "Part 26", "Part 27", "Part 28", "Part 29", "Part 30"};
        ListAdapter myAdapter = new CustomAdapter(this, parts);
        ListView d1s5List = (ListView) findViewById(R.id.d1S5List);
        d1s5List.setAdapter(myAdapter);

        d1s5List.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String part = String.valueOf(parent.getItemAtPosition(position));
                        Toast.makeText(D1S5PartScreen.this, part, Toast.LENGTH_LONG).show();
                    }
                }
        );
    }

    public void Back (View view){
        Intent a = new Intent(this, Parts1Screen.class);
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
