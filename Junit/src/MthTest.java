import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class MthTest {
Mth math;
@BeforeEach

void init() {
	System.out.println("init");
	math=new Mth();//this is call refactor
}
	@Test
	void testAdd() {
		Mth math=new Mth();
		int result =math.add(-1,2,3);
     Assert.assertEquals(4,result);

	}
	@Test
	void testAddWithNegativity() {
		Mth math=new Mth();
		int result1 =math.add(-1,-2,-3);
     Assert.assertEquals(-6,result1);

	}
	@Test
	void testMultiplyBothNegativeNumber() {
		Mth math=new Mth();
		int result2=math.multiply(-3,-4);
		Assert.assertEquals(12, result2);
	}
	@Test
	void testMultiplyWithOneNegativityNumber() {
		Mth math=new Mth();
		int result2=math.multiply(-3,4);
		Assert.assertEquals(-12, result2);
	}
	@Test
	void testMultiplyWithpositiveNumber() {
		Mth math=new Mth();
		int result2=math.multiply(3,4);
		Assert.assertEquals(12, result2);
	}
	@Test
	void testMultiplyWiththreeNumber() {
		Mth math=new Mth();
		int result2=math.multiply(-3,4,5);
		Assert.assertEquals(-60, result2);
	}
	@Test
	void testMultiplyWithOnrZeroNumber() {
		Mth math=new Mth();
		int result2=math.multiply(3,0);
		Assert.assertEquals(0, result2);
	}
	@Test
	void testMultiplyWithOneNegative() {
		Exception exception=assertThrows(IllegalArgumentException.class,()->{
			math.multiply(-1,-1);
		});
		
	}
}
