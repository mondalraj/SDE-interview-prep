const http = require("http");
const fs = require("fs");

const server = http.createServer((req, res) => {
  fs.appendFile("log.txt", `${new Date()}, URL: ${req.url}\n`, (err, data) => {
    if (err) {
      console.log(err);
    }
  });

  switch (req.url) {
    case "/":
      // serve index.html file
      //   fs.readFile("index.html", (err, data) => {
      //     if (err) {
      //       console.log(err);
      //     }
      //     console.log(data);
      //     res.writeHead(200, { "Content-Type": "text/html" });
      //     res.write(data);
      //   });

      res.end("<h1>Home Page</h1>");
      break;
    case "/about":
      res.end("About Page");
      break;
    case "/contact":
      res.end("Contact Page");
      break;
    default:
      res.end("404 Page Not Found");
  }

  res.end();
});

server.listen(3000, () => {
  console.log("Server is running on port 3000");
});
