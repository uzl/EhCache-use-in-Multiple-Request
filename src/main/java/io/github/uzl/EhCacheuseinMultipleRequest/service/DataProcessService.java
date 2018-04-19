package io.github.uzl.EhCacheuseinMultipleRequest.service;

import io.github.uzl.EhCacheuseinMultipleRequest.ehcache_module.EhCacheDataProvider;
import io.github.uzl.EhCacheuseinMultipleRequest.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DataProcessService {
  @Autowired
  EhCacheDataProvider cacheDataProvider;


  public Country processName(String code){
    Country country1 = cacheDataProvider.getCountryNameByCode(code);
    country1.setCountryName( country1.getCountryName() + " is a country with code "+ code );
    return country1;
  }

}
