const mongoose = require("mongoose");
exports.connect = () => {
  // Connecting to the database
  mongoose
    .connect('mongodb://db:27017/myapp')
    .then(() => {
      console.log("Successfully connected to database");
    })
    .catch((err) => {
      console.log("database connection failed. exiting now...");
      console.error(err);
      process.exit(1);
    });
};