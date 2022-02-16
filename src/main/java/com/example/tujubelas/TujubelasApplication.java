package com.example.tujubelas;

import java.text.NumberFormat;
import java.util.HashMap;

/**
 * https://mydeveloperplanet.com/2021/09/28/whats-new-between-java-11-and-java-17/
 */
public class TujubelasApplication {

	public static void main(String[] args) {
		TripleQuote.oldStyle();
		TripleQuote.jsonBlock();
		TripleQuote.jsonMovedBracketsBlock();
		TripleQuote.jsonMovedEndQuoteBlock();

		System.out.println("=============================================");
		SwitchExpression.oldStyleWithoutBreak(Fruit.APPLE);
		SwitchExpression.oldStyleWithBreak(Fruit.APPLE);
		SwitchExpression.withSwitchExpression(Fruit.APPLE);
		SwitchExpression.withReturnValue(Fruit.APPLE);
		SwitchExpression.withReturnValueEvenShorter(Fruit.APPLE);
		SwitchExpression.withYield(Fruit.APPLE);
		SwitchExpression.oldStyleWithYield(Fruit.APPLE);

		System.out.println("=============================================");
		Records.basicRecord();
		Records.oldStyle();
//		Records.basicRecordWithValidation();

		System.out.println("=============================================");
		PatternMatching.oldStyle();
		PatternMatching.patternMatching();
		PatternMatching.patternMatchingScope();
		PatternMatching.patternMatchingScopeException();

		System.out.println("=============================================");
		CompactNumber.kompek(NumberFormat.Style.SHORT);
		CompactNumber.kompek(NumberFormat.Style.LONG);

		System.out.println("=============================================");
		StreamToList.oldStyle();
		StreamToList.streamToList();

		System.out.println("=============================================");
		HashMap<String, GrapeClass> grapes = new HashMap<>();
		grapes.put("grape1", new GrapeClass(Color.BLUE, 2));
		grapes.put("grape2", new GrapeClass(Color.WHITE, 4));
		grapes.put("grape3", null);
		var color = ((GrapeClass) grapes.get("grape3")).getColor();

	}
}
