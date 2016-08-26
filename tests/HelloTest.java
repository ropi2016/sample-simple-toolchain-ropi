package com.ibm.ids.example.tests;

//********************************************************************************
// Copyright 2015 IBM
//
//   Licensed under the Apache License, Version 2.0 (the "License");
//   you may not use this file except in compliance with the License.
//   You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
//   Unless required by applicable law or agreed to in writing, software
//   distributed under the License is distributed on an "AS IS" BASIS,
//   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//   See the License for the specific language governing permissions and
//********************************************************************************

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;


public class HelloTest {
	
	@Test
	public void testCountWords_Null() {
		int count = 0;
		assertTrue(count == 0);
	}

}