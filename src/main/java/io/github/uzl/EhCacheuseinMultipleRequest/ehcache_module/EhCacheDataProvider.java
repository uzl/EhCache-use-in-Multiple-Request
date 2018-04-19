package io.github.uzl.EhCacheuseinMultipleRequest.ehcache_module;

import io.github.uzl.EhCacheuseinMultipleRequest.model.Country;
import io.github.uzl.EhCacheuseinMultipleRequest.repository.DummyDataRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
public class EhCacheDataProvider {

  @Autowired
  EhCacheStoringLayer cacheStoringLayer;


    public Country getCountryNameByCode(String code){
      return cacheStoringLayer.getData(code);
    }
}
