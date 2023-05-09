import * as jwt from "jsonwebtoken";

const encData = jwt.sign(
  {
    data: "foobar",
  },
  process.env.SECRET,
  { expiresIn: "1h" }
);

const decData = jwt.verify(encData, process.env.SECRET);

console.log(decData); // { data: 'foobar', iat: 1590858701, exp: 1590862301 }
