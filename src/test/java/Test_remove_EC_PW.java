package test.java;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import main.java.Paperround;

import org.junit.Before;
import org.junit.Test;

public class Test_remove_EC_PW {

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
		paperround.remove(-1);
		assertEquals(0, paperround.getMagazines().size());
		assertEquals(0, paperround.getPapers().size());
	}
	
	@Test
	public void testCase2() {
		paperround.setMagazines(magazines);
		paperround.setPapers(papers);
		paperround.remove(1);
		assertEquals(0, paperround.getMagazines().size());
		assertEquals(0, paperround.getPapers().size());
	}
	
}
