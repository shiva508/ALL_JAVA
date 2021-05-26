package com.dasari.featurs9.completableFutureimprovements;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class CompletableFutureImprovements {
	public static void main(String[] args) {
		ExecutorService service = Executors.newCachedThreadPool();
		Executor exe = CompletableFuture.delayedExecutor(50L, TimeUnit.SECONDS);
	}
}
