//import org.testng.annotations.Test;

import base.GenericApi;
import org.testng.annotations.Test;

/**
 * Created with IntelliJ IDEA.
 * User: rrt
 * Date: 12/29/13
 * Time: 12:37 PM
 * To change this template use File | Settings | File Templates.
 */
public class CnnTest extends GenericApi {
   @Test
    public void home()throws InterruptedException{
     //  Thread.sleep(5000);
       System.out.println(getUrl());
       clickByCss("#nav-politics");
       System.out.println("after click");
   }
    @Test
    public void nav()throws InterruptedException{
        //  Thread.sleep(5000);
        System.out.println(getUrl());
        clickByCss("#nav-world");
        System.out.println("after click");
    }
}
