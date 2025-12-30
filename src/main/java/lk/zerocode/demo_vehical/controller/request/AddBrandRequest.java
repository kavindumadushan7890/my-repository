package lk.zerocode.demo_vehical.controller.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import tools.jackson.databind.PropertyNamingStrategy;
import tools.jackson.databind.annotation.JsonNaming;


//@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@Data
public  class AddBrandRequest {

    @JsonProperty("brand_id")
    private Long brandId;
    @JsonProperty("brand_name")
    private String brandName;


//    public Long getBrandId() {
//        return brandId;
//    }
//
//    public void setBrandId(Long brandId) {
//        this.brandId = brandId;
//    }
//
//    public String getBrandName() {
//        return brandName;
//    }
//
//    public void setBrandName(String brandName) {
//        this.brandName = brandName;
//    }
}

