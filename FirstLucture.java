package com.mycompany.firstlucture;

public class FirstLucture {

    public static void main(String[] args) {
      double Grade=81;
     String Criteria=null;
      String AcademicStream="Scientific";
      if (Grade>=75 && Grade<=100  && AcademicStream.equals("Scientific") )
    Criteria="Congradulations!You are accepted to AcademicStream";
      else 
          if (Grade>=65 && Grade<75  && AcademicStream.equals("Literary") )
   Criteria="Congradulations!YouareAcceptedtoAcademicStream";
    else 
    if (Grade>100 || Grade<0 )
         Criteria="invalidInput";
   else 
        if 
         (Grade>=0 && Grade<65 )
         Criteria="We are sorry!your grade doesnot meet the minimum requirments to the stream";
        System.out.println("Criteria is:"+ Criteria);
    }
}

