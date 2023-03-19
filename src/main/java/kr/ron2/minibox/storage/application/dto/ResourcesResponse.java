package kr.ron2.minibox.storage.application.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor
@Getter
public class ResourcesResponse {

    private String resourceId;
    private String parentId;
    private Boolean isDirectory;
    private BigDecimal size;
    private List<ResourcesResponse> innerResources;

}
