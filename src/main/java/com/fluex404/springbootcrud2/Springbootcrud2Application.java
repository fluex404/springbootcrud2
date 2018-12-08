package com.fluex404.springbootcrud2;

import com.fluex404.springbootcrud2.dao.SiswaDao;
import com.fluex404.springbootcrud2.model.Siswa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Springbootcrud2Application{

	public static void main(String[] args){
		SpringApplication.run(Springbootcrud2Application.class, args);
	}

}
