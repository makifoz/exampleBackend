package com.example.Bit.controller;


import com.example.Bit.service.DummyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class DummyController {
    @Autowired
    private DummyService dummyService;

    @GetMapping("/dummy")
    public ResponseEntity<?> getDummies(@RequestParam Integer pageNo,
                                        @RequestParam Integer pageSize){
        try{
            return ResponseEntity.ok(dummyService.getAll(pageNo,pageSize));

        }catch (Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }

    }





}