package app.report;

import android.os.Build;
import android.os.Bundle;

import android.annotation.TargetApi;
import android.app.Activity;
import android.view.Menu;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

import android.view.*;
import android.widget.*;
import android.widget.AdapterView.OnItemSelectedListener;

import android.app.AlertDialog;
import android.content.*;
import android.util.*;

import android.media.*;

import app.account.AccountStatus;
import app.process.DataStatusProcess;

public class newAccount extends Activity implements OnClickListener {

    private Spinner spinner;
    private ArrayAdapter adapter;
    private EditText et;
    private static String selected;
    private static boolean sign = false;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.entryaccount);

        View saveButton = this.findViewById(R.id.save_button);
        saveButton.setOnClickListener(this);

        setSpinner();

        et = (EditText) this.findViewById(R.id.amount);

    }

    private void setSpinner() {
        spinner = (Spinner) findViewById(R.id.category);

        //����ѡ������ArrayAdapter��������
        adapter = ArrayAdapter.createFromResource(this, R.array.category, android.R.layout.simple_spinner_item);

        //���������б�ķ��
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //��adapter2 ��ӵ�spinner��
        spinner.setAdapter(adapter);

        //����¼�Spinner�¼�����
        spinner.setOnItemSelectedListener(new OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Spinner spinner = (Spinner) parent;
                //Log.v("Test", "id = " + id + "("  + spinner.getSelectedItem().toString() + ")");
                selected = spinner.getSelectedItem().toString();
                check(id);

            }

            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    private void check(long id) {

        switch ((int) id) {
            case 6: //debt
                Intent i = new Intent(this, debt.class);
                startActivity(i);
                break;
            case 7: //revenue
                Intent k = new Intent(this, revenue.class);
                startActivity(k);
                break;
            case 8: //other entry
                Intent t = new Intent(this, OtherExpense.class);
                startActivity(t);
                break;
        }

    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.save_button:
                String amount = et.getText().toString();
                //Log.d("Amount", amount);
                setNewAccount(amount);
                Intent i = new Intent(this, showBalance.class);
                i.putExtra("level", "0");
                startActivity(i);
                break;
            case R.id.cancel_botton:
                finish();
                break;
        }

    }

    //save in the database
    private void setNewAccount(String amount) {
        saveNewAccount newAccount = new saveNewAccount(this.getBaseContext());
        newAccount.saveAccount(1, selected, amount);
    }

}
