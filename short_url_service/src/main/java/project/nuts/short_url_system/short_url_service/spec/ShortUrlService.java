package project.nuts.short_url_system.short_url_service.spec;

import project.nuts.short_url_system.short_url_service.domain.UrlMapping;
import project.nuts.short_url_system.short_url_service.exception.DuplicateUrlException;

import java.util.List;

public interface ShortUrlService {

    UrlMapping registerOriginUrl(String originUrl, String customShortUrl) throws DuplicateUrlException;

    String getOriginUrlFromCache(String requestUrl, boolean autoRegister);

    List<UrlMapping> getRegisteredUrlMappings();

    List<UrlMapping> getActiveUrlMappings();
}

/**
 * 단축 URL 정보 등록 기능 // 중복 등록 시 예외 발생
 * 단축 URL 조회 기능 ( 리 다이렉트 용도 , 옵션으로 자동 등록 설정 제공 )
 */
