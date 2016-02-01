package com.kostech.easymock.test;

import org.easymock.EasyMockRunner;
import org.easymock.Mock;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EasyMockRunner.class)
public class ExampleTest {

	//To get a Mock Object, we need to

	//1.create a Mock Object for the interface we would like to simulate,
	//2.record the expected behavior, and
	//3.switch the Mock Object to replay state.
	
    private ClassUnderTest classUnderTest;
    @Mock
    private Collaborator mock;

    @Before
    public void setUp() {
       classUnderTest=new ClassUnderTest();
       classUnderTest.setListener(mock);
    }

    

	@Test
    public void testRemoveNonExistingDocument() {    
     classUnderTest.removeDocument("don't exist...");
    }
}
