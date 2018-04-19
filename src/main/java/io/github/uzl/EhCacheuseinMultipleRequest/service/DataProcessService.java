package io.github.uzl.EhCacheuseinMultipleRequest.service;

import io.github.uzl.EhCacheuseinMultipleRequest.ehcache_module.EhCacheDataProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DataProcessService {
  @Autowired
  EhCacheDataProvider cacheDataProvider;


  public String processName(String name){
    String tmpName= cacheDataProvider.getCountryNameByCode(name);
    tmpName +=  " country code "+name;
    return tmpName;
  }

}
