package test.java;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import main.java.Paperround;

import org.junit.Before;
import org.junit.Test;

public class Test_addPaper_EC_PW {

	private Paperround paperround;
	private List<Integer> papers;

	@Before
	public void setUp() {
		paperround = new Paperround();
		papers = new ArrayList<>();
	}

	@Test
	public void TestCase1() {
		paperround.addPaper(1);
		papers = paperround.getPapers();
		assertTrue(papers.contains(1));
	}

	@Test
	public void TestCase2() {
		paperround.addPaper(-1);
		papers = paperround.getPapers();
		assertFalse(papers.contains(-1));
	}

}
