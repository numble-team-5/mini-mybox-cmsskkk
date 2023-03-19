package kr.ron2.minibox.storage.application.impl;

import kr.ron2.minibox.storage.application.StorageService;
import kr.ron2.minibox.storage.application.dto.RootResponse;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class StorageServiceImpl implements StorageService {
    @Override
    public Mono<RootResponse> getStorageRoot(String memberId) {
        return null;
    }
}
