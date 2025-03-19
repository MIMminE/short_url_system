package project.nuts.short_url_system.short_url_service.domain;

import lombok.AllArgsConstructor;

import java.time.LocalDateTime;
@AllArgsConstructor
public class UrlMapping {

    private final String originUrl;
    private final String cachedShortUrl;
    private  LocalDateTime expireTime;
    private boolean isActive;
}
