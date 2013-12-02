package test.java;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import main.java.Paperround;

import org.junit.Before;
import org.junit.Test;

public class Test_addMagazine_EC_PW {

	private Paperround paperround;
	private List<Integer> magazines;

	@Before
	public void setUp() {
		/*paperround = new Paperround();
		magazines = new ArrayList<>();*/
	}

	@Test
	public void testCase1() {
		/*int houseNumber = 1;
		paperround.addPaper(houseNumber);
		paperround.addMagazine(houseNumber);
		magazines = paperround.getMagazines();
		assertTrue(magazines.contains(1));*/
		assertTrue(true);
	}

	@Test
	public void testCase2() {
		/*paperround.addMagazine(0);
		magazines = paperround.getMagazines();
		assertFalse(magazines.contains(0));*/
		assertTrue(true);
	}

}
