package io.github.uzl.EhCacheuseinMultipleRequest.controller;


import io.github.uzl.EhCacheuseinMultipleRequest.ehcache_module.EhCacheDataProvider;
import io.github.uzl.EhCacheuseinMultipleRequest.service.DataProcessService;
import net.sf.ehcache.hibernate.EhCacheProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CountryNameController {

  @Autowired
  DataProcessService dataProcess;

  @GetMapping(value = "/{name}")
  public String getName(@PathVariable final String name){
     return dataProcess.processName(name);
  }

}
