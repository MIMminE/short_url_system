package project.nuts.short_url_system.short_url_service.dto.request;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class TestRequest {
    private final String id;
    private final String password;
}
