package com.example;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Map;

@RestController
@RequestMapping("/updates")
public class Controller {

    @RequestMapping(value="/{json}", method=RequestMethod.GET)
    String updates(@PathVariable String json) {
        
        return json;
      }

    @RequestMapping(value="/{json}", method=RequestMethod.POST)
    Map<String, String> newUpdates(@RequestBody Map<String, String> info) {
        System.out.println(info);
        //tring s = info.get("Name");
        return info;
    }

    @RequestMapping(value="/{json}/object", method=RequestMethod.POST)
    Object ObjectUpdates(@RequestBody Map<String, Object> obj) {
        System.out.println(obj);
        return obj;
    }
}