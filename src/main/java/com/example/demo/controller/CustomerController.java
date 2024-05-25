package com.example.demo.controller;

import java.io.UnsupportedEncodingException;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.dto.CustomerDto;
import com.example.demo.service.CustomerService;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

@Controller
public class CustomerController {

	@Autowired
	CustomerService customerService;

	@Autowired
	JavaMailSender javaMailSender;

	@GetMapping("/")
	public String loadHome() {
		return "home";
	}

	@GetMapping("/cs")
	public String loadSignup() {
		return "customersignup";
	}

	@PostMapping("/signup")
//	@ResponseBody
	public String createCustomer(CustomerDto customerDto, ModelMap map)
			throws UnsupportedEncodingException, MessagingException {
		int otp = new Random().nextInt(1000, 9999);
		customerDto.setOtp(otp);
		// return customerDto.toString();
		customerService.createCustomer(customerDto);// saving to db
		if (sendMessage(customerDto)) {
			map.put("pass", "otp sent");
			map.put("id", customerDto.getId());
			return "enter-otp";
		} else
			return "register";

	}

	public boolean sendMessage(CustomerDto c) throws UnsupportedEncodingException, MessagingException {
		MimeMessage mimemessage = javaMailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(mimemessage);

		helper.setFrom("kiransurya030@gmail.com", "customer Authentication");
		helper.setTo(c.getEmail());
		helper.setSubject("<h1>otp verification</h1>");
		helper.setText("hello" + " " + c.getName() + " your otp is, " + c.getOtp());

		javaMailSender.send(mimemessage);
		return true;
	}

	@PostMapping("/verify-otp")
	public String otpVerfication(CustomerDto customerDto, ModelMap map) {
		return customerService.otpVerfication(customerDto, map);
	}

	@PostMapping("/customerlogin")
	public String loginValidation(CustomerDto customerDto, ModelMap map) {
		return customerService.loginValidation(customerDto, map);
	}
}
