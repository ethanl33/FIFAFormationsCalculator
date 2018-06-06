package com.example.fifaformationcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class DisplayMessageActivity2 extends Calculations {
    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message2);

        Intent intent = getIntent();
        String temp = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        int num = temp.indexOf("T");
        String tv = temp.substring(0,num - 1);
        String str = temp.substring(num);
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(tv);

/*
        if(getPlayTactic().equals("possesion"))
            str = "The " +tv+ " formation is great for " +getDefLay()+ ". The " +tv+ " is well known for being " +getDefStyle()+ " and " +getAttStyle()+ ". The best way to play the " +tv+ " is to focus on possesion, make sure you have players with strong physical and passing to wait for openings in your opponents defense.";
        else if(getPlayTactic().equals("counter attack"))
            str = "The " +tv+ " formation is great for " +getDefLay()+ ". The " +tv+ " is well known for being " +getDefStyle()+ " and " +getAttStyle()+ ". The best way to play the " +tv+ " is to focus on counter attacking, make sure you have players with quick and explosive pace to catch your opponent off-guard.";
        else if(getPlayTactic().equals("high pressure"))
            str = "The " +tv+ " formation is great for " +getDefLay()+ ". The " +tv+ " is well known for being " +getDefStyle()+ " and " +getAttStyle()+ ". The best way to play the " +tv+ " is to focus on high pressure, make sure you have players with high stamina and pace to keep a high press on your opponent.";
        else
            str = "The " +tv+ " formation is great for " +getDefLay()+ ". The " +tv+ " is well known for being " +getDefStyle()+ " and " +getAttStyle()+ ". The best way to play the " +tv+ " is to focus on long balls, make sure you have players with strong passing and dribbling to feed the ball to your attackers.";
*/
        String tv1 = get1Formation(tv);
        String tv2 = get2Formation(tv);
        String tv3 = get3Formation(tv);
        String tv4 = get4Formation(tv);
        String tv5 = get5Formation(tv);
        String tv6 = get6Formation();


        String formation1 = tv1.replace("x", "<font color='#F9F9F9'>x</font>");
        String formation2 = tv2.replace("x", "<font color='#F9F9F9'>x</font>");
        String formation3 = tv3.replace("x", "<font color='#F9F9F9'>x</font>");
        String formation4 = tv4.replace("x", "<font color='#F9F9F9'>x</font>");
        String formation5 = tv5.replace("x", "<font color='#F9F9F9'>x</font>");
        String formation6 = tv6.replace("x", "<font color='#F9F9F9'>x</font>");
        //Only letter x would be displayed in a different color
        String new1 = "";
        String new2 = "";
        String new3 = "";
        String new4 = "";
        String new5 = "";
        String new6 = "";

        new1 = formation1.replace("X", "<font color='#FE4646'>X</font>");//red
        if (tv.equals("4-3-3(5)") || tv.equals("4-4-1-1"))
            new2 = formation2.replace("X", "<font color='#FE4646'>X</font>");
        else
            new2 = formation2.replace("X", "<font color='#46FE5C'>X</font>");
        new3 = formation3.replace("X", "<font color='#46FE5C'>X</font>");
        if (tv.substring(0, 1).equals("5"))
            new4 = formation4.replace("X", "<font color='#467BFE'>X</font>");//blue defense
        else
            new4 = formation4.replace("X", "<font color='#46FE5C'>X</font>");//green midfield
        new5 = formation5.replace("X", "<font color='#467BFE'>X</font>");//blue defense
        new6 = formation6.replace("X", "<font color='#467BFE'>X</font>");//blue goalkeeper

        TextView textView2 = (TextView) findViewById(R.id.textView2);
        TextView textView3 = (TextView) findViewById(R.id.textView3);
        TextView textView4 = (TextView) findViewById(R.id.textView4);
        TextView textView5 = (TextView) findViewById(R.id.textView5);
        TextView textView6 = (TextView) findViewById(R.id.textView6);
        TextView textView7 = (TextView) findViewById(R.id.textView7);
        TextView textView8 = (TextView) findViewById(R.id.textView8);

        textView2.setText(Html.fromHtml(new1));
        textView3.setText(Html.fromHtml(new2));
        textView4.setText(Html.fromHtml(new3));
        textView5.setText(Html.fromHtml(new4));
        textView6.setText(Html.fromHtml(new5));
        textView7.setText(Html.fromHtml(new6));
        textView8.setText(Html.fromHtml(str));
    }


}
