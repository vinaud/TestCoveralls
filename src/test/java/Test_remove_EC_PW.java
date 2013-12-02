package test.java;

import static org.junit.Assert.*;

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
	public void setUp() {
		paperround = new Paperround();
		magazines = new ArrayList<>();
		papers = new ArrayList<>();
	}

	@Test
	public void TestCase1() {
		paperround.remove(-1);
		magazines = paperround.getMagazines();
		papers = paperround.getPapers();
		assertFalse(magazines.contains(-1) && papers.contains(-1));
	}

	@Test
	public void TestCase2() {
		paperround.remove(1);
		magazines = paperround.getMagazines();
		papers = paperround.getPapers();
		assertFalse(magazines.contains(1) && papers.contains(1));
	}

}
