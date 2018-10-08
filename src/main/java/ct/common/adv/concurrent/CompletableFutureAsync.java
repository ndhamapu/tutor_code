package ct.common.adv.concurrent;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureAsync {

	public static void main(String[] args) throws ExecutionException, InterruptedException {

		CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> {
			try 
			{
				System.out.println(Thread.currentThread().getName());
				Thread.sleep(500);
			}
			catch (InterruptedException e) 
			
			{
				e.printStackTrace();
			}
			return "First Computation";
		});

		CompletableFuture<String> future = completableFuture.thenApplyAsync(
				(s) ->
				{
					try {
						System.out.println(Thread.currentThread().getName());
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					return s + " Appending Second Computation";

				});

		CompletableFuture<String> futureStep2 = future.thenApplyAsync(s -> s + " appending Third computation ");

		System.out.println("future = " + futureStep2.get());

	}

}