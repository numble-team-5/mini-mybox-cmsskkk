package kr.ron2.minibox.storage.ui;

import kr.ron2.minibox.storage.application.StorageService;
import kr.ron2.minibox.storage.application.dto.RootResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/resources")
@RequiredArgsConstructor
public class StorageController {

    private final StorageService storageService;
    @GetMapping
    public Mono<RootResponse> getRoot(String memberId) {

        return storageService.getStorageRoot(memberId);
    }
}
