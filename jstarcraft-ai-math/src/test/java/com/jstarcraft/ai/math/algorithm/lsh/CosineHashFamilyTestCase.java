package com.jstarcraft.ai.math.algorithm.lsh;

import java.util.Random;

import com.jstarcraft.core.utility.RandomUtility;

public class CosineHashFamilyTestCase extends LshHashFamilyTestCase {

	@Override
	protected LshHashFamily getHashFamily(Random random, int dimensions) {
		return new CosineHashFamily(dimensions);
	}

	@Override
	protected float getRandomData() {
		return RandomUtility.randomFloat(1F);
	}

}
