package org.net;

import org.testng.annotations.Test;

public class Client {
@Test(groups= {"smoke","cricket"})
private void tc5() {
	System.out.println("test5");

}
@Test(groups="cricket")
private void tc6() {
	System.out.println("test6");

}
@Test(groups="smoke")
private void tc7() {
	System.out.println("test 7");

}
}
