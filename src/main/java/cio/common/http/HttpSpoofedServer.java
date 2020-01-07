package cio.common.http;

import io.vertx.core.AbstractVerticle;

public class HttpSpoofedServer extends AbstractVerticle {

	// Convenience method so you can run it in your IDE
	public static void main(String[] args) {
		Runner.runExample(HttpSpoofedServer.class);
	}

	@Override
	public void start() throws Exception {

		vertx.createHttpServer().requestHandler(req -> {

			req.bodyHandler(buff -> {
				System.out.println("Receiving user " + buff.toJsonObject().encodePrettily() + " from client ");
				req.response().end();
			});

		}).listen(8080, listenResult -> {
			if (listenResult.failed()) {
				System.out.println("Could not start HTTP server");
				listenResult.cause().printStackTrace();
			} else {
				System.out.println("Server started");
			}
		});
	}
}