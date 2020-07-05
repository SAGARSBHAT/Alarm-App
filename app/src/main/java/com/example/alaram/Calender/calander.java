package com.example.alaram.Calender;

import android.widget.DatePicker;

public class calander {
     private String d;
     private String id;


     public calander(){


     }

    public calander(String d, String id) {
        this.d = d;
        this.id = id;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
