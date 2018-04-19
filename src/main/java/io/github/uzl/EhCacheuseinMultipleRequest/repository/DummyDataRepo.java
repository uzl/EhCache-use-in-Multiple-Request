package io.github.uzl.EhCacheuseinMultipleRequest.repository;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Component
public class DummyDataRepo {


  public String getCountryByCode(String code) {
    // for dummy data purpose only.
    // This should be fetched from database or any file
    System.out.println(">>> --- >>>> Fetching from Database... <<< --- <<<< "); // here actually dummy data
    String dbResult = "";
    if (code.equals("AU")) {
      dbResult = "Australia";
    }
    else if (code.equals("BD")){
      dbResult = "Bangladesh";
    }
    else if (code.equals("CA")){
      dbResult = "Canada";
    }
    else if (code.equals("DK")){
      dbResult = "Denmark";
    }
    else {
      dbResult = "Country not in list.";
    }

    return dbResult;
  }
}
