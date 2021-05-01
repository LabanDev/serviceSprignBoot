package com.example.product.controller;

import org.springframework.web.bind.annotation.*;

@RequestMapping("/v1/products")
@RestController
public class ProductController {
    @GetMapping
    //@RequestMapping(value = "", method = RequestMethod.GET)
    public String hello(){
        return "Hello word";
    }

    @GetMapping("/{id}")
    public String methodOne(@PathVariable Integer id){
        return "Hello word";
    }

    @GetMapping("/{productid}")
    public String methodTwo(@PathVariable("productid") Integer productId){
        return "Hello word";
    }

    @GetMapping("")
    public String methodThre(@RequestParam(name = "dominios") String dominios){
        return "Hello word";
    }

    @PostMapping("")
    public String methodFour(@RequestBody Object object){
        return "Hello word";
    }

    @PostMapping("/{productid}")
    public String methodFive(@RequestBody Object object, @PathVariable("productid") Integer productId){
        return "Hello word";
    }


}
