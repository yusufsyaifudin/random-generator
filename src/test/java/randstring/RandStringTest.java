package randstring;

import java.util.ArrayList;
import org.junit.Assert;
import yusufs.generator.randstring.RandomStringGenerator;

public class RandStringTest {
	
	ArrayList<String> alphanumeric = new ArrayList<String>();
	ArrayList<String> alpha = new ArrayList<String>();
	ArrayList<String> numeric = new ArrayList<String>();
	
	public RandStringTest() {
		
	}

	@org.junit.Test
	public void testAlphaNumeric() {
		
		for(int i=0; i<10000; i++) {
			String random = RandomStringGenerator.generateRandomString(10, RandomStringGenerator.Mode.ALPHANUMERIC);
			
			// pastikan tidak ada yang sama pada daftar array
			Assert.assertEquals(alphanumeric.contains(random), false);
			alphanumeric.add(random);
		}

		// perulangan kedua, memastikan tidak ada yang sama meskipun telah diulangi lagi pada kesempatan yang berbeda
		for(int i=0; i<10000; i++) {
			String random = RandomStringGenerator.generateRandomString(10, RandomStringGenerator.Mode.ALPHANUMERIC);
			
			// pastikan tidak ada yang sama pada daftar array
			Assert.assertEquals(alphanumeric.contains(random), false);
			alphanumeric.add(random);
		}
	}

	@org.junit.Test
	public void testAlpha() {
		
		for(int i=0; i<10000; i++) {
			String random = RandomStringGenerator.generateRandomString(10, RandomStringGenerator.Mode.ALPHA);
			
			// pastikan tidak ada yang sama pada daftar array
			Assert.assertEquals(alpha.contains(random), false);
			alpha.add(random);
		}

		// perulangan kedua, memastikan tidak ada yang sama meskipun telah diulangi lagi pada kesempatan yang berbeda
		for(int i=0; i<10000; i++) {
			String random = RandomStringGenerator.generateRandomString(10, RandomStringGenerator.Mode.ALPHA);
			
			// pastikan tidak ada yang sama pada daftar array
			Assert.assertEquals(alpha.contains(random), false);
			alpha.add(random);
		}
	}

	@org.junit.Test
	public void testNumeric() {
		
		for(int i=0; i<10000; i++) {
			String random = RandomStringGenerator.generateRandomString(10, RandomStringGenerator.Mode.NUMERIC);
			
			// pastikan tidak ada yang sama pada daftar array
			Assert.assertEquals(numeric.contains(random), false);
			numeric.add(random);
		}

		// perulangan kedua, memastikan tidak ada yang sama meskipun telah diulangi lagi pada kesempatan yang berbeda
		for(int i=0; i<10000; i++) {
			String random = RandomStringGenerator.generateRandomString(10, RandomStringGenerator.Mode.NUMERIC);
			
			// pastikan tidak ada yang sama pada daftar array
			Assert.assertEquals(numeric.contains(random), false);
			numeric.add(random);
		}
	}

}
