var express = require('express');
var router = express.Router();

router.get('/', function(req, res, next) {
    var clientName = req.query.name;
    res.render('greeting', { username : clientName});
});

module.exports = router;