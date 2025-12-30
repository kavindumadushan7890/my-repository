package lk.zerocode.demo_vehical.service;

import lk.zerocode.demo_vehical.controller.request.AddBrandRequest;

public interface BrandService {

    public  void create(AddBrandRequest addBrandRequest);

    public void findById(Long id);
}
