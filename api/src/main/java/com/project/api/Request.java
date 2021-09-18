package com.project.api;

import com.project.model.Product;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "api", fallback = RequestFallback.class)
public interface Request {

    @RequestMapping(method = RequestMethod.POST, path = "/api/product")
    Product getProducts();

}
