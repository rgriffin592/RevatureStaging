var express = require('express');
var router = express.Router();
  var users = [
    { name: 'james' },
    { name: 'ryan' },
    { name: 'saoirse' },
    { name : 'sarai' }
  ];
/* GET users listing. */
router.get('/', function(req, res, next) {
  res.send(users);
});

module.exports = router;