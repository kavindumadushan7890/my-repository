package lk.zerocode.demo_vehical.service.impl;

import lk.zerocode.demo_vehical.controller.request.AddBrandRequest;
import lk.zerocode.demo_vehical.model.Brand;
import lk.zerocode.demo_vehical.repository.BrandRepository;
import lk.zerocode.demo_vehical.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BrandServiceImpl implements BrandService{

    @Autowired
    private BrandRepository brandRepository;

    @Override
    public void create(AddBrandRequest addBrandRequest) {
        
        System.out.println("Create brand ID " + addBrandRequest.getBrandId());
        System.out.println("Create brand Name " + addBrandRequest.getBrandName());


        Brand brand = new Brand();
        //brand.setBrandId(addBrandRequest.getBrandId());
        brand.setBrandName(addBrandRequest.getBrandName());
        brandRepository.save(brand);









    }
}
