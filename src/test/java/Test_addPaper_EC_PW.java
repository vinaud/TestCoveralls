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
	public void startUp() {
		paperround = new Paperround();
		magazines = new ArrayList<>();
		papers = new ArrayList<>();
	}
	
	@Test
	public void testCase1() {
		paperround.setMagazines(magazines);
		paperround.setPapers(papers);
		paperround.addPaper(1);
		assertEquals(1, paperround.getPapers().size());
	}
	
	@Test
	public void testCase2() {
		paperround.setMagazines(magazines);
		paperround.setPapers(papers);
		paperround.addPaper(-1);
		assertEquals(0, paperround.getPapers().size());
	}

}
