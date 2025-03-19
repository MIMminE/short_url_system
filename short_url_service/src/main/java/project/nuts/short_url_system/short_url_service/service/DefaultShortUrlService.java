package project.nuts.short_url_system.short_url_service.service;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import project.nuts.short_url_system.short_url_service.domain.UrlMapping;
import project.nuts.short_url_system.short_url_service.exception.DuplicateUrlException;
import project.nuts.short_url_system.short_url_service.spec.ShortUrlService;

import java.util.List;
import java.util.concurrent.TimeUnit;

@Service
@RequiredArgsConstructor
public class DefaultShortUrlService implements ShortUrlService, ApplicationRunner {

    private final RedisProperties redisProperties;
    private final StringRedisTemplate redisTemplate;

    @Override
    public UrlMapping registerOriginUrl(String originUrl, String customShortUrl) throws DuplicateUrlException {


        return null;
    }

    @Override
    public String getOriginUrlFromCache(String requestUrl, boolean autoRegister) {
        return "";
    }

    @Override
    public List<UrlMapping> getRegisteredUrlMappings() {
        return List.of();
    }

    @Override
    public List<UrlMapping> getActiveUrlMappings() {
        return List.of();
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        redisTemplate.opsForValue().set("test1", "testValue222", 3, TimeUnit.SECONDS);
        Thread.sleep(1000);

        redisTemplate.expire("test1", 15000, TimeUnit.SECONDS);

        String s = redisTemplate.opsForValue().get("test");
        Long test1 = redisTemplate.getExpire("test1");
        String s2 = redisTemplate.opsForValue().get("test1");

        String s3 = redisTemplate.opsForValue().get("test221");

        System.out.println(s);

    }
}
