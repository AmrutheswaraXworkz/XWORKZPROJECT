package com.xworkz.functional;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleFunction;
import java.util.function.DoublePredicate;

public class FunctionalInterface {
	static int i=1;
	public static void main(String[] args) {
		
		BiConsumer<String, Integer> consumer = (a, b) -> {
			System.out.println("BiConsumer interface:" + a);
			System.out.println("BiConsumer interface:" + b);
			System.out.println(i++);
		};

		consumer.accept("Hello", 10);

		BiFunction<String, Integer, Integer> function = (a, b) -> {

			System.out.println("BiFunction interface:" + a);
			System.out.println("BiFunction interface:" + b);
			System.out.println(i++);
			return -1;

		};

		function.apply("Hi", 11);

		BinaryOperator<String> binary = (a, b) -> {

			System.out.println("BinaryOperator interface:" + a);
			System.out.println("BinaryOperator interface:" + b);
			System.out.println(i++);
			return null;

		};

		binary.apply("Xworkz", "odc");

		BiPredicate<String, Integer> predicate = (a, b) -> {
			System.out.println("BiPredicate interface:" + a);
			System.out.println("BiPredicate interface:" + b);
			System.out.println(i++);
			return false;

		};
		predicate.test("October", 31);
		
		
		Consumer<String>consume=(a)->{
			System.out.println("Consumer interface:"+a);
			System.out.println(i++);
			
		};
		consume.accept("Hello friends");
		
		DoubleFunction<String>dFunction=(d)->{
			
			System.out.println("DoubleFunction:"+d);
			System.out.println(i++);
			return null;
			
		};
		dFunction.apply(10.0);
		
		BooleanSupplier supplier=()->{
			System.out.println("BooleanSupplier interface");
			System.out.println(i++);
			return false;
			
		};
		supplier.getAsBoolean();
		
		DoubleBinaryOperator binaryOp=(a,b)->{
			System.out.println("DoubleBinaryOperator:"+a+","+b);
			System.out.println(i++);
			return a;
			
		};
		
		binaryOp.applyAsDouble(10, 12);
		
		DoubleFunction<String> doubleFunction=(a)->{
			System.out.println("DoubleFunction interface:"+a);
			System.out.println(i++);
			return null;
			
		};
		
		doubleFunction.apply(100);
		
		DoublePredicate predicate2=(x)->{
			
			System.out.println("DoublePredicate:"+x);
			System.out.println(i++);
			return false;
			
		};
		
		predicate2.test(25);
		
	}

}
