package com.arextest.web.model.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class AppContractDto extends BaseDto {
    private String appId;
    private Integer contractType;
    private String operationId;
    private String operationName;
    private String operationType;
    private String contract;
}