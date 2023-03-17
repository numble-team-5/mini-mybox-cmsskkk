package kr.ron2.minibox.storage.application.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor
@Getter
public class RootResponse {

    private StorageInfo storageInfo;
    private ResourcesResponse resources;

}
