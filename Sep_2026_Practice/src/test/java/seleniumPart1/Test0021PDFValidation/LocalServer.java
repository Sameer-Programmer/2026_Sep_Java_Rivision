package seleniumPart1.Test0020PDFValidation;

import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.file.Files;
import java.nio.file.Path;

public class LocalServer {

    public static void main(String[] args) throws IOException {

        String projectPath = System.getProperty("user.dir");

        Path webFolder = Path.of(
                projectPath,
                "DemoWebPages"
        );

        HttpServer server = HttpServer.create(
                new InetSocketAddress(8080),
                0
        );

        server.createContext("/", exchange -> {

            String requestPath = exchange.getRequestURI().getPath();

            Path requestedFile;

            if (requestPath.equals("/")) {

                requestedFile = webFolder.resolve("index.html");

            } else {

                requestedFile = webFolder.resolve(
                        requestPath.substring(1)
                );
            }

            if (!Files.exists(requestedFile)) {

                String response = "404 - File Not Found";

                exchange.sendResponseHeaders(
                        404,
                        response.length()
                );

                exchange.getResponseBody()
                        .write(response.getBytes());

                exchange.close();

                return;
            }

            byte[] response = Files.readAllBytes(requestedFile);

            if (requestPath.endsWith(".pdf")) {

                exchange.getResponseHeaders()
                        .set("Content-Type", "application/pdf");

            } else {

                exchange.getResponseHeaders()
                        .set("Content-Type", "text/html");
            }

            exchange.sendResponseHeaders(
                    200,
                    response.length
            );

            exchange.getResponseBody()
                    .write(response);

            exchange.close();
        });

        server.start();

        System.out.println(
                "Server started: http://localhost:8080"
        );
    }
}