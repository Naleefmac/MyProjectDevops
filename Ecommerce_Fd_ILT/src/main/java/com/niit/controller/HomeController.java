package com.niit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController
{
   @RequestMapping("/")	
   public ModelAndView index()
   {
	   ModelAndView m1=new ModelAndView("index");
	   return m1;
   }
   @RequestMapping("/login")
   public ModelAndView loginpage()
   {
	   ModelAndView m2=new ModelAndView("login");
	   return m2;
   }
   
   @RequestMapping("/register")
   public ModelAndView regpage()
   {
	   ModelAndView m3=new ModelAndView("registerpage");
	   return m3;
   }  
	  
}