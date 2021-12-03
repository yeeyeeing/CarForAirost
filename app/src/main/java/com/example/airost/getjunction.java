package com.example.airost;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.nio.file.Paths;
import java.sql.Array;
import java.util.ArrayList;


public class getjunction {
   String status;
   String data;




    public String getData()
    {
        return data;
    }
    public void setData(String data)
    {this.data=data;}

    public String getStatus() {
        return status;
    }
    public void setStatus(String status)
    {this.status=status;}



}
