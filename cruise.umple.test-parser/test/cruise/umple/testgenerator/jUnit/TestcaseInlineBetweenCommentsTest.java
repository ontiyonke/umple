/* EXPERIMENTAL CODE - NON COMPILEABLE VERSION OF Umple xUnit Model */
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE @UMPLE_VERSION@ modeling language!*/



import org.junit.*;

////---- Tests for  TestcaseInlineBetweenComments.ump----/////



public class TestcaseInlineBetweenCommentsTest {
 
 
 

  @Before
  public void setup(){

  }


 

  @After
  public void teardown(){


  }


 
  @Test
  public void someTest()
  {
	    //some inline comment            
            Person p1 = new Person ("John","123","someAddrss");
	    //some in between comment     
            Assert.assertTrue (p1.getId()!=null);
    

	    /*multi in between*/     
            Assert.assertTrue (p1.getId()!=null);
    
  }  
  
 
 

}
