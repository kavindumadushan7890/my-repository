package lk.zerocode.demo_vehical.controller;

import lk.zerocode.demo_vehical.controller.request.AddBrandRequest;
import lk.zerocode.demo_vehical.model.Brand;
import lk.zerocode.demo_vehical.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BrandController {

    @Autowired
    private BrandService brandService;

    @PostMapping(value = "/brands")
    public void createBrand(@RequestBody AddBrandRequest addBrandRequest){
//
//        System.out.println("Create brand");
//        System.out.println("Create brand ID " + addBrandRequest.getBrandId());
//        System.out.println("Create brand Name " + addBrandRequest.getBrandName());
        brandService.create(addBrandRequest);

    }

    @GetMapping(value = "/brands/{brand-id}")
    public void getBrand(@PathVariable("brand-id") Long brandId){

        brandService.findById(brandId);



    }


}
