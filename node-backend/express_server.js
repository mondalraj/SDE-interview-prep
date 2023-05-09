import express from "express";
const app = express();

app.use(express.json());
app.use(express.urlencoded({ extended: true }));

app.get("/", (req, res) => {
  res.send("Hello World!");
});

app.post("/login", (req, res) => {
  res.json(req.body);
});

app.listen(3000, () => console.log("Server ready"));
