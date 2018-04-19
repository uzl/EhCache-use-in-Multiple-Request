package io.github.uzl.EhCacheuseinMultipleRequest.repository;

import io.github.uzl.EhCacheuseinMultipleRequest.model.Country;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Component
public class DummyDataRepo {


  public Country getCountryByCode(String code) {
    // for dummy data purpose only.
    // This should be fetched from database or any file
    System.out.println(">>> --- >>>> Fetching from Database... <<< --- <<<< "); // here actually dummy data
    Country country = new Country();
    if (code.equals("AU")) {
      country.setCountryName( "Australia");
    }
    else if (code.equals("BD")){
      country.setCountryName( "Bangladesh");
    }
    else if (code.equals("CA")){
      country.setCountryName( "Canada");
    }
    else if (code.equals("DK")){
      country.setCountryName( "Denmark");
    }
    else {
      country.setCountryName( "Unknown country.");
    }

    return country;
  }
}
