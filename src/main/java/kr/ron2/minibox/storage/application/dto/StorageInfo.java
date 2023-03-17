package kr.ron2.minibox.storage.application.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor
@Getter
public class StorageInfo {

    private String storageId;
    private BigDecimal usedArea;
    private BigDecimal maxArea;



}
