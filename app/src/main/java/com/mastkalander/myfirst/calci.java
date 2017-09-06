package com.mastkalander.myfirst;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class calci extends ActionBarActivity {
    double display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calci);
    }
    int count=0,count1=0,sum,sub,mul,div;
    double var1,var2;


 public void btn1(View view)
 {

     TextView Text1=(TextView)findViewById(R.id.display);
     String ans=Text1.getText().toString()+"1";
     Text1.setText(String.valueOf(ans));
 }
    public void btn2(View view)
    {

        TextView Text1=(TextView)findViewById(R.id.display);
        String ans=Text1.getText().toString()+"2";
        Text1.setText(String.valueOf(ans));
    }

    public void btn3(View view)
    {

        TextView Text1=(TextView)findViewById(R.id.display);
        String ans=Text1.getText().toString()+"3";
        Text1.setText(String.valueOf(ans));
    }

    public void btn4(View view)
    {

        TextView Text1=(TextView)findViewById(R.id.display);
        String ans=Text1.getText().toString()+"4";
        Text1.setText(String.valueOf(ans));
    }

    public void btn5(View view)
    {

        TextView Text1=(TextView)findViewById(R.id.display);
        String ans=Text1.getText().toString()+"5";
        Text1.setText(String.valueOf(ans));
    }

    public void btn6(View view)
    {

        TextView Text1=(TextView)findViewById(R.id.display);
        String ans=Text1.getText().toString()+"6";
        Text1.setText(String.valueOf(ans));
    }

    public void btn7(View view)
    {

        TextView Text1=(TextView)findViewById(R.id.display);
        String ans=Text1.getText().toString()+"7";
        Text1.setText(String.valueOf(ans));
    }
    public void btn8(View view)
    {

        TextView Text1=(TextView)findViewById(R.id.display);
        String ans=Text1.getText().toString()+"8";
        Text1.setText(String.valueOf(ans));
    }

    public void btn9(View view)
    {

        TextView Text1=(TextView)findViewById(R.id.display);
        String ans=Text1.getText().toString()+"9";
        Text1.setText(String.valueOf(ans));
    }
    public void btn0(View view)
    {

        TextView Text1=(TextView)findViewById(R.id.display);
        String ans=Text1.getText().toString()+"0";
        Text1.setText(String.valueOf(ans));
    }
    public void btnpoint(View view)
    {

        if (count==0) {
            TextView Text1 = (TextView) findViewById(R.id.display);
            String ans = Text1.getText().toString() + ".";
            Text1.setText(String.valueOf(ans));
          count++;
        }
    }
    public void btnsum(View view)
    {
        TextView Text1 = (TextView) findViewById(R.id.display);
        {
            String temp1 = Text1.getText().toString();
            var1 = Double.valueOf(temp1).doubleValue();
            sum = 1;
            count=0;
            Text1.setText("");

        }
    }

    public void btnsub(View view)
    {
        TextView Text1=(TextView)findViewById(R.id.display);
        {
            String temp1=Text1.getText().toString();
            var1=Double.valueOf(temp1).doubleValue();
            sub=1;
            count=0;
            Text1.setText("");

        }
    }

    public void btnmul(View view)
    {
        TextView Text1=(TextView)findViewById(R.id.display);
        {
            String temp1=Text1.getText().toString();
            var1=Double.valueOf(temp1).doubleValue();
            mul=1;
            count=0;
            Text1.setText("");

        }
    }

    public void btndiv(View view)
    {
        TextView Text1=(TextView)findViewById(R.id.display);
        {
            String temp1=Text1.getText().toString();
            var1=Double.valueOf(temp1).doubleValue();
            div=1;
            count=0;
            Text1.setText("");

        }
    }
    public void btnper(View view)
    {
        TextView Text1=(TextView)findViewById(R.id.display);
        String temp1=Text1.getText().toString();
        var1=Double.valueOf(temp1).doubleValue();
        var1=var1/100;
        Text1.setText(String.valueOf(var1));
        String S=(String)Text1.getText();
        if(S.matches("(.*).(.*)"))
        {
            count=1;
        }
        else
        {
            count=0;
        }
    }






    public void btneql(View view)
    {
        TextView Text1=(TextView)findViewById(R.id.display);
        String temp2=Text1.getText().toString();
        var2=Double.valueOf(temp2).doubleValue();
        if(sum==1) {
            var1 = var1 + var2;
            Text1.setText(String.valueOf(var1));
            sum=0;

        }

        if(sub==1) {
            var1 = var1 - var2;
            Text1.setText(String.valueOf(var1));
            sub=0;
        }

        if(mul==1) {
            var1 = var1 * var2;
            Text1.setText(String.valueOf(var1));
            mul=0;
        }
        if(div==1) {
            var1 = var1 / var2;
            Text1.setText(String.valueOf(var1));
            div=0;
        }
        String S=(String)Text1.getText();
        if(S.matches("(.*).(.*)"))
        {
          count=1;
        }
        else
        {
            count=0;
        }
    }

    public void btnac(View view)
    {
        TextView Text1=(TextView)findViewById(R.id.display);
        Text1.setText("");
    }

    public void btndel(View view)
    {
        TextView Text1=(TextView)findViewById(R.id.display);
        String S=(String)Text1.getText();
        if (S == null || S.length() == 0)
        {
            Text1.setText(S);
        }
        else
        {
            Text1.setText(S.substring(0, S.length() - 1));
        }

    }







}
