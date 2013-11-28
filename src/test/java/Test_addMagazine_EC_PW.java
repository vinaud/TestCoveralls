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
	private List<Integer> papers;

	@Before
	public void startUp() {
		paperround = new Paperround();
		magazines = new ArrayList<>();
		papers = new ArrayList<>();
	}
	
	@Test
	public void testCase1() {
		papers.add(1);
		paperround.setMagazines(magazines);
		paperround.setPapers(papers);
		paperround.addMagazine(1);
		assertEquals(1, paperround.getMagazines().size());
	}
	
	@Test
	public void testCase2() {
		paperround.setMagazines(magazines);
		paperround.setPapers(papers);
		paperround.addMagazine(0);
		assertEquals(0, paperround.getMagazines().size());
	}

}
