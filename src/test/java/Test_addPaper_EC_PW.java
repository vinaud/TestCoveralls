package test.java;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import main.java.Paperround;

import org.junit.Before;
import org.junit.Test;

public class Test_addPaper_EC_PW {

	private Paperround paperround;
	private List<Integer> magazines;
	private List<Integer> papers;

	@Before
	public void setUp() {
		paperround = new Paperround();
		magazines = new ArrayList<>();
		papers = new ArrayList<>();
	}

	@Test
	public void testCase1() {
		int houseNumber = 1;
		paperround.setMagazines(magazines);
		paperround.setPapers(papers);
		paperround.addPaper(houseNumber);
		paperround.addMagazine(houseNumber);
		papers = paperround.getPapers();
		assertTrue(papers.contains(1));
	}

	@Test
	public void testCase2() {
		int houseNumber = -1;
		paperround.setMagazines(magazines);
		paperround.setPapers(papers);
		paperround.addPaper(houseNumber);
		paperround.addMagazine(houseNumber);
		papers = paperround.getPapers();
		assertFalse(papers.contains(-1));
	}

}
