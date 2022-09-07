package org.net;

import org.testng.annotations.Test;

public class Client1 {
@Test(groups= {"smoke,cricket"})
private void tc1() {
System.out.println("test1");

}
@Test(groups= {"smoke","cricket"})
private void tc2() {
	System.out.println("test2");

}
@Test(groups="regression")
private void tc3() {
	System.out.println("test3");

}
@Test(groups= {"smoke,cricket"})
private void tc4() {
	System.out.println("test4");

}
}
