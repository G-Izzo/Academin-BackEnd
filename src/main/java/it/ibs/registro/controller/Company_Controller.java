package it.ibs.registro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.ibs.registro.service.Company_Service;

@RestController
@RequestMapping("/api/v1")
public class Company_Controller {

	@Autowired
	private Company_Service company_service;
}
