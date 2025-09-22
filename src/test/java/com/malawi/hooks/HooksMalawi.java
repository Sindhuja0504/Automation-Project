package com.malawi.hooks;

import org.junit.AfterClass;
import org.junit.BeforeClass;

import com.malawi.baseclass.MBaseClass;

public class HooksMalawi extends  MBaseClass{
	
	@BeforeClass
	public  void beforClass() {
		System.out.println("BeforeClass");
	}
	
	@AfterClass
	public  void afterClass() {
		System.out.println("AfterClass");
	}

}
