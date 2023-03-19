package kr.ron2.minibox.storage.application;


import kr.ron2.minibox.storage.application.dto.RootResponse;
import reactor.core.publisher.Mono;

public interface StorageService {

    Mono<RootResponse> getStorageRoot(String memberId);
}
