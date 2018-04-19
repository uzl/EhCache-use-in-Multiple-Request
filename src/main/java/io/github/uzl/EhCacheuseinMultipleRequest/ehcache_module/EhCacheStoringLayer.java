package io.github.uzl.EhCacheuseinMultipleRequest.ehcache_module;

import io.github.uzl.EhCacheuseinMultipleRequest.model.Country;
import io.github.uzl.EhCacheuseinMultipleRequest.repository.DummyDataRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
public class EhCacheStoringLayer {

  @Autowired
  DummyDataRepo dummyDataRepo;

  @Cacheable(value = "cacheContainer1", key = "#keystr")
  public Country getData(String keystr){
    // return data will be stored in cached.
    return dummyDataRepo.getCountryByCode(keystr);
  }
}
