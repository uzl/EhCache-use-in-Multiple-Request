package io.github.uzl.EhCacheuseinMultipleRequest.ehcache_module;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.cache.ehcache.EhCacheManagerFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

@EnableCaching
@Configuration
public class EhCacheInitializationConfig {
    @Bean
    public CacheManager cacheManager (){
        return new EhCacheCacheManager(cachemanagerFactory().getObject());
    }

    @Bean
    public EhCacheManagerFactoryBean cachemanagerFactory() {
        EhCacheManagerFactoryBean bean = new EhCacheManagerFactoryBean();
        bean.setConfigLocation(new ClassPathResource("ehcache.xml"));
        bean.setShared(true);
        return bean;
    }

}
