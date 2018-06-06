package com.example.fifaformationcalculator;

import android.support.v7.app.AppCompatActivity;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class Calculations extends AppCompatActivity {
    private List<String> formations = new ArrayList<>();

    public Calculations()
    {
        formations.add("3-4-1-2");
        formations.add("3-4-2-1");
        formations.add("3-4-3");
        formations.add("3-5-2");
        formations.add("4-1-2-1-2");
        formations.add("4-1-2-1-2(2)");
        formations.add("4-1-4-1");
        formations.add("4-2-2-2");
        formations.add("4-2-3-1");
        formations.add("4-2-3-1(2)");
        formations.add("4-3-1-2");
        formations.add("4-3-2-1");
        formations.add("4-3-3");
        formations.add("4-3-3(2)");
        formations.add("4-3-3(3)");
        formations.add("4-3-3(4)");
        formations.add("4-3-3(5)");
        formations.add("4-4-1-1");
        formations.add("4-4-2");
        formations.add("4-4-2(2)");
        formations.add("4-5-1");
        formations.add("4-5-1(2)");
        formations.add("5-2-1-2");
        formations.add("5-2-2-1");
        formations.add("5-3-2");
    }
    public String info()
    {
        String str = "";
        if(getPlayTactic().equals("possesion"))
            str = " The " +calculate()+ " formation is great for " +getDefLay()+ " and is well known for being " +getDefStyle()+ " and " +getAttStyle()+ ". The best way to play the " +calculate()+ " is to focus on possesion, so make sure you have players with strong physical and passing to wait for openings in your opponents defense.";
        else if(getPlayTactic().equals("counter attack"))
            str = " The " +calculate()+ " formation is great for " +getDefLay()+ " and is well known for being " +getDefStyle()+ " and " +getAttStyle()+ ". The best way to play the " +calculate()+ " is to focus on counter attacking, so make sure you have players with quick and explosive pace to catch your opponent off-guard.";
        else if(getPlayTactic().equals("high pressure"))
            str = " The " +calculate()+ " formation is great for " +getDefLay()+ " and is well known for being " +getDefStyle()+ " and " +getAttStyle()+ ". The best way to play the " +calculate()+ " is to focus on high pressure, so make sure you have players with high stamina and pace to keep a high press on your opponent.";
        else
            str = " The " +calculate()+ " formation is great for " +getDefLay()+ " and is well known for being " +getDefStyle()+ " and " +getAttStyle()+ ". The best way to play the " +calculate()+ " is to focus on long balls, so make sure you have players with strong passing and dribbling to feed the ball to your attackers.";
        return str;
    }
    public String getDefLay()
    {
        Spinner mySpinner=(Spinner) findViewById(R.id.spinner);
        return mySpinner.getSelectedItem().toString();
    }
    public String getDefStyle()
    {
        Spinner mySpinner=(Spinner) findViewById(R.id.spinner2);
        return mySpinner.getSelectedItem().toString();
    }
    public String getAttStyle()
    {
        Spinner mySpinner=(Spinner) findViewById(R.id.spinner3);
        return mySpinner.getSelectedItem().toString();
    }
    public String getPlayTactic()
    {
        Spinner mySpinner=(Spinner) findViewById(R.id.spinner4);
        return mySpinner.getSelectedItem().toString();
    }
    public String calculate()
    {
        if(getDefLay().equals("3 at the back"))
        {
            if(getDefStyle().equals("defensive"))
            {
                if(getAttStyle().equals("attacking"))
                {
                    if(getPlayTactic().equals("possession"))
                    {
                        return "3-4-3";
                    }
                    else if(getPlayTactic().equals("counter attack"))
                    {
                        return "3-4-3";
                    }
                    else if(getPlayTactic().equals("high pressure"))
                    {
                        return "3-4-1-2";
                    }
                    else
                    {
                        return "3-4-3";
                    }
                }
                else if(getAttStyle().equals("ultra attacking"))
                {
                    if(getPlayTactic().equals("possession"))
                    {
                        return "3-4-3";
                    }
                    else if(getPlayTactic().equals("counter attack"))
                    {
                        return "3-4-3";
                    }
                    else if(getPlayTactic().equals("high pressure"))
                    {
                        return "3-4-1-2";
                    }
                    else
                    {
                        return "3-4-3";
                    }
                }
                else
                {
                    if(getPlayTactic().equals("possession"))
                    {
                        return "3-4-2-1";
                    }
                    else if(getPlayTactic().equals("counter attack"))
                    {
                        return "3-4-2-1";
                    }
                    else if(getPlayTactic().equals("high pressure"))
                    {
                        return "3-4-2-1";
                    }
                    else
                    {
                        return "3-4-3";
                    }
                }
            }
            else if(getDefStyle().equals("ultra defensive"))
            {
                if(getAttStyle().equals("attacking"))
                {
                    if(getPlayTactic().equals("possession"))
                    {
                        return  "3-5-2";
                    }
                    else if(getPlayTactic().equals("counter attack"))
                    {
                        return "3-4-3";
                    }
                    else if(getPlayTactic().equals("high pressure"))
                    {
                        return "3-5-2";
                    }
                    else
                    {
                        return "3-4-3";
                    }
                }
                else if(getAttStyle().equals("ultra attacking"))
                {
                    if(getPlayTactic().equals("possession"))
                    {
                        return "3-4-1-2";
                    }
                    else if(getPlayTactic().equals("counter attack"))
                    {
                        return "3-4-1-2";
                    }
                    else if(getPlayTactic().equals("high pressure"))
                    {
                        return "3-4-1-2";
                    }
                    else
                    {
                        return "3-4-3";
                    }
                }
                else
                {
                    if(getPlayTactic().equals("possession"))
                    {
                        return "3-4-2-1";
                    }
                    else if(getPlayTactic().equals("counter attack"))
                    {
                        return "3-4-2-1";
                    }
                    else if(getPlayTactic().equals("high pressure"))
                    {
                        return "3-4-2-1";
                    }
                    else
                    {
                        return "3-4-3";
                    }
                }
            }
            else
            {
                if(getAttStyle().equals("attacking"))
                {
                    if(getPlayTactic().equals("possession"))
                    {
                        return "3-5-2";
                    }
                    else if(getPlayTactic().equals("counter attack"))
                    {
                        return "3-5-2";
                    }
                    else if(getPlayTactic().equals("high pressure"))
                    {
                        return "3-5-2";
                    }
                    else
                    {
                        return "3-4-3";
                    }
                }
                else if(getAttStyle().equals("ultra attacking"))
                {
                    if(getPlayTactic().equals("possession"))
                    {
                        return "3-5-2";
                    }
                    else if(getPlayTactic().equals("counter attack"))
                    {
                        return "3-5-2";
                    }
                    else if(getPlayTactic().equals("high pressure"))
                    {
                        return "3-5-2";
                    }
                    else
                    {
                        return "3-4-3";
                    }
                }
                else
                {
                    if(getPlayTactic().equals("possession"))
                    {
                        return "3-5-2";
                    }
                    else if(getPlayTactic().equals("counter attack"))
                    {
                        return "3-5-2";
                    }
                    else if(getPlayTactic().equals("high pressure"))
                    {
                        return "3-5-2";
                    }
                    else
                    {
                        return "3-5-2";
                    }
                }
            }

        }
        else if(getDefLay().equals("4 at the back"))
        {
            if(getDefStyle().equals("defensive"))
            {
                if(getAttStyle().equals("attacking"))
                {
                    if(getPlayTactic().equals("possession"))
                    {
                        return "4-5-1(2)";
                    }
                    else if(getPlayTactic().equals("counter attack"))
                    {
                        return "4-4-1-1";
                    }
                    else if(getPlayTactic().equals("high pressure"))
                    {
                        return "4-5-1(2)";
                    }
                    else
                    {
                        return "4-4-1-1";
                    }
                }
                else if(getAttStyle().equals("ultra attacking"))
                {
                    if(getPlayTactic().equals("possession"))
                    {
                        return "4-5-1";
                    }
                    else if(getPlayTactic().equals("counter attack"))
                    {
                        return "4-4-2";
                    }
                    else if(getPlayTactic().equals("high pressure"))
                    {
                        return "4-3-3";
                    }
                    else
                    {
                        return "4-4-2";
                    }
                }
                else
                {
                    if(getPlayTactic().equals("possession"))
                    {
                        return "4-5-1";
                    }
                    else if(getPlayTactic().equals("counter attack"))
                    {
                        return "4-3-3";
                    }
                    else if(getPlayTactic().equals("high pressure"))
                    {
                        return "4-3-3(4)";
                    }
                    else
                    {
                        return "4-3-3(4)";
                    }
                }
            }
            else if(getDefStyle().equals("ultra defensive"))
            {
                if(getAttStyle().equals("attacking"))
                {
                    if(getPlayTactic().equals("possession"))
                    {
                        return "4-1-4-1";
                    }
                    else if(getPlayTactic().equals("counter attack"))
                    {
                        return "4-3-3(2)";
                    }
                    else if(getPlayTactic().equals("high pressure"))
                    {
                        return "4-1-4-1";
                    }
                    else
                    {
                        return "4-3-3(2)";
                    }
                }
                else if(getAttStyle().equals("ultra attacking"))
                {
                    if(getPlayTactic().equals("possession"))
                    {
                        return "4-1-2-1-2";
                    }
                    else if(getPlayTactic().equals("counter attack"))
                    {
                        return "4-3-2-1";
                    }
                    else if(getPlayTactic().equals("high pressure"))
                    {
                        return "4-1-2-1-2(2)";
                    }
                    else
                    {
                        return "4-3-2-1";
                    }
                }
                else
                {
                    if(getPlayTactic().equals("possession"))
                    {
                        return "4-1-2-1-2(2)";
                    }
                    else if(getPlayTactic().equals("counter attack"))
                    {
                        return "4-3-1-2";
                    }
                    else if(getPlayTactic().equals("high pressure"))
                    {
                        return "4-3-1-2";
                    }
                    else
                    {
                        return "4-1-2-1-2";
                    }
                }
            }
            else
            {
                if(getAttStyle().equals("attacking"))
                {
                    if(getPlayTactic().equals("possession"))
                    {
                        return "4-3-3(5)";
                    }
                    else if(getPlayTactic().equals("counter attack"))
                    {
                        return "4-4-2(2)";
                    }
                    else if(getPlayTactic().equals("high pressure"))
                    {
                        return "4-3-3(3)";
                    }
                    else
                    {
                        return "4-4-2(2)";
                    }
                }
                else if(getAttStyle().equals("ultra attacking"))
                {
                    if(getPlayTactic().equals("possession"))
                    {
                        return "4-3-3(5)";
                    }
                    else if(getPlayTactic().equals("counter attack"))
                    {
                        return "4-2-3-1(2)";
                    }
                    else if(getPlayTactic().equals("high pressure"))
                    {
                        return "4-2-2-2";
                    }
                    else
                    {
                        return "4-3-3(3)";
                    }
                }
                else
                {
                    if(getPlayTactic().equals("possession"))
                    {
                        return "4-2-2-2";
                    }
                    else if(getPlayTactic().equals("counter attack"))
                    {
                        return "4-2-3-1(2)";
                    }
                    else if(getPlayTactic().equals("high pressure"))
                    {
                        return "4-2-3-1";
                    }
                    else
                    {
                        return "4-2-3-1";
                    }
                }
            }
        }

        else
        {
            if(getAttStyle().equals("attacking"))
            {
                if(getPlayTactic().equals("possession"))
                {
                    return "5-3-2";
                }
                else if(getPlayTactic().equals("counter attack"))
                {
                    return "5-2-2-1";
                }
                else if(getPlayTactic().equals("high pressure"))
                {
                    return "5-2-2-1";
                }
                else
                {
                    return "5-2-2-1";
                }
            }
            else if(getAttStyle().equals("ultra attacking"))
            {
                if(getPlayTactic().equals("possession"))
                {
                    return "5-3-2";
                }
                else if(getPlayTactic().equals("counter attack"))
                {
                    return "5-2-1-2";
                }
                else if(getPlayTactic().equals("high pressure"))
                {
                    return "5-2-1-2";
                }
                else
                {
                    return "5-2-1-2";
                }
            }
            else
            {
                if(getPlayTactic().equals("possession"))
                {
                    return "5-3-2";
                }
                else if(getPlayTactic().equals("counter attack"))
                {
                    return "5-2-1-2";
                }
                else if(getPlayTactic().equals("high pressure"))
                {
                    return "5-3-2";
                }
                else
                {
                    return "5-3-2";
                }
            }
        }
    }
    public String get1Formation(String c)
    {
        if(c.equals("3-4-2-1") || c.equals("3-4-3") || c.equals("4-3-2-1"))
            return "xxxxxxxXxxxxXxxxxXxxxxxxx";
        else if(c.equals("3-4-1-2") || c.equals("3-5-2") || c.equals("5-2-1-2") || c.equals("5-3-2") || c.equals("4-1-2-1-2") || c.equals("4-1-2-1-2(2)") || c.equals("4-2-2-2") || c.equals("4-3-1-2") || c.equals("4-4-2") || c.equals("4-4-2(2)"))
            return "xxxxxxxXxxxxxxxxxXxxxxxxx";
        else if(c.equals("5-2-2-1"))
            return "xxxxXxxxxxxxXxxxxxxxXxxxx";
        else if(c.equals("4-1-4-1") || c.equals("4-2-3-1") || c.equals("4-2-3-1(2)") || c.equals("4-4-1-1") || c.equals("4-5-1") || c.equals("4-5-1(2)"))
            return "xxxxxxxxxxxxXxxxxxxxxxxxx";
        else if(c.equals("4-3-3") || c.equals("4-3-3(2)") || c.equals("4-3-3(3)") || c.equals("4-3-3(4)"))
            return "xXxxxxxxxxxxXxxxxxxxxxxXx";
        else if(c.equals("4-3-3(5)"))
            return "xXxxxxxxxxxxxxxxxxxxxxxXx";
        else
            return "error";
    }
    public String get2Formation(String c)
    {
        if(c.equals("3-4-2-1") || c.equals("3-4-3") || c.equals("5-2-2-1") || c.equals("4-1-4-1") || c.equals("4-3-2-1") || c.equals("4-3-3") || c.equals("4-3-3(2)") || c.equals("4-3-3(3)") || c.equals("4-4-2") || c.equals("4-4-2(2)") || c.equals("4-5-1(2)"))
            return "xxxxxxxxxxxxxxxxxxxxxxxxx";
        else if(c.equals("3-4-1-2") || c.equals("3-5-2") || c.equals("5-2-1-2") || c.equals("4-1-2-1-2") || c.equals("4-1-2-1-2(2)") || c.equals("4-3-1-2") || c.equals("4-3-3(4)") || c.equals("4-3-3(5)") || c.equals("4-4-1-1"))
            return "xxxxxxxxxxxxXxxxxxxxxxxxx";
        else if(c.equals("5-3-2"))
            return "xxxxXxxxxxxxXxxxxxxxXxxxx";
        else if(c.equals("4-2-2-2"))
            return "xxxXxxxxxxxxxxxxxxxxxXxxx";
        else if(c.equals("4-2-3-1") || c.equals("4-5-1"))
            return "xxxxxxxxXxxxxxxxXxxxxxxxx";
        else if(c.equals("4-2-3-1(2)"))
            return "XxxxxxxxxxxxxxxxxxxxxxxxX";
        else
            return "error";
    }
    public String get3Formation(String c)
    {
        if(c.substring(0,1).equals("3") || c.equals("4-1-2-1-2") || c.equals("4-4-2(2)"))
            return "XxxxxxxxxxxxxxxxxxxxxxxxX";
        else if(c.equals("5-3-2") || c.equals("4-2-2-2"))
            return "xxxxxxxxxxxxxxxxxxxxxxxxx";
        else if(c.equals("5-2-2-1") || c.equals("5-2-1-2"))
            return "xxxxxxxXxxxxxxxxxXxxxxxxx";
        else if(c.equals("4-1-2-1-2(2)"))
            return "xxxxxXxxxxxxxxxxxxxXxxxxx";
        else if(c.equals("4-3-1-2") || c.equals("4-3-3(2)") || c.equals("4-3-3(4)") || c.equals("4-3-3(5)"))
            return "xxxxxxXxxxxxxxxxxxXxxxxxx";
        else if(c.equals("4-1-4-1") || c.equals("4-4-1-1") || c.equals("4-4-2"))
            return "XxxxxxxxXxxxxxxxXxxxxxxxX";
        else if(c.equals("4-2-3-1") || c.equals("4-2-3-1(2)") || c.equals("4-3-3(3)"))
            return "xxxxxxxxxxxxXxxxxxxxxxxxx";
        else if(c.equals("4-3-2-1") || c.equals("4-3-3"))
            return "xxxxxxXxxxxxXxxxxxXxxxxxx";
        else if(c.equals("4-5-1"))
            return "XxxxxxxxxxxxXxxxxxxxxxxxX";
        else if(c.equals("4-5-1(2)"))
            return "XxxxxxXxxxxxXxxxxxXxxxxxX";
        else
            return "error";
    }
    public String get4Formation(String c)
    {
        if(c.substring(0,1).equals("3"))
            return "xxxxxxxXxxxxxxxxxXxxxxxxx";
        else if(c.substring(0,1).equals("5"))
            return "XxxxxxxxxxxxxxxxxxxxxxxxX";
        else if(c.equals("4-1-2-1-2") || c.equals("4-1-2-1-2(2)") || c.equals("4-1-4-1") || c.equals("4-3-1-2") || c.equals("4-3-3(2)") || c.equals("4-3-3(5)"))
            return "xxxxxxxxxxxxXxxxxxxxxxxxx";
        else if(c.equals("4-2-2-2") || c.equals("4-4-2(2)"))
            return "xxxxxxxxxXxxxxxXxxxxxxxxx";
        else if(c.equals("4-2-3-1"))
            return "xxxXxxxxxxxxxxxxxxxxxXxxx";
        else if(c.equals("4-2-3-1(2)") || c.equals("4-3-3(3)"))
            return "xxxxxXxxxxxxxxxxxxxXxxxxx";
        else if(c.equals("4-3-2-1") || c.equals("4-3-3") || c.equals("4-3-3(4)") || c.equals("4-4-1-1") || c.equals("4-4-2") || c.equals("4-5-1") || c.equals("4-5-1(2)"))
            return "xxxxxxxxxxxxxxxxxxxxxxxxx";
        else
            return "error";
    }
    public String get5Formation(String c)
    {
        if(c.substring(0,1).equals("3") || (c.substring(0,1).equals("5")))
            return "xxxxxXxxxxxxXxxxxxxXxxxxx";
        else
            return "XxxxxxxxXxxxxxxxXxxxxxxxX";
    }
    public String get6Formation()
    {
        return "xxxxxxxxxxxxXxxxxxxxxxxxx";
    }

}
